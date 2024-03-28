
package net.mcreator.fnaffrights.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

import net.mcreator.fnaffrights.init.FnafFrightsModTabs;

public class CoinItem extends Item {
	public CoinItem() {
		super(new Item.Properties().tab(FnafFrightsModTabs.TAB_BITS_AND_PIECES_MISC).stacksTo(64).rarity(Rarity.COMMON));
	}
}
