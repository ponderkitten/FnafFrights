package net.mcreator.fnaffrights.procedures;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.level.block.state.properties.Property;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.sounds.SoundSource;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;

import net.mcreator.fnaffrights.init.FnafFrightsModBlocks;
import net.mcreator.fnaffrights.FnafFrightsMod;

import java.util.Map;

public class ClosetFoxyAttackBlockAddedProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if (world instanceof Level _level) {
			if (!_level.isClientSide()) {
				_level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("fnaf_frights:closetfoxy")), SoundSource.NEUTRAL, 1, 1);
			} else {
				_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("fnaf_frights:closetfoxy")), SoundSource.NEUTRAL, 1, 1, false);
			}
		}
		FnafFrightsMod.queueServerWork(120, () -> {
			if ((world.getBlockState(new BlockPos(x, y, z))).getBlock() == FnafFrightsModBlocks.CLOSET_FOXY_ATTACK.get()) {
				{
					BlockPos _bp = new BlockPos(x, y, z);
					BlockState _bs = FnafFrightsModBlocks.CLOSET_FOXY.get().defaultBlockState();
					BlockState _bso = world.getBlockState(_bp);
					for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
						Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
						if (_property != null && _bs.getValue(_property) != null)
							try {
								_bs = _bs.setValue(_property, (Comparable) entry.getValue());
							} catch (Exception e) {
							}
					}
					world.setBlock(_bp, _bs, 3);
				}
			}
		});
	}
}
