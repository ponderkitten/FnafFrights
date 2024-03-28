
package net.mcreator.fnaffrights.item;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.item.RecordItem;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;
import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnaffrights.init.FnafFrightsModTabs;

public class F2N2Item extends RecordItem {
	public F2N2Item() {
		super(0, () -> ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("fnaf_frights:f2n2")), new Item.Properties().tab(FnafFrightsModTabs.TAB_CASSETTE_TAPES).stacksTo(1).rarity(Rarity.RARE), 100);
	}
}
