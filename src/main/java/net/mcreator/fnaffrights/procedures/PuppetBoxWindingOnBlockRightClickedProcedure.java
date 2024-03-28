package net.mcreator.fnaffrights.procedures;

import net.minecraft.world.entity.Entity;

public class PuppetBoxWindingOnBlockRightClickedProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (!entity.level.isClientSide())
			entity.discard();
	}
}
