package net.mcreator.fnaffrights.procedures;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.sounds.SoundSource;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;

import net.mcreator.fnaffrights.FnafFrightsMod;

public class ToyCarnieShowtimeUpdateTickProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if (0 < (world instanceof Level _lvl_getIndPow ? _lvl_getIndPow.getBestNeighborSignal(new BlockPos(x, y, z)) : 0)) {
			if ((world.getBlockState(new BlockPos(x, y + 1, z))).getBlock() == Blocks.AIR) {
				world.setBlock(new BlockPos(x, y + 1, z), Blocks.BARRIER.defaultBlockState(), 3);
				FnafFrightsMod.queueServerWork(Math.round(Mth.nextInt(RandomSource.create(), 200, 600)), () -> {
					world.setBlock(new BlockPos(x, y + 1, z), Blocks.AIR.defaultBlockState(), 3);
					if (Math.round(Mth.nextInt(RandomSource.create(), 1, 2)) == 1) {
						if (world instanceof Level _level) {
							if (!_level.isClientSide()) {
								_level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("fnaf_frights:funforfamily")), SoundSource.NEUTRAL, 1, 1);
							} else {
								_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("fnaf_frights:funforfamily")), SoundSource.NEUTRAL, 1, 1, false);
							}
						}
					} else {
						if (Math.round(Mth.nextInt(RandomSource.create(), 1, 2)) == 1) {
							if (world instanceof Level _level) {
								if (!_level.isClientSide()) {
									_level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("fnaf_frights:youruglymug")), SoundSource.NEUTRAL, 1, 1);
								} else {
									_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("fnaf_frights:youruglymug")), SoundSource.NEUTRAL, 1, 1, false);
								}
							}
						} else {
							if (world instanceof Level _level) {
								if (!_level.isClientSide()) {
									_level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("fnaf_frights:steprightup")), SoundSource.NEUTRAL, 1, 1);
								} else {
									_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("fnaf_frights:steprightup")), SoundSource.NEUTRAL, 1, 1, false);
								}
							}
						}
					}
				});
			}
		} else if (true) {
			world.setBlock(new BlockPos(x, y + 1, z), Blocks.AIR.defaultBlockState(), 3);
		}
	}
}
