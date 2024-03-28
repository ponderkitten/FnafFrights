
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.fnaffrights.init;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;

public class FnafFrightsModTabs {
	public static CreativeModeTab TAB_BITSANDPIECES;
	public static CreativeModeTab TAB_BITS_AND_PIECES_MISC;
	public static CreativeModeTab TAB_ANIMATRONIC_BLOCKS;
	public static CreativeModeTab TAB_TOY_PIECES;
	public static CreativeModeTab TAB_CASSETTE_TAPES;
	public static CreativeModeTab TAB_SHOWTIMES;
	public static CreativeModeTab TAB_ANGLED_SHOWTIMES;
	public static CreativeModeTab TAB_CLASSIC_ANIMATRONICS;
	public static CreativeModeTab TAB_HOLIDAY_SHOWTIMES;

	public static void load() {
		TAB_BITSANDPIECES = new CreativeModeTab("tabbitsandpieces") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(FnafFrightsModBlocks.FOXY_HEAD.get());
			}

			@Override
			public boolean hasSearchBar() {
				return false;
			}
		};
		TAB_BITS_AND_PIECES_MISC = new CreativeModeTab("tabbits_and_pieces_misc") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(FnafFrightsModBlocks.PUPPET_IN_THE_BOX_BLOCK.get());
			}

			@Override
			public boolean hasSearchBar() {
				return false;
			}
		};
		TAB_ANIMATRONIC_BLOCKS = new CreativeModeTab("tabanimatronic_blocks") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(FnafFrightsModBlocks.FREDDY_HEAD.get());
			}

			@Override
			public boolean hasSearchBar() {
				return false;
			}
		};
		TAB_TOY_PIECES = new CreativeModeTab("tabtoy_pieces") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(FnafFrightsModBlocks.TOY_BONNIE_HEAD.get());
			}

			@Override
			public boolean hasSearchBar() {
				return false;
			}
		};
		TAB_CASSETTE_TAPES = new CreativeModeTab("tabcassette_tapes") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(FnafFrightsModItems.MYSTERIOUS_CASSETTE_TAPE.get());
			}

			@Override
			public boolean hasSearchBar() {
				return false;
			}
		};
		TAB_SHOWTIMES = new CreativeModeTab("tabshowtimes") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(FnafFrightsModBlocks.TOY_CHICA_SHOWTIME.get());
			}

			@Override
			public boolean hasSearchBar() {
				return false;
			}
		};
		TAB_ANGLED_SHOWTIMES = new CreativeModeTab("tabangled_showtimes") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(FnafFrightsModBlocks.FREDDY_FAZBEAR_SHOWTIME.get());
			}

			@Override
			public boolean hasSearchBar() {
				return false;
			}
		};
		TAB_CLASSIC_ANIMATRONICS = new CreativeModeTab("tabclassic_animatronics") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(FnafFrightsModBlocks.BONNIE_BUNNIE_HEAD.get());
			}

			@Override
			public boolean hasSearchBar() {
				return false;
			}
		};
		TAB_HOLIDAY_SHOWTIMES = new CreativeModeTab("tabholiday_showtimes") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(FnafFrightsModItems.HOLIDAY_TAB.get());
			}

			@Override
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
}
