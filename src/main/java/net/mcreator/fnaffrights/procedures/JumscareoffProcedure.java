package net.mcreator.fnaffrights.procedures;

import net.minecraftforge.eventbus.api.Event;

import javax.annotation.Nullable;

public class JumscareoffProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		{
			int _value = 0;
			BlockPos _pos = new BlockPos(x, y, z);
			BlockState _bs = world.getBlockState(_pos);
			if (_bs.getBlock().getStateDefinition().getProperty("animation") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
				world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
		}
	}
}
