package net.mcreator.fnaffrights.procedures;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;

import net.mcreator.fnaffrights.init.FnafFrightsModItems;

public class FreddyBoxActiveOnBlockRightClickedProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == FnafFrightsModItems.HAND_CRANK.get()) {
			if (entity instanceof Player _player)
				_player.giveExperiencePoints(1);
		}
	}
}
