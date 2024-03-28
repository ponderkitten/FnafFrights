package net.mcreator.fnaffrights.procedures;

import net.minecraft.world.level.block.state.properties.IntegerProperty;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.core.BlockPos;

import net.mcreator.fnaffrights.init.FnafFrightsModItems;

public class FullanimatronicRightClickedProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		BlockState box = Blocks.AIR.defaultBlockState();
		if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == FnafFrightsModItems.HAND_CRANK.get()
				&& (entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).getItem() == ItemStack.EMPTY.getItem()) {
			box = (world.getBlockState(new BlockPos(x, y, z)));
			world.setBlock(new BlockPos(x, y, z), Blocks.AIR.defaultBlockState(), 3);
			world.setBlock(new BlockPos(x, y, z), box, 3);
			{
				int _value = (int) Mth.nextDouble(RandomSource.create(), -1, 7);
				BlockPos _pos = new BlockPos(x, y, z);
				BlockState _bs = world.getBlockState(_pos);
				if (_bs.getBlock().getStateDefinition().getProperty("animation") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
					world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
			}
		} else if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == FnafFrightsModItems.HAND_CRANK.get()
				&& (entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).getItem() == Blocks.WHITE_WOOL.asItem()) {
			box = (world.getBlockState(new BlockPos(x, y, z)));
			world.setBlock(new BlockPos(x, y, z), Blocks.AIR.defaultBlockState(), 3);
			world.setBlock(new BlockPos(x, y, z), box, 3);
			{
				int _value = 0;
				BlockPos _pos = new BlockPos(x, y, z);
				BlockState _bs = world.getBlockState(_pos);
				if (_bs.getBlock().getStateDefinition().getProperty("animation") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
					world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
			}
		} else if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == FnafFrightsModItems.HAND_CRANK.get()
				&& (entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).getItem() == Blocks.ORANGE_WOOL.asItem()) {
			box = (world.getBlockState(new BlockPos(x, y, z)));
			world.setBlock(new BlockPos(x, y, z), Blocks.AIR.defaultBlockState(), 3);
			world.setBlock(new BlockPos(x, y, z), box, 3);
			{
				int _value = 1;
				BlockPos _pos = new BlockPos(x, y, z);
				BlockState _bs = world.getBlockState(_pos);
				if (_bs.getBlock().getStateDefinition().getProperty("animation") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
					world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
			}
		} else if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == FnafFrightsModItems.HAND_CRANK.get()
				&& (entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).getItem() == Blocks.MAGENTA_WOOL.asItem()) {
			box = (world.getBlockState(new BlockPos(x, y, z)));
			world.setBlock(new BlockPos(x, y, z), Blocks.AIR.defaultBlockState(), 3);
			world.setBlock(new BlockPos(x, y, z), box, 3);
			{
				int _value = 2;
				BlockPos _pos = new BlockPos(x, y, z);
				BlockState _bs = world.getBlockState(_pos);
				if (_bs.getBlock().getStateDefinition().getProperty("animation") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
					world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
			}
		} else if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == FnafFrightsModItems.HAND_CRANK.get()
				&& (entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).getItem() == Blocks.LIGHT_BLUE_WOOL.asItem()) {
			box = (world.getBlockState(new BlockPos(x, y, z)));
			world.setBlock(new BlockPos(x, y, z), Blocks.AIR.defaultBlockState(), 3);
			world.setBlock(new BlockPos(x, y, z), box, 3);
			{
				int _value = 3;
				BlockPos _pos = new BlockPos(x, y, z);
				BlockState _bs = world.getBlockState(_pos);
				if (_bs.getBlock().getStateDefinition().getProperty("animation") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
					world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
			}
		} else if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == FnafFrightsModItems.HAND_CRANK.get()
				&& (entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).getItem() == Blocks.YELLOW_WOOL.asItem()) {
			box = (world.getBlockState(new BlockPos(x, y, z)));
			world.setBlock(new BlockPos(x, y, z), Blocks.AIR.defaultBlockState(), 3);
			world.setBlock(new BlockPos(x, y, z), box, 3);
			{
				int _value = 4;
				BlockPos _pos = new BlockPos(x, y, z);
				BlockState _bs = world.getBlockState(_pos);
				if (_bs.getBlock().getStateDefinition().getProperty("animation") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
					world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
			}
		} else if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == FnafFrightsModItems.HAND_CRANK.get()
				&& (entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).getItem() == Blocks.LIME_WOOL.asItem()) {
			box = (world.getBlockState(new BlockPos(x, y, z)));
			world.setBlock(new BlockPos(x, y, z), Blocks.AIR.defaultBlockState(), 3);
			world.setBlock(new BlockPos(x, y, z), box, 3);
			{
				int _value = 5;
				BlockPos _pos = new BlockPos(x, y, z);
				BlockState _bs = world.getBlockState(_pos);
				if (_bs.getBlock().getStateDefinition().getProperty("animation") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
					world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
			}
		} else if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == FnafFrightsModItems.HAND_CRANK.get()
				&& (entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).getItem() == Blocks.PINK_WOOL.asItem()) {
			box = (world.getBlockState(new BlockPos(x, y, z)));
			world.setBlock(new BlockPos(x, y, z), Blocks.AIR.defaultBlockState(), 3);
			world.setBlock(new BlockPos(x, y, z), box, 3);
			{
				int _value = 6;
				BlockPos _pos = new BlockPos(x, y, z);
				BlockState _bs = world.getBlockState(_pos);
				if (_bs.getBlock().getStateDefinition().getProperty("animation") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
					world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
			}
		} else if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == FnafFrightsModItems.HAND_CRANK.get()
				&& (entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).getItem() == Blocks.GRAY_WOOL.asItem()) {
			box = (world.getBlockState(new BlockPos(x, y, z)));
			world.setBlock(new BlockPos(x, y, z), Blocks.AIR.defaultBlockState(), 3);
			world.setBlock(new BlockPos(x, y, z), box, 3);
			{
				int _value = 7;
				BlockPos _pos = new BlockPos(x, y, z);
				BlockState _bs = world.getBlockState(_pos);
				if (_bs.getBlock().getStateDefinition().getProperty("animation") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
					world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
			}
		} else if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == FnafFrightsModItems.HAND_CRANK.get()
				&& (entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).getItem() == Blocks.LIGHT_GRAY_WOOL.asItem()) {
			box = (world.getBlockState(new BlockPos(x, y, z)));
			world.setBlock(new BlockPos(x, y, z), Blocks.AIR.defaultBlockState(), 3);
			world.setBlock(new BlockPos(x, y, z), box, 3);
			{
				int _value = 8;
				BlockPos _pos = new BlockPos(x, y, z);
				BlockState _bs = world.getBlockState(_pos);
				if (_bs.getBlock().getStateDefinition().getProperty("animation") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
					world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
			}
		} else if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == FnafFrightsModItems.HAND_CRANK.get()
				&& (entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).getItem() == Blocks.CYAN_WOOL.asItem()) {
			box = (world.getBlockState(new BlockPos(x, y, z)));
			world.setBlock(new BlockPos(x, y, z), Blocks.AIR.defaultBlockState(), 3);
			world.setBlock(new BlockPos(x, y, z), box, 3);
			{
				int _value = 9;
				BlockPos _pos = new BlockPos(x, y, z);
				BlockState _bs = world.getBlockState(_pos);
				if (_bs.getBlock().getStateDefinition().getProperty("animation") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
					world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
			}
		} else if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == FnafFrightsModItems.HAND_CRANK.get()
				&& (entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).getItem() == Blocks.PURPLE_WOOL.asItem()) {
			box = (world.getBlockState(new BlockPos(x, y, z)));
			world.setBlock(new BlockPos(x, y, z), Blocks.AIR.defaultBlockState(), 3);
			world.setBlock(new BlockPos(x, y, z), box, 3);
			{
				int _value = 10;
				BlockPos _pos = new BlockPos(x, y, z);
				BlockState _bs = world.getBlockState(_pos);
				if (_bs.getBlock().getStateDefinition().getProperty("animation") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
					world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
			}
		} else if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == FnafFrightsModItems.HAND_CRANK.get()
				&& (entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).getItem() == Blocks.BLUE_WOOL.asItem()) {
			box = (world.getBlockState(new BlockPos(x, y, z)));
			world.setBlock(new BlockPos(x, y, z), Blocks.AIR.defaultBlockState(), 3);
			world.setBlock(new BlockPos(x, y, z), box, 3);
			{
				int _value = 11;
				BlockPos _pos = new BlockPos(x, y, z);
				BlockState _bs = world.getBlockState(_pos);
				if (_bs.getBlock().getStateDefinition().getProperty("animation") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
					world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
			}
		} else if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == FnafFrightsModItems.HAND_CRANK.get()
				&& (entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).getItem() == Blocks.BROWN_WOOL.asItem()) {
			box = (world.getBlockState(new BlockPos(x, y, z)));
			world.setBlock(new BlockPos(x, y, z), Blocks.AIR.defaultBlockState(), 3);
			world.setBlock(new BlockPos(x, y, z), box, 3);
			{
				int _value = 12;
				BlockPos _pos = new BlockPos(x, y, z);
				BlockState _bs = world.getBlockState(_pos);
				if (_bs.getBlock().getStateDefinition().getProperty("animation") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
					world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
			}
		} else if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == FnafFrightsModItems.HAND_CRANK.get()
				&& (entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).getItem() == Blocks.GREEN_WOOL.asItem()) {
			box = (world.getBlockState(new BlockPos(x, y, z)));
			world.setBlock(new BlockPos(x, y, z), Blocks.AIR.defaultBlockState(), 3);
			world.setBlock(new BlockPos(x, y, z), box, 3);
			{
				int _value = 13;
				BlockPos _pos = new BlockPos(x, y, z);
				BlockState _bs = world.getBlockState(_pos);
				if (_bs.getBlock().getStateDefinition().getProperty("animation") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
					world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
			}
		} else if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == FnafFrightsModItems.HAND_CRANK.get()
				&& (entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).getItem() == Blocks.RED_WOOL.asItem()) {
			box = (world.getBlockState(new BlockPos(x, y, z)));
			world.setBlock(new BlockPos(x, y, z), Blocks.AIR.defaultBlockState(), 3);
			world.setBlock(new BlockPos(x, y, z), box, 3);
			{
				int _value = 14;
				BlockPos _pos = new BlockPos(x, y, z);
				BlockState _bs = world.getBlockState(_pos);
				if (_bs.getBlock().getStateDefinition().getProperty("animation") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
					world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
			}
		} else if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == FnafFrightsModItems.HAND_CRANK.get()
				&& (entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).getItem() == Blocks.BLACK_WOOL.asItem()) {
			box = (world.getBlockState(new BlockPos(x, y, z)));
			world.setBlock(new BlockPos(x, y, z), Blocks.AIR.defaultBlockState(), 3);
			world.setBlock(new BlockPos(x, y, z), box, 3);
			{
				int _value = 15;
				BlockPos _pos = new BlockPos(x, y, z);
				BlockState _bs = world.getBlockState(_pos);
				if (_bs.getBlock().getStateDefinition().getProperty("animation") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
					world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
			}
		} else if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == FnafFrightsModItems.HAND_CRANK.get()
				&& (entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).getItem() == Blocks.WHITE_TERRACOTTA.asItem()) {
			box = (world.getBlockState(new BlockPos(x, y, z)));
			world.setBlock(new BlockPos(x, y, z), Blocks.AIR.defaultBlockState(), 3);
			world.setBlock(new BlockPos(x, y, z), box, 3);
			{
				int _value = 16;
				BlockPos _pos = new BlockPos(x, y, z);
				BlockState _bs = world.getBlockState(_pos);
				if (_bs.getBlock().getStateDefinition().getProperty("animation") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
					world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
			}
		} else if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == FnafFrightsModItems.HAND_CRANK.get()
				&& (entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).getItem() == Blocks.ORANGE_TERRACOTTA.asItem()) {
			box = (world.getBlockState(new BlockPos(x, y, z)));
			world.setBlock(new BlockPos(x, y, z), Blocks.AIR.defaultBlockState(), 3);
			world.setBlock(new BlockPos(x, y, z), box, 3);
			{
				int _value = 17;
				BlockPos _pos = new BlockPos(x, y, z);
				BlockState _bs = world.getBlockState(_pos);
				if (_bs.getBlock().getStateDefinition().getProperty("animation") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
					world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
			}
		} else if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == FnafFrightsModItems.HAND_CRANK.get()
				&& (entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).getItem() == Blocks.MAGENTA_TERRACOTTA.asItem()) {
			box = (world.getBlockState(new BlockPos(x, y, z)));
			world.setBlock(new BlockPos(x, y, z), Blocks.AIR.defaultBlockState(), 3);
			world.setBlock(new BlockPos(x, y, z), box, 3);
			{
				int _value = 18;
				BlockPos _pos = new BlockPos(x, y, z);
				BlockState _bs = world.getBlockState(_pos);
				if (_bs.getBlock().getStateDefinition().getProperty("animation") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
					world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
			}
		}
	}
}
