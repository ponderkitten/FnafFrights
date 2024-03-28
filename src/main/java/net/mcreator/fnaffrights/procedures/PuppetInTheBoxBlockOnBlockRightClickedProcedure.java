package net.mcreator.fnaffrights.procedures;

import net.minecraft.world.level.block.state.properties.Property;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.core.BlockPos;

import net.mcreator.fnaffrights.init.FnafFrightsModItems;
import net.mcreator.fnaffrights.init.FnafFrightsModBlocks;

import java.util.Map;

public class PuppetInTheBoxBlockOnBlockRightClickedProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		boolean test = false;
		String test1 = "";
		ItemStack gf = ItemStack.EMPTY;
		BlockState test3 = Blocks.AIR.defaultBlockState();
		BlockState box = Blocks.AIR.defaultBlockState();
		double winds = 0;
		double random = 0;
		double tes2 = 0;
		double gift = 0;
		if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == FnafFrightsModItems.TICKET.get()) {
			((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)).shrink(1);
			if ((world instanceof Level _lvl4 && _lvl4.isDay()) == true || (world instanceof Level _lvl_isPow ? _lvl_isPow.hasNeighborSignal(new BlockPos(x, y, z)) : false) == true) {
				{
					BlockPos _bp = new BlockPos(x, y, z);
					BlockState _bs = FnafFrightsModBlocks.PUPPET_BOX_GIFT.get().defaultBlockState();
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
			} else {
				{
					BlockPos _bp = new BlockPos(x, y, z);
					BlockState _bs = FnafFrightsModBlocks.PUPPET_BOX_WINDING.get().defaultBlockState();
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
		}
	}
}
