package net.mcreator.fnaffrights.procedures;

import net.minecraft.world.level.block.state.properties.Property;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.core.BlockPos;

import net.mcreator.fnaffrights.init.FnafFrightsModBlocks;

import java.util.Map;

public class GeneratorUpdateTickProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if ((world instanceof Level _lvl_getIndPow ? _lvl_getIndPow.getBestNeighborSignal(new BlockPos(x, y, z)) : 0) == 0) {
			{
				BlockPos _bp = new BlockPos(x, y, z);
				BlockState _bs = FnafFrightsModBlocks.GENERATOR.get().defaultBlockState();
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
		} else if ((world instanceof Level _lvl_getIndPow ? _lvl_getIndPow.getBestNeighborSignal(new BlockPos(x, y, z)) : 0) == 1) {
			{
				BlockPos _bp = new BlockPos(x, y, z);
				BlockState _bs = FnafFrightsModBlocks.GENERATOR_1.get().defaultBlockState();
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
		} else if ((world instanceof Level _lvl_getIndPow ? _lvl_getIndPow.getBestNeighborSignal(new BlockPos(x, y, z)) : 0) == 2) {
			{
				BlockPos _bp = new BlockPos(x, y, z);
				BlockState _bs = FnafFrightsModBlocks.GENERATOR_2.get().defaultBlockState();
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
		} else if ((world instanceof Level _lvl_getIndPow ? _lvl_getIndPow.getBestNeighborSignal(new BlockPos(x, y, z)) : 0) >= 3 && (world instanceof Level _lvl_getIndPow ? _lvl_getIndPow.getBestNeighborSignal(new BlockPos(x, y, z)) : 0) < 5) {
			{
				BlockPos _bp = new BlockPos(x, y, z);
				BlockState _bs = FnafFrightsModBlocks.GENERATOR_3.get().defaultBlockState();
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
		} else if ((world instanceof Level _lvl_getIndPow ? _lvl_getIndPow.getBestNeighborSignal(new BlockPos(x, y, z)) : 0) >= 5 && (world instanceof Level _lvl_getIndPow ? _lvl_getIndPow.getBestNeighborSignal(new BlockPos(x, y, z)) : 0) < 7) {
			{
				BlockPos _bp = new BlockPos(x, y, z);
				BlockState _bs = FnafFrightsModBlocks.GENERATOR_4.get().defaultBlockState();
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
		} else if ((world instanceof Level _lvl_getIndPow ? _lvl_getIndPow.getBestNeighborSignal(new BlockPos(x, y, z)) : 0) >= 7 && (world instanceof Level _lvl_getIndPow ? _lvl_getIndPow.getBestNeighborSignal(new BlockPos(x, y, z)) : 0) < 10) {
			{
				BlockPos _bp = new BlockPos(x, y, z);
				BlockState _bs = FnafFrightsModBlocks.GENERATOR_5.get().defaultBlockState();
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
		} else if ((world instanceof Level _lvl_getIndPow ? _lvl_getIndPow.getBestNeighborSignal(new BlockPos(x, y, z)) : 0) >= 10 && (world instanceof Level _lvl_getIndPow ? _lvl_getIndPow.getBestNeighborSignal(new BlockPos(x, y, z)) : 0) < 12) {
			{
				BlockPos _bp = new BlockPos(x, y, z);
				BlockState _bs = FnafFrightsModBlocks.GENERATOR_6.get().defaultBlockState();
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
		} else if ((world instanceof Level _lvl_getIndPow ? _lvl_getIndPow.getBestNeighborSignal(new BlockPos(x, y, z)) : 0) >= 12 && (world instanceof Level _lvl_getIndPow ? _lvl_getIndPow.getBestNeighborSignal(new BlockPos(x, y, z)) : 0) < 14) {
			{
				BlockPos _bp = new BlockPos(x, y, z);
				BlockState _bs = FnafFrightsModBlocks.GENERATOR_7.get().defaultBlockState();
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
		} else if ((world instanceof Level _lvl_getIndPow ? _lvl_getIndPow.getBestNeighborSignal(new BlockPos(x, y, z)) : 0) >= 14) {
			{
				BlockPos _bp = new BlockPos(x, y, z);
				BlockState _bs = FnafFrightsModBlocks.GENERATOR_8.get().defaultBlockState();
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
