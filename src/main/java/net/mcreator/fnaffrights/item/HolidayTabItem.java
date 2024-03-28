
package net.mcreator.fnaffrights.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.network.chat.Component;

import java.util.List;

public class HolidayTabItem extends Item {
	public HolidayTabItem() {
		super(new Item.Properties().tab(null).stacksTo(1).rarity(Rarity.COMMON).food((new FoodProperties.Builder()).nutrition(0).saturationMod(0f).alwaysEat().meat().build()));
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, world, list, flag);
		list.add(Component.literal("Just to show"));
	}
}
