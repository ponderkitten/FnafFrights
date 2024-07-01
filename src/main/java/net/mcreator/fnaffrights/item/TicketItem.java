
package net.mcreator.fnaffrights.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class TicketItem extends Item {
	public TicketItem() {
		super(new Item.Properties().tab(FnafFrightsModTabs.TAB_BITS_AND_PIECES_MISC).stacksTo(64).rarity(Rarity.COMMON));
	}
}
