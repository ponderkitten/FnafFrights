
package net.mcreator.fnaffrights.item;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.item.RecordItem;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;
import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnaffrights.init.FnafFrightsModTabs;

public class FnafMovieExtendedItem extends RecordItem {
	public FnafMovieExtendedItem() {
		super(15, () -> ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("fnaf_frights:fnafmovieextended")), new Item.Properties().tab(FnafFrightsModTabs.TAB_BITS_AND_PIECES_MISC).stacksTo(1).rarity(Rarity.RARE), 100);
	}
}
