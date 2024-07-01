
package net.mcreator.fnaffrights.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.network.chat.Component;

import java.util.List;

public class HandCrankItem extends Item {
	public HandCrankItem() {
		super(new Item.Properties().tab(FnafFrightsModTabs.TAB_BITS_AND_PIECES_MISC).stacksTo(1).rarity(Rarity.COMMON));
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, world, list, flag);
		list.add(Component.literal("Used to cycle animations of blocks"));
		list.add(Component.literal("Hold different colored wool in your offhand to choose specific animation"));
		list.add(Component.literal("The statue animatronic blocks have more animations than wool so to go above use the first 3 colored terracotta"));
	}
}
