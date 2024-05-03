
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.fnaffrights.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.Block;

import net.mcreator.fnaffrights.block.entity.YellowBearTorsoTileEntity;
import net.mcreator.fnaffrights.block.entity.YellowBearRightLegTileEntity;
import net.mcreator.fnaffrights.block.entity.YellowBearRightArmTileEntity;
import net.mcreator.fnaffrights.block.entity.YellowBearLeftLegTileEntity;
import net.mcreator.fnaffrights.block.entity.YellowBearLeftArmTileEntity;
import net.mcreator.fnaffrights.block.entity.YellowBearHeadTileEntity;
import net.mcreator.fnaffrights.block.entity.WitheredGoldenFreddyTorsoTileEntity;
import net.mcreator.fnaffrights.block.entity.WitheredGoldenFreddyRightLegTileEntity;
import net.mcreator.fnaffrights.block.entity.WitheredGoldenFreddyRightArmTileEntity;
import net.mcreator.fnaffrights.block.entity.WitheredGoldenFreddyLeftLegTileEntity;
import net.mcreator.fnaffrights.block.entity.WitheredGoldenFreddyLeftArmTileEntity;
import net.mcreator.fnaffrights.block.entity.WitheredGoldenFreddyHeadTileEntity;
import net.mcreator.fnaffrights.block.entity.WitheredGoldenFreddyBlcokTileEntity;
import net.mcreator.fnaffrights.block.entity.WitheredFreddyTorsoTileEntity;
import net.mcreator.fnaffrights.block.entity.WitheredFreddyRightLegTileEntity;
import net.mcreator.fnaffrights.block.entity.WitheredFreddyRightArmTileEntity;
import net.mcreator.fnaffrights.block.entity.WitheredFreddyLeftLegTileEntity;
import net.mcreator.fnaffrights.block.entity.WitheredFreddyLeftArmTileEntity;
import net.mcreator.fnaffrights.block.entity.WitheredFreddyHeadTileEntity;
import net.mcreator.fnaffrights.block.entity.WitheredFreddyBlockTileEntity;
import net.mcreator.fnaffrights.block.entity.WitheredFoxyTorsoTileEntity;
import net.mcreator.fnaffrights.block.entity.WitheredFoxyRightArmTileEntity;
import net.mcreator.fnaffrights.block.entity.WitheredFoxyLegTileEntity;
import net.mcreator.fnaffrights.block.entity.WitheredFoxyLeftLegTileEntity;
import net.mcreator.fnaffrights.block.entity.WitheredFoxyLeftArmTileEntity;
import net.mcreator.fnaffrights.block.entity.WitheredFoxyHeadTileEntity;
import net.mcreator.fnaffrights.block.entity.WitheredFoxyBlockTileEntity;
import net.mcreator.fnaffrights.block.entity.WitheredChicaTorsoTileEntity;
import net.mcreator.fnaffrights.block.entity.WitheredChicaRightLegTileEntity;
import net.mcreator.fnaffrights.block.entity.WitheredChicaRightArmTileEntity;
import net.mcreator.fnaffrights.block.entity.WitheredChicaLeftLegTileEntity;
import net.mcreator.fnaffrights.block.entity.WitheredChicaLeftArmTileEntity;
import net.mcreator.fnaffrights.block.entity.WitheredChicaHeadTileEntity;
import net.mcreator.fnaffrights.block.entity.WitheredChicaBlockTileEntity;
import net.mcreator.fnaffrights.block.entity.WitheredBonnieTorsoTileEntity;
import net.mcreator.fnaffrights.block.entity.WitheredBonnieRightLegTileEntity;
import net.mcreator.fnaffrights.block.entity.WitheredBonnieRightArmTileEntity;
import net.mcreator.fnaffrights.block.entity.WitheredBonnieLeftLegTileEntity;
import net.mcreator.fnaffrights.block.entity.WitheredBonnieHeadTileEntity;
import net.mcreator.fnaffrights.block.entity.WitheredBonnieBlockTileEntity;
import net.mcreator.fnaffrights.block.entity.VasstronicTileEntity;
import net.mcreator.fnaffrights.block.entity.VassilisTileEntity;
import net.mcreator.fnaffrights.block.entity.VassilisATileEntity;
import net.mcreator.fnaffrights.block.entity.UnBonnieShowtimeTileEntity;
import net.mcreator.fnaffrights.block.entity.UnBonnieShowtimeActiveTileEntity;
import net.mcreator.fnaffrights.block.entity.ToyFreddyTorsoTileEntity;
import net.mcreator.fnaffrights.block.entity.ToyFreddyShowtimeTileEntity;
import net.mcreator.fnaffrights.block.entity.ToyFreddyShowtimeActiveTileEntity;
import net.mcreator.fnaffrights.block.entity.ToyFreddyRightLegTileEntity;
import net.mcreator.fnaffrights.block.entity.ToyFreddyRightArmTileEntity;
import net.mcreator.fnaffrights.block.entity.ToyFreddyLeftLegTileEntity;
import net.mcreator.fnaffrights.block.entity.ToyFreddyLeftArmTileEntity;
import net.mcreator.fnaffrights.block.entity.ToyFreddyHeadTileEntity;
import net.mcreator.fnaffrights.block.entity.ToyFreddyBlockTileEntity;
import net.mcreator.fnaffrights.block.entity.ToyFoxyTorsoTileEntity;
import net.mcreator.fnaffrights.block.entity.ToyFoxyShowtimeTileEntity;
import net.mcreator.fnaffrights.block.entity.ToyFoxyShowtimeActiveTileEntity;
import net.mcreator.fnaffrights.block.entity.ToyFoxyRightLegTileEntity;
import net.mcreator.fnaffrights.block.entity.ToyFoxyRightArmTileEntity;
import net.mcreator.fnaffrights.block.entity.ToyFoxyLeftLegTileEntity;
import net.mcreator.fnaffrights.block.entity.ToyFoxyLeftArmTileEntity;
import net.mcreator.fnaffrights.block.entity.ToyFoxyHeadTileEntity;
import net.mcreator.fnaffrights.block.entity.ToyFoxyBlockTileEntity;
import net.mcreator.fnaffrights.block.entity.ToyChicaTorsoTileEntity;
import net.mcreator.fnaffrights.block.entity.ToyChicaShowtimeTileEntity;
import net.mcreator.fnaffrights.block.entity.ToyChicaShowtimeActiveTileEntity;
import net.mcreator.fnaffrights.block.entity.ToyChicaRightLegTileEntity;
import net.mcreator.fnaffrights.block.entity.ToyChicaRightArmTileEntity;
import net.mcreator.fnaffrights.block.entity.ToyChicaLeftLegTileEntity;
import net.mcreator.fnaffrights.block.entity.ToyChicaLeftArmTileEntity;
import net.mcreator.fnaffrights.block.entity.ToyChicaHeadTileEntity;
import net.mcreator.fnaffrights.block.entity.ToyChicaBlockTileEntity;
import net.mcreator.fnaffrights.block.entity.ToyCarnieShowtimeTileEntity;
import net.mcreator.fnaffrights.block.entity.ToyCarnieActiveTileEntity;
import net.mcreator.fnaffrights.block.entity.ToyBonnieTorsoTileEntity;
import net.mcreator.fnaffrights.block.entity.ToyBonnieShowtimeTileEntity;
import net.mcreator.fnaffrights.block.entity.ToyBonnieShowtimeActiveTileEntity;
import net.mcreator.fnaffrights.block.entity.ToyBonnieRightLegTileEntity;
import net.mcreator.fnaffrights.block.entity.ToyBonnieRightArmTileEntity;
import net.mcreator.fnaffrights.block.entity.ToyBonnieLeftLegTileEntity;
import net.mcreator.fnaffrights.block.entity.ToyBonnieLeftArmTileEntity;
import net.mcreator.fnaffrights.block.entity.ToyBonnieHeadTileEntity;
import net.mcreator.fnaffrights.block.entity.ToyBonnieBlockTileEntity;
import net.mcreator.fnaffrights.block.entity.SpringtrapShowtimeTileEntity;
import net.mcreator.fnaffrights.block.entity.SpringtrapShowtimeActiveTileEntity;
import net.mcreator.fnaffrights.block.entity.SpringbonnieShowtimeTileEntity;
import net.mcreator.fnaffrights.block.entity.SpringBonnieTorsoTileEntity;
import net.mcreator.fnaffrights.block.entity.SpringBonnieShowtimeActiveTileEntity;
import net.mcreator.fnaffrights.block.entity.SpringBonnieRightLegTileEntity;
import net.mcreator.fnaffrights.block.entity.SpringBonnieRightArmTileEntity;
import net.mcreator.fnaffrights.block.entity.SpringBonnieLeftLEgTileEntity;
import net.mcreator.fnaffrights.block.entity.SpringBonnieLeftArmTileEntity;
import net.mcreator.fnaffrights.block.entity.SpringBonnieHeadTileEntity;
import net.mcreator.fnaffrights.block.entity.SpringBonnieBunnieTorsoTileEntity;
import net.mcreator.fnaffrights.block.entity.SpringBonnieBunnieShowtimeTileEntity;
import net.mcreator.fnaffrights.block.entity.SpringBonnieBunnieShowtimeActiveTileEntity;
import net.mcreator.fnaffrights.block.entity.SpringBonnieBunnieRightLegTileEntity;
import net.mcreator.fnaffrights.block.entity.SpringBonnieBunnieRightArmTileEntity;
import net.mcreator.fnaffrights.block.entity.SpringBonnieBunnieLeftLegTileEntity;
import net.mcreator.fnaffrights.block.entity.SpringBonnieBunnieLeftArmTileEntity;
import net.mcreator.fnaffrights.block.entity.SpringBonnieBunnieHeadTileEntity;
import net.mcreator.fnaffrights.block.entity.PuppetwalldecorTileEntity;
import net.mcreator.fnaffrights.block.entity.PuppetInTheBoxBlockTileEntity;
import net.mcreator.fnaffrights.block.entity.PuppetBoxWindingTileEntity;
import net.mcreator.fnaffrights.block.entity.PuppetBoxSlumpedTileEntity;
import net.mcreator.fnaffrights.block.entity.PuppetBoxJumpscareTileEntity;
import net.mcreator.fnaffrights.block.entity.PuppetBoxGiftTileEntity;
import net.mcreator.fnaffrights.block.entity.OffsetToyFreddyShowtimeTileEntity;
import net.mcreator.fnaffrights.block.entity.OffsetToyFreddyActiveTileEntity;
import net.mcreator.fnaffrights.block.entity.OffsetToyFoxyShowtimeTileEntity;
import net.mcreator.fnaffrights.block.entity.OffsetToyFoxyActiveTileEntity;
import net.mcreator.fnaffrights.block.entity.OffsetSpringBonnieShowtimeTileEntity;
import net.mcreator.fnaffrights.block.entity.OffsetSpringBonnieActiveTileEntity;
import net.mcreator.fnaffrights.block.entity.OffsetFreddyShowtimeTileEntity;
import net.mcreator.fnaffrights.block.entity.OffsetFreddyFazbearShowtimeTileEntity;
import net.mcreator.fnaffrights.block.entity.OffsetFreddyFazbearActiveTileEntity;
import net.mcreator.fnaffrights.block.entity.OffsetFreddyActiveTileEntity;
import net.mcreator.fnaffrights.block.entity.OffsetFredBearShowtimeTileEntity;
import net.mcreator.fnaffrights.block.entity.OffsetFredBearActiveTileEntity;
import net.mcreator.fnaffrights.block.entity.OffsetFoxyShowtimeTileEntity;
import net.mcreator.fnaffrights.block.entity.OffsetFoxyPirateShowtimeTileEntity;
import net.mcreator.fnaffrights.block.entity.OffsetFoxyPirateActiveTileEntity;
import net.mcreator.fnaffrights.block.entity.OffsetFoxyActiveTileEntity;
import net.mcreator.fnaffrights.block.entity.OffsetFixedFoxyShowtimeTileEntity;
import net.mcreator.fnaffrights.block.entity.OffsetFixedFoxyActiveTileEntity;
import net.mcreator.fnaffrights.block.entity.GoldenFreddyShowtimeTileEntity;
import net.mcreator.fnaffrights.block.entity.GoldenFreddyShowtimeActiveTileEntity;
import net.mcreator.fnaffrights.block.entity.GlitchtrapShowtimeTileEntity;
import net.mcreator.fnaffrights.block.entity.GlitchtrapShowtimeActiveTileEntity;
import net.mcreator.fnaffrights.block.entity.GlitchBonnieTorsoTileEntity;
import net.mcreator.fnaffrights.block.entity.GlitchBonnieHeadTileEntity;
import net.mcreator.fnaffrights.block.entity.GeneratorTileEntity;
import net.mcreator.fnaffrights.block.entity.Generator8TileEntity;
import net.mcreator.fnaffrights.block.entity.Generator7TileEntity;
import net.mcreator.fnaffrights.block.entity.Generator6TileEntity;
import net.mcreator.fnaffrights.block.entity.Generator5TileEntity;
import net.mcreator.fnaffrights.block.entity.Generator4TileEntity;
import net.mcreator.fnaffrights.block.entity.Generator3TileEntity;
import net.mcreator.fnaffrights.block.entity.Generator2TileEntity;
import net.mcreator.fnaffrights.block.entity.Generator1TileEntity;
import net.mcreator.fnaffrights.block.entity.FreddyTorsoTileEntity;
import net.mcreator.fnaffrights.block.entity.FreddyShowtimeTileEntity;
import net.mcreator.fnaffrights.block.entity.FreddyShowtimeActiveTileEntity;
import net.mcreator.fnaffrights.block.entity.FreddyRightLegTileEntity;
import net.mcreator.fnaffrights.block.entity.FreddyRightArmTileEntity;
import net.mcreator.fnaffrights.block.entity.FreddyLeftLegTileEntity;
import net.mcreator.fnaffrights.block.entity.FreddyLeftArmTileEntity;
import net.mcreator.fnaffrights.block.entity.FreddyHeadTileEntity;
import net.mcreator.fnaffrights.block.entity.FreddyFazbearheadTileEntity;
import net.mcreator.fnaffrights.block.entity.FreddyFazbeareftLegTileEntity;
import net.mcreator.fnaffrights.block.entity.FreddyFazbearTorsoTileEntity;
import net.mcreator.fnaffrights.block.entity.FreddyFazbearShowtimeTileEntity;
import net.mcreator.fnaffrights.block.entity.FreddyFazbearShowtimeActiveTileEntity;
import net.mcreator.fnaffrights.block.entity.FreddyFazbearRightLegTileEntity;
import net.mcreator.fnaffrights.block.entity.FreddyFazbearRightArmTileEntity;
import net.mcreator.fnaffrights.block.entity.FreddyFazbearLeftArmTileEntity;
import net.mcreator.fnaffrights.block.entity.FreddyBoxTileEntity;
import net.mcreator.fnaffrights.block.entity.FreddyBoxSpinTileEntity;
import net.mcreator.fnaffrights.block.entity.FreddyBoxActiveTileEntity;
import net.mcreator.fnaffrights.block.entity.FreddyBlockTileEntity;
import net.mcreator.fnaffrights.block.entity.FredbearShowtimeTileEntity;
import net.mcreator.fnaffrights.block.entity.FredbearShowtimeActiveTileEntity;
import net.mcreator.fnaffrights.block.entity.FredBearTorsoTileEntity;
import net.mcreator.fnaffrights.block.entity.FredBearRightLegTileEntity;
import net.mcreator.fnaffrights.block.entity.FredBearRightArmTileEntity;
import net.mcreator.fnaffrights.block.entity.FredBearLeftLegTileEntity;
import net.mcreator.fnaffrights.block.entity.FredBearLeftArmTileEntity;
import net.mcreator.fnaffrights.block.entity.FredBearHeadTileEntity;
import net.mcreator.fnaffrights.block.entity.FoxyTorsoTileEntity;
import net.mcreator.fnaffrights.block.entity.FoxyShowtimeTileEntity;
import net.mcreator.fnaffrights.block.entity.FoxyShowtimeActiveTileEntity;
import net.mcreator.fnaffrights.block.entity.FoxyRightLegTileEntity;
import net.mcreator.fnaffrights.block.entity.FoxyRightArmTileEntity;
import net.mcreator.fnaffrights.block.entity.FoxyPirateTorsoTileEntity;
import net.mcreator.fnaffrights.block.entity.FoxyPirateShowtimeTileEntity;
import net.mcreator.fnaffrights.block.entity.FoxyPirateShowtimeActiveTileEntity;
import net.mcreator.fnaffrights.block.entity.FoxyPirateRightLegTileEntity;
import net.mcreator.fnaffrights.block.entity.FoxyPirateRightArmTileEntity;
import net.mcreator.fnaffrights.block.entity.FoxyPirateLeftLegTileEntity;
import net.mcreator.fnaffrights.block.entity.FoxyPirateLeftArmTileEntity;
import net.mcreator.fnaffrights.block.entity.FoxyPirateHeadTileEntity;
import net.mcreator.fnaffrights.block.entity.FoxyLegTileEntity;
import net.mcreator.fnaffrights.block.entity.FoxyLeftArmTileEntity;
import net.mcreator.fnaffrights.block.entity.FoxyHeadTileEntity;
import net.mcreator.fnaffrights.block.entity.FoxyBlockTileEntity;
import net.mcreator.fnaffrights.block.entity.FixedFoxyShowtimeTileEntity;
import net.mcreator.fnaffrights.block.entity.FixedFoxyShowtimeActiveTileEntity;
import net.mcreator.fnaffrights.block.entity.FazbearLogoTileEntity;
import net.mcreator.fnaffrights.block.entity.FazbearLogo2TileEntity;
import net.mcreator.fnaffrights.block.entity.Enod02BonnieHeadTileEntity;
import net.mcreator.fnaffrights.block.entity.Endo02TorsoTileEntity;
import net.mcreator.fnaffrights.block.entity.Endo02RightLegTileEntity;
import net.mcreator.fnaffrights.block.entity.Endo02RightArmTileEntity;
import net.mcreator.fnaffrights.block.entity.Endo02LeftLegTileEntity;
import net.mcreator.fnaffrights.block.entity.Endo02LeftArmTileEntity;
import net.mcreator.fnaffrights.block.entity.Endo02HeadTileEntity;
import net.mcreator.fnaffrights.block.entity.Endo02FoxyHeadTileEntity;
import net.mcreator.fnaffrights.block.entity.Endo02ChicaHeadTileEntity;
import net.mcreator.fnaffrights.block.entity.Endo02BlockTileEntity;
import net.mcreator.fnaffrights.block.entity.Endo01TorsoTileEntity;
import net.mcreator.fnaffrights.block.entity.Endo01RightLegTileEntity;
import net.mcreator.fnaffrights.block.entity.Endo01RightArmTileEntity;
import net.mcreator.fnaffrights.block.entity.Endo01LeftLegTileEntity;
import net.mcreator.fnaffrights.block.entity.Endo01LeftArmTileEntity;
import net.mcreator.fnaffrights.block.entity.Endo01HeadTileEntity;
import net.mcreator.fnaffrights.block.entity.EmptyboxTileEntity;
import net.mcreator.fnaffrights.block.entity.ClassicChicaShowtimeTileEntity;
import net.mcreator.fnaffrights.block.entity.ClassicChicaShowtimeActiveTileEntity;
import net.mcreator.fnaffrights.block.entity.ChristmasFreddyTileEntity;
import net.mcreator.fnaffrights.block.entity.ChristmasFreddyATileEntity;
import net.mcreator.fnaffrights.block.entity.ChristmasFoxyTileEntity;
import net.mcreator.fnaffrights.block.entity.ChristmasFoxyATileEntity;
import net.mcreator.fnaffrights.block.entity.ChristmasChicaTileEntity;
import net.mcreator.fnaffrights.block.entity.ChristmasChicaATileEntity;
import net.mcreator.fnaffrights.block.entity.ChristmasBonnieTileEntity;
import net.mcreator.fnaffrights.block.entity.ChristmasBonnieATileEntity;
import net.mcreator.fnaffrights.block.entity.ChicaTorsoTileEntity;
import net.mcreator.fnaffrights.block.entity.ChicaShowtimeTileEntity;
import net.mcreator.fnaffrights.block.entity.ChicaShowtimeActiveTileEntity;
import net.mcreator.fnaffrights.block.entity.ChicaRightLegTileEntity;
import net.mcreator.fnaffrights.block.entity.ChicaRightArmTileEntity;
import net.mcreator.fnaffrights.block.entity.ChicaLeftLegTileEntity;
import net.mcreator.fnaffrights.block.entity.ChicaLeftArmTileEntity;
import net.mcreator.fnaffrights.block.entity.ChicaHeadTileEntity;
import net.mcreator.fnaffrights.block.entity.ChicaChickenTorsoTileEntity;
import net.mcreator.fnaffrights.block.entity.ChicaChickenRightLegTileEntity;
import net.mcreator.fnaffrights.block.entity.ChicaChickenRightArmTileEntity;
import net.mcreator.fnaffrights.block.entity.ChicaChickenLeftLegTileEntity;
import net.mcreator.fnaffrights.block.entity.ChicaChickenLeftArmTileEntity;
import net.mcreator.fnaffrights.block.entity.ChicaChickenHeadTileEntity;
import net.mcreator.fnaffrights.block.entity.ChicaBlockTileEntity;
import net.mcreator.fnaffrights.block.entity.CaptainFoxyStatueTileEntity;
import net.mcreator.fnaffrights.block.entity.BurntToyFreddyJumpscareTileEntity;
import net.mcreator.fnaffrights.block.entity.BurntToyChicaTileEntity;
import net.mcreator.fnaffrights.block.entity.BurntToyBonnieJumpscareTileEntity;
import net.mcreator.fnaffrights.block.entity.BrokenFoxyPirateTorsoTileEntity;
import net.mcreator.fnaffrights.block.entity.BrokenFoxyPirateRightLegTileEntity;
import net.mcreator.fnaffrights.block.entity.BrokenFoxyPirateRightArmTileEntity;
import net.mcreator.fnaffrights.block.entity.BrokenFoxyPirateLeftLegTileEntity;
import net.mcreator.fnaffrights.block.entity.BrokenFoxyPirateLeftArmTileEntity;
import net.mcreator.fnaffrights.block.entity.BrokenFoxyPirateHeadTileEntity;
import net.mcreator.fnaffrights.block.entity.BonnieTorsoTileEntity;
import net.mcreator.fnaffrights.block.entity.BonnieShowtimeTileEntity;
import net.mcreator.fnaffrights.block.entity.BonnieShowtimeActiveTileEntity;
import net.mcreator.fnaffrights.block.entity.BonnieRightLegTileEntity;
import net.mcreator.fnaffrights.block.entity.BonnieRightArmTileEntity;
import net.mcreator.fnaffrights.block.entity.BonnieMaskBlockTileEntity;
import net.mcreator.fnaffrights.block.entity.BonnieLeftLegTileEntity;
import net.mcreator.fnaffrights.block.entity.BonnieLeftArmTileEntity;
import net.mcreator.fnaffrights.block.entity.BonnieHeadTileEntity;
import net.mcreator.fnaffrights.block.entity.BonnieBunnieTorsoTileEntity;
import net.mcreator.fnaffrights.block.entity.BonnieBunnieShowtimeTileEntity;
import net.mcreator.fnaffrights.block.entity.BonnieBunnieShowtimeActiveTileEntity;
import net.mcreator.fnaffrights.block.entity.BonnieBunnieRightLegTileEntity;
import net.mcreator.fnaffrights.block.entity.BonnieBunnieRightArmTileEntity;
import net.mcreator.fnaffrights.block.entity.BonnieBunnieLeftLegTileEntity;
import net.mcreator.fnaffrights.block.entity.BonnieBunnieLeftArmTileEntity;
import net.mcreator.fnaffrights.block.entity.BonnieBunnieHeadTileEntity;
import net.mcreator.fnaffrights.block.entity.BonnieBlockTileEntity;
import net.mcreator.fnaffrights.block.entity.BlloonBoyStatueTileEntity;
import net.mcreator.fnaffrights.block.entity.AngledToyCarnieTileEntity;
import net.mcreator.fnaffrights.block.entity.AngledBlloonBoyStatueTileEntity;
import net.mcreator.fnaffrights.block.entity.AYellowBearShowtimeTileEntity;
import net.mcreator.fnaffrights.block.entity.AYellowBearActiveTileEntity;
import net.mcreator.fnaffrights.block.entity.AToyFreddyShowtimeTileEntity;
import net.mcreator.fnaffrights.block.entity.AToyFreddyActiveTileEntity;
import net.mcreator.fnaffrights.block.entity.AToyFoxyShowtimeTileEntity;
import net.mcreator.fnaffrights.block.entity.AToyFoxyActiveTileEntity;
import net.mcreator.fnaffrights.block.entity.AToyChicaShowtimeTileEntity;
import net.mcreator.fnaffrights.block.entity.AToyChicaActiveTileEntity;
import net.mcreator.fnaffrights.block.entity.AToyBonnieShowtimeTileEntity;
import net.mcreator.fnaffrights.block.entity.AToyBonnieActiveTileEntity;
import net.mcreator.fnaffrights.block.entity.ASpringtrapShowtimeTileEntity;
import net.mcreator.fnaffrights.block.entity.ASpringtrapActiveTileEntity;
import net.mcreator.fnaffrights.block.entity.ASpringBonnieShowtimeTileEntity;
import net.mcreator.fnaffrights.block.entity.ASpringBonnieBunnieShowtimeTileEntity;
import net.mcreator.fnaffrights.block.entity.ASpringBonnieBunnieActiveTileEntity;
import net.mcreator.fnaffrights.block.entity.ASpringBonnieActiveTileEntity;
import net.mcreator.fnaffrights.block.entity.AShavenBonnieShowtimeTileEntity;
import net.mcreator.fnaffrights.block.entity.AShavenBonnieActiveTileEntity;
import net.mcreator.fnaffrights.block.entity.AGltichBonnieShowtimeTileEntity;
import net.mcreator.fnaffrights.block.entity.AGlitchBonnieActiveTileEntity;
import net.mcreator.fnaffrights.block.entity.AFreddyShowtimeTileEntity;
import net.mcreator.fnaffrights.block.entity.AFreddyFazbearShowtimeTileEntity;
import net.mcreator.fnaffrights.block.entity.AFreddyFazbearActiveTileEntity;
import net.mcreator.fnaffrights.block.entity.AFreddyActiveTileEntity;
import net.mcreator.fnaffrights.block.entity.AFredbearShowtimeTileEntity;
import net.mcreator.fnaffrights.block.entity.AFredbearActiveTileEntity;
import net.mcreator.fnaffrights.block.entity.AFoxyShowtimeTileEntity;
import net.mcreator.fnaffrights.block.entity.AFoxyPirateShowtimeTileEntity;
import net.mcreator.fnaffrights.block.entity.AFoxyPirateActiveTileEntity;
import net.mcreator.fnaffrights.block.entity.AFoxyActiveTileEntity;
import net.mcreator.fnaffrights.block.entity.AFixedFoxyShowtimeTileEntity;
import net.mcreator.fnaffrights.block.entity.AFixedFoxyActiveTileEntity;
import net.mcreator.fnaffrights.block.entity.AChicaShowtimeTileEntity;
import net.mcreator.fnaffrights.block.entity.AChicaChickenShowtimeTileEntity;
import net.mcreator.fnaffrights.block.entity.AChicaChickenActiveTileEntity;
import net.mcreator.fnaffrights.block.entity.AChicaActiveTileEntity;
import net.mcreator.fnaffrights.block.entity.ABonnieShowtimeTileEntity;
import net.mcreator.fnaffrights.block.entity.ABonnieBunnyActiveTileEntity;
import net.mcreator.fnaffrights.block.entity.ABonnieBunnieShowtimeTileEntity;
import net.mcreator.fnaffrights.block.entity.ABonnieActiveTileEntity;
import net.mcreator.fnaffrights.FnafFrightsMod;

public class FnafFrightsModBlockEntities {
	public static final DeferredRegister<BlockEntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCK_ENTITY_TYPES, FnafFrightsMod.MODID);
	public static final RegistryObject<BlockEntityType<FoxyHeadTileEntity>> FOXY_HEAD = REGISTRY.register("foxy_head", () -> BlockEntityType.Builder.of(FoxyHeadTileEntity::new, FnafFrightsModBlocks.FOXY_HEAD.get()).build(null));
	public static final RegistryObject<BlockEntityType<FoxyLeftArmTileEntity>> FOXY_LEFT_ARM = REGISTRY.register("foxy_left_arm", () -> BlockEntityType.Builder.of(FoxyLeftArmTileEntity::new, FnafFrightsModBlocks.FOXY_LEFT_ARM.get()).build(null));
	public static final RegistryObject<BlockEntityType<FoxyTorsoTileEntity>> FOXY_TORSO = REGISTRY.register("foxy_torso", () -> BlockEntityType.Builder.of(FoxyTorsoTileEntity::new, FnafFrightsModBlocks.FOXY_TORSO.get()).build(null));
	public static final RegistryObject<BlockEntityType<FoxyRightArmTileEntity>> FOXY_RIGHT_ARM = REGISTRY.register("foxy_right_arm",
			() -> BlockEntityType.Builder.of(FoxyRightArmTileEntity::new, FnafFrightsModBlocks.FOXY_RIGHT_ARM.get()).build(null));
	public static final RegistryObject<BlockEntityType<FoxyLegTileEntity>> FOXY_LEG = REGISTRY.register("foxy_leg", () -> BlockEntityType.Builder.of(FoxyLegTileEntity::new, FnafFrightsModBlocks.FOXY_LEG.get()).build(null));
	public static final RegistryObject<BlockEntityType<FoxyRightLegTileEntity>> FOXY_RIGHT_LEG = REGISTRY.register("foxy_right_leg",
			() -> BlockEntityType.Builder.of(FoxyRightLegTileEntity::new, FnafFrightsModBlocks.FOXY_RIGHT_LEG.get()).build(null));
	public static final RegistryObject<BlockEntityType<WitheredFoxyHeadTileEntity>> WITHERED_FOXY_HEAD = REGISTRY.register("withered_foxy_head",
			() -> BlockEntityType.Builder.of(WitheredFoxyHeadTileEntity::new, FnafFrightsModBlocks.WITHERED_FOXY_HEAD.get()).build(null));
	public static final RegistryObject<BlockEntityType<WitheredFoxyTorsoTileEntity>> WITHERED_FOXY_TORSO = REGISTRY.register("withered_foxy_torso",
			() -> BlockEntityType.Builder.of(WitheredFoxyTorsoTileEntity::new, FnafFrightsModBlocks.WITHERED_FOXY_TORSO.get()).build(null));
	public static final RegistryObject<BlockEntityType<WitheredFoxyLeftLegTileEntity>> WITHERED_FOXY_LEFT_LEG = REGISTRY.register("withered_foxy_left_leg",
			() -> BlockEntityType.Builder.of(WitheredFoxyLeftLegTileEntity::new, FnafFrightsModBlocks.WITHERED_FOXY_LEFT_LEG.get()).build(null));
	public static final RegistryObject<BlockEntityType<WitheredFoxyLegTileEntity>> WITHERED_FOXY_LEG = REGISTRY.register("withered_foxy_leg",
			() -> BlockEntityType.Builder.of(WitheredFoxyLegTileEntity::new, FnafFrightsModBlocks.WITHERED_FOXY_LEG.get()).build(null));
	public static final RegistryObject<BlockEntityType<FreddyHeadTileEntity>> FREDDY_HEAD = REGISTRY.register("freddy_head", () -> BlockEntityType.Builder.of(FreddyHeadTileEntity::new, FnafFrightsModBlocks.FREDDY_HEAD.get()).build(null));
	public static final RegistryObject<BlockEntityType<FreddyLeftArmTileEntity>> FREDDY_LEFT_ARM = REGISTRY.register("freddy_left_arm",
			() -> BlockEntityType.Builder.of(FreddyLeftArmTileEntity::new, FnafFrightsModBlocks.FREDDY_LEFT_ARM.get()).build(null));
	public static final RegistryObject<BlockEntityType<FreddyTorsoTileEntity>> FREDDY_TORSO = REGISTRY.register("freddy_torso", () -> BlockEntityType.Builder.of(FreddyTorsoTileEntity::new, FnafFrightsModBlocks.FREDDY_TORSO.get()).build(null));
	public static final RegistryObject<BlockEntityType<FreddyRightArmTileEntity>> FREDDY_RIGHT_ARM = REGISTRY.register("freddy_right_arm",
			() -> BlockEntityType.Builder.of(FreddyRightArmTileEntity::new, FnafFrightsModBlocks.FREDDY_RIGHT_ARM.get()).build(null));
	public static final RegistryObject<BlockEntityType<FreddyLeftLegTileEntity>> FREDDY_LEFT_LEG = REGISTRY.register("freddy_left_leg",
			() -> BlockEntityType.Builder.of(FreddyLeftLegTileEntity::new, FnafFrightsModBlocks.FREDDY_LEFT_LEG.get()).build(null));
	public static final RegistryObject<BlockEntityType<FreddyRightLegTileEntity>> FREDDY_RIGHT_LEG = REGISTRY.register("freddy_right_leg",
			() -> BlockEntityType.Builder.of(FreddyRightLegTileEntity::new, FnafFrightsModBlocks.FREDDY_RIGHT_LEG.get()).build(null));
	public static final RegistryObject<BlockEntityType<WitheredFreddyHeadTileEntity>> WITHERED_FREDDY_HEAD = REGISTRY.register("withered_freddy_head",
			() -> BlockEntityType.Builder.of(WitheredFreddyHeadTileEntity::new, FnafFrightsModBlocks.WITHERED_FREDDY_HEAD.get()).build(null));
	public static final RegistryObject<BlockEntityType<WitheredFreddyLeftArmTileEntity>> WITHERED_FREDDY_LEFT_ARM = REGISTRY.register("withered_freddy_left_arm",
			() -> BlockEntityType.Builder.of(WitheredFreddyLeftArmTileEntity::new, FnafFrightsModBlocks.WITHERED_FREDDY_LEFT_ARM.get()).build(null));
	public static final RegistryObject<BlockEntityType<WitheredFreddyTorsoTileEntity>> WITHERED_FREDDY_TORSO = REGISTRY.register("withered_freddy_torso",
			() -> BlockEntityType.Builder.of(WitheredFreddyTorsoTileEntity::new, FnafFrightsModBlocks.WITHERED_FREDDY_TORSO.get()).build(null));
	public static final RegistryObject<BlockEntityType<WitheredFreddyRightArmTileEntity>> WITHERED_FREDDY_RIGHT_ARM = REGISTRY.register("withered_freddy_right_arm",
			() -> BlockEntityType.Builder.of(WitheredFreddyRightArmTileEntity::new, FnafFrightsModBlocks.WITHERED_FREDDY_RIGHT_ARM.get()).build(null));
	public static final RegistryObject<BlockEntityType<WitheredFreddyLeftLegTileEntity>> WITHERED_FREDDY_LEFT_LEG = REGISTRY.register("withered_freddy_left_leg",
			() -> BlockEntityType.Builder.of(WitheredFreddyLeftLegTileEntity::new, FnafFrightsModBlocks.WITHERED_FREDDY_LEFT_LEG.get()).build(null));
	public static final RegistryObject<BlockEntityType<WitheredFreddyRightLegTileEntity>> WITHERED_FREDDY_RIGHT_LEG = REGISTRY.register("withered_freddy_right_leg",
			() -> BlockEntityType.Builder.of(WitheredFreddyRightLegTileEntity::new, FnafFrightsModBlocks.WITHERED_FREDDY_RIGHT_LEG.get()).build(null));
	public static final RegistryObject<BlockEntityType<WitheredGoldenFreddyHeadTileEntity>> WITHERED_GOLDEN_FREDDY_HEAD = REGISTRY.register("withered_golden_freddy_head",
			() -> BlockEntityType.Builder.of(WitheredGoldenFreddyHeadTileEntity::new, FnafFrightsModBlocks.WITHERED_GOLDEN_FREDDY_HEAD.get()).build(null));
	public static final RegistryObject<BlockEntityType<WitheredGoldenFreddyLeftArmTileEntity>> WITHERED_GOLDEN_FREDDY_LEFT_ARM = REGISTRY.register("withered_golden_freddy_left_arm",
			() -> BlockEntityType.Builder.of(WitheredGoldenFreddyLeftArmTileEntity::new, FnafFrightsModBlocks.WITHERED_GOLDEN_FREDDY_LEFT_ARM.get()).build(null));
	public static final RegistryObject<BlockEntityType<WitheredGoldenFreddyTorsoTileEntity>> WITHERED_GOLDEN_FREDDY_TORSO = REGISTRY.register("withered_golden_freddy_torso",
			() -> BlockEntityType.Builder.of(WitheredGoldenFreddyTorsoTileEntity::new, FnafFrightsModBlocks.WITHERED_GOLDEN_FREDDY_TORSO.get()).build(null));
	public static final RegistryObject<BlockEntityType<WitheredGoldenFreddyRightArmTileEntity>> WITHERED_GOLDEN_FREDDY_RIGHT_ARM = REGISTRY.register("withered_golden_freddy_right_arm",
			() -> BlockEntityType.Builder.of(WitheredGoldenFreddyRightArmTileEntity::new, FnafFrightsModBlocks.WITHERED_GOLDEN_FREDDY_RIGHT_ARM.get()).build(null));
	public static final RegistryObject<BlockEntityType<WitheredGoldenFreddyLeftLegTileEntity>> WITHERED_GOLDEN_FREDDY_LEFT_LEG = REGISTRY.register("withered_golden_freddy_left_leg",
			() -> BlockEntityType.Builder.of(WitheredGoldenFreddyLeftLegTileEntity::new, FnafFrightsModBlocks.WITHERED_GOLDEN_FREDDY_LEFT_LEG.get()).build(null));
	public static final RegistryObject<BlockEntityType<WitheredGoldenFreddyRightLegTileEntity>> WITHERED_GOLDEN_FREDDY_RIGHT_LEG = REGISTRY.register("withered_golden_freddy_right_leg",
			() -> BlockEntityType.Builder.of(WitheredGoldenFreddyRightLegTileEntity::new, FnafFrightsModBlocks.WITHERED_GOLDEN_FREDDY_RIGHT_LEG.get()).build(null));
	public static final RegistryObject<BlockEntityType<PuppetInTheBoxBlockTileEntity>> PUPPET_IN_THE_BOX_BLOCK = REGISTRY.register("puppet_in_the_box_block",
			() -> BlockEntityType.Builder.of(PuppetInTheBoxBlockTileEntity::new, FnafFrightsModBlocks.PUPPET_IN_THE_BOX_BLOCK.get()).build(null));
	public static final RegistryObject<BlockEntityType<WitheredFoxyLeftArmTileEntity>> WITHERED_FOXY_LEFT_ARM = REGISTRY.register("withered_foxy_left_arm",
			() -> BlockEntityType.Builder.of(WitheredFoxyLeftArmTileEntity::new, FnafFrightsModBlocks.WITHERED_FOXY_LEFT_ARM.get()).build(null));
	public static final RegistryObject<BlockEntityType<WitheredFoxyRightArmTileEntity>> WITHERED_FOXY_RIGHT_ARM = REGISTRY.register("withered_foxy_right_arm",
			() -> BlockEntityType.Builder.of(WitheredFoxyRightArmTileEntity::new, FnafFrightsModBlocks.WITHERED_FOXY_RIGHT_ARM.get()).build(null));
	public static final RegistryObject<BlockEntityType<WitheredBonnieHeadTileEntity>> WITHERED_BONNIE_HEAD = REGISTRY.register("withered_bonnie_head",
			() -> BlockEntityType.Builder.of(WitheredBonnieHeadTileEntity::new, FnafFrightsModBlocks.WITHERED_BONNIE_HEAD.get()).build(null));
	public static final RegistryObject<BlockEntityType<WitheredBonnieRightArmTileEntity>> WITHERED_BONNIE_RIGHT_ARM = REGISTRY.register("withered_bonnie_right_arm",
			() -> BlockEntityType.Builder.of(WitheredBonnieRightArmTileEntity::new, FnafFrightsModBlocks.WITHERED_BONNIE_RIGHT_ARM.get()).build(null));
	public static final RegistryObject<BlockEntityType<WitheredBonnieTorsoTileEntity>> WITHERED_BONNIE_TORSO = REGISTRY.register("withered_bonnie_torso",
			() -> BlockEntityType.Builder.of(WitheredBonnieTorsoTileEntity::new, FnafFrightsModBlocks.WITHERED_BONNIE_TORSO.get()).build(null));
	public static final RegistryObject<BlockEntityType<WitheredBonnieLeftLegTileEntity>> WITHERED_BONNIE_LEFT_LEG = REGISTRY.register("withered_bonnie_left_leg",
			() -> BlockEntityType.Builder.of(WitheredBonnieLeftLegTileEntity::new, FnafFrightsModBlocks.WITHERED_BONNIE_LEFT_LEG.get()).build(null));
	public static final RegistryObject<BlockEntityType<WitheredBonnieRightLegTileEntity>> WITHERED_BONNIE_RIGHT_LEG = REGISTRY.register("withered_bonnie_right_leg",
			() -> BlockEntityType.Builder.of(WitheredBonnieRightLegTileEntity::new, FnafFrightsModBlocks.WITHERED_BONNIE_RIGHT_LEG.get()).build(null));
	public static final RegistryObject<BlockEntityType<BonnieLeftLegTileEntity>> BONNIE_LEFT_LEG = REGISTRY.register("bonnie_left_leg",
			() -> BlockEntityType.Builder.of(BonnieLeftLegTileEntity::new, FnafFrightsModBlocks.BONNIE_LEFT_LEG.get()).build(null));
	public static final RegistryObject<BlockEntityType<BonnieTorsoTileEntity>> BONNIE_TORSO = REGISTRY.register("bonnie_torso", () -> BlockEntityType.Builder.of(BonnieTorsoTileEntity::new, FnafFrightsModBlocks.BONNIE_TORSO.get()).build(null));
	public static final RegistryObject<BlockEntityType<BonnieLeftArmTileEntity>> BONNIE_LEFT_ARM = REGISTRY.register("bonnie_left_arm",
			() -> BlockEntityType.Builder.of(BonnieLeftArmTileEntity::new, FnafFrightsModBlocks.BONNIE_LEFT_ARM.get()).build(null));
	public static final RegistryObject<BlockEntityType<BonnieRightArmTileEntity>> BONNIE_RIGHT_ARM = REGISTRY.register("bonnie_right_arm",
			() -> BlockEntityType.Builder.of(BonnieRightArmTileEntity::new, FnafFrightsModBlocks.BONNIE_RIGHT_ARM.get()).build(null));
	public static final RegistryObject<BlockEntityType<BonnieRightLegTileEntity>> BONNIE_RIGHT_LEG = REGISTRY.register("bonnie_right_leg",
			() -> BlockEntityType.Builder.of(BonnieRightLegTileEntity::new, FnafFrightsModBlocks.BONNIE_RIGHT_LEG.get()).build(null));
	public static final RegistryObject<BlockEntityType<BonnieHeadTileEntity>> BONNIE_HEAD = REGISTRY.register("bonnie_head", () -> BlockEntityType.Builder.of(BonnieHeadTileEntity::new, FnafFrightsModBlocks.BONNIE_HEAD.get()).build(null));
	public static final RegistryObject<BlockEntityType<BonnieMaskBlockTileEntity>> BONNIE_MASK_BLOCK = REGISTRY.register("bonnie_mask_block",
			() -> BlockEntityType.Builder.of(BonnieMaskBlockTileEntity::new, FnafFrightsModBlocks.BONNIE_MASK_BLOCK.get()).build(null));
	public static final RegistryObject<BlockEntityType<WitheredChicaRightArmTileEntity>> WITHERED_CHICA_RIGHT_ARM = REGISTRY.register("withered_chica_right_arm",
			() -> BlockEntityType.Builder.of(WitheredChicaRightArmTileEntity::new, FnafFrightsModBlocks.WITHERED_CHICA_RIGHT_ARM.get()).build(null));
	public static final RegistryObject<BlockEntityType<WitheredChicaRightLegTileEntity>> WITHERED_CHICA_RIGHT_LEG = REGISTRY.register("withered_chica_right_leg",
			() -> BlockEntityType.Builder.of(WitheredChicaRightLegTileEntity::new, FnafFrightsModBlocks.WITHERED_CHICA_RIGHT_LEG.get()).build(null));
	public static final RegistryObject<BlockEntityType<WitheredChicaHeadTileEntity>> WITHERED_CHICA_HEAD = REGISTRY.register("withered_chica_head",
			() -> BlockEntityType.Builder.of(WitheredChicaHeadTileEntity::new, FnafFrightsModBlocks.WITHERED_CHICA_HEAD.get()).build(null));
	public static final RegistryObject<BlockEntityType<WitheredChicaLeftLegTileEntity>> WITHERED_CHICA_LEFT_LEG = REGISTRY.register("withered_chica_left_leg",
			() -> BlockEntityType.Builder.of(WitheredChicaLeftLegTileEntity::new, FnafFrightsModBlocks.WITHERED_CHICA_LEFT_LEG.get()).build(null));
	public static final RegistryObject<BlockEntityType<WitheredChicaTorsoTileEntity>> WITHERED_CHICA_TORSO = REGISTRY.register("withered_chica_torso",
			() -> BlockEntityType.Builder.of(WitheredChicaTorsoTileEntity::new, FnafFrightsModBlocks.WITHERED_CHICA_TORSO.get()).build(null));
	public static final RegistryObject<BlockEntityType<WitheredChicaLeftArmTileEntity>> WITHERED_CHICA_LEFT_ARM = REGISTRY.register("withered_chica_left_arm",
			() -> BlockEntityType.Builder.of(WitheredChicaLeftArmTileEntity::new, FnafFrightsModBlocks.WITHERED_CHICA_LEFT_ARM.get()).build(null));
	public static final RegistryObject<BlockEntityType<ChicaRightArmTileEntity>> CHICA_RIGHT_ARM = REGISTRY.register("chica_right_arm",
			() -> BlockEntityType.Builder.of(ChicaRightArmTileEntity::new, FnafFrightsModBlocks.CHICA_RIGHT_ARM.get()).build(null));
	public static final RegistryObject<BlockEntityType<ChicaRightLegTileEntity>> CHICA_RIGHT_LEG = REGISTRY.register("chica_right_leg",
			() -> BlockEntityType.Builder.of(ChicaRightLegTileEntity::new, FnafFrightsModBlocks.CHICA_RIGHT_LEG.get()).build(null));
	public static final RegistryObject<BlockEntityType<ChicaHeadTileEntity>> CHICA_HEAD = REGISTRY.register("chica_head", () -> BlockEntityType.Builder.of(ChicaHeadTileEntity::new, FnafFrightsModBlocks.CHICA_HEAD.get()).build(null));
	public static final RegistryObject<BlockEntityType<ChicaLeftArmTileEntity>> CHICA_LEFT_ARM = REGISTRY.register("chica_left_arm",
			() -> BlockEntityType.Builder.of(ChicaLeftArmTileEntity::new, FnafFrightsModBlocks.CHICA_LEFT_ARM.get()).build(null));
	public static final RegistryObject<BlockEntityType<ChicaTorsoTileEntity>> CHICA_TORSO = REGISTRY.register("chica_torso", () -> BlockEntityType.Builder.of(ChicaTorsoTileEntity::new, FnafFrightsModBlocks.CHICA_TORSO.get()).build(null));
	public static final RegistryObject<BlockEntityType<ChicaLeftLegTileEntity>> CHICA_LEFT_LEG = REGISTRY.register("chica_left_leg",
			() -> BlockEntityType.Builder.of(ChicaLeftLegTileEntity::new, FnafFrightsModBlocks.CHICA_LEFT_LEG.get()).build(null));
	public static final RegistryObject<BlockEntityType<ToyBonnieTorsoTileEntity>> TOY_BONNIE_TORSO = REGISTRY.register("toy_bonnie_torso",
			() -> BlockEntityType.Builder.of(ToyBonnieTorsoTileEntity::new, FnafFrightsModBlocks.TOY_BONNIE_TORSO.get()).build(null));
	public static final RegistryObject<BlockEntityType<ToyBonnieHeadTileEntity>> TOY_BONNIE_HEAD = REGISTRY.register("toy_bonnie_head",
			() -> BlockEntityType.Builder.of(ToyBonnieHeadTileEntity::new, FnafFrightsModBlocks.TOY_BONNIE_HEAD.get()).build(null));
	public static final RegistryObject<BlockEntityType<ToyBonnieRightArmTileEntity>> TOY_BONNIE_RIGHT_ARM = REGISTRY.register("toy_bonnie_right_arm",
			() -> BlockEntityType.Builder.of(ToyBonnieRightArmTileEntity::new, FnafFrightsModBlocks.TOY_BONNIE_RIGHT_ARM.get()).build(null));
	public static final RegistryObject<BlockEntityType<ToyBonnieRightLegTileEntity>> TOY_BONNIE_RIGHT_LEG = REGISTRY.register("toy_bonnie_right_leg",
			() -> BlockEntityType.Builder.of(ToyBonnieRightLegTileEntity::new, FnafFrightsModBlocks.TOY_BONNIE_RIGHT_LEG.get()).build(null));
	public static final RegistryObject<BlockEntityType<ToyBonnieLeftArmTileEntity>> TOY_BONNIE_LEFT_ARM = REGISTRY.register("toy_bonnie_left_arm",
			() -> BlockEntityType.Builder.of(ToyBonnieLeftArmTileEntity::new, FnafFrightsModBlocks.TOY_BONNIE_LEFT_ARM.get()).build(null));
	public static final RegistryObject<BlockEntityType<ToyBonnieLeftLegTileEntity>> TOY_BONNIE_LEFT_LEG = REGISTRY.register("toy_bonnie_left_leg",
			() -> BlockEntityType.Builder.of(ToyBonnieLeftLegTileEntity::new, FnafFrightsModBlocks.TOY_BONNIE_LEFT_LEG.get()).build(null));
	public static final RegistryObject<BlockEntityType<ToyBonnieBlockTileEntity>> TOY_BONNIE_BLOCK = REGISTRY.register("toy_bonnie_block",
			() -> BlockEntityType.Builder.of(ToyBonnieBlockTileEntity::new, FnafFrightsModBlocks.TOY_BONNIE_BLOCK.get()).build(null));
	public static final RegistryObject<BlockEntityType<FazbearLogoTileEntity>> FAZBEAR_LOGO = REGISTRY.register("fazbear_logo", () -> BlockEntityType.Builder.of(FazbearLogoTileEntity::new, FnafFrightsModBlocks.FAZBEAR_LOGO.get()).build(null));
	public static final RegistryObject<BlockEntityType<FreddyBoxTileEntity>> FREDDY_BOX = REGISTRY.register("freddy_box", () -> BlockEntityType.Builder.of(FreddyBoxTileEntity::new, FnafFrightsModBlocks.FREDDY_BOX.get()).build(null));
	public static final RegistryObject<BlockEntityType<FazbearLogo2TileEntity>> FAZBEAR_LOGO_2 = REGISTRY.register("fazbear_logo_2",
			() -> BlockEntityType.Builder.of(FazbearLogo2TileEntity::new, FnafFrightsModBlocks.FAZBEAR_LOGO_2.get()).build(null));
	public static final RegistryObject<BlockEntityType<ToyFoxyTorsoTileEntity>> TOY_FOXY_TORSO = REGISTRY.register("toy_foxy_torso",
			() -> BlockEntityType.Builder.of(ToyFoxyTorsoTileEntity::new, FnafFrightsModBlocks.TOY_FOXY_TORSO.get()).build(null));
	public static final RegistryObject<BlockEntityType<ToyFoxyHeadTileEntity>> TOY_FOXY_HEAD = REGISTRY.register("toy_foxy_head", () -> BlockEntityType.Builder.of(ToyFoxyHeadTileEntity::new, FnafFrightsModBlocks.TOY_FOXY_HEAD.get()).build(null));
	public static final RegistryObject<BlockEntityType<ToyFoxyRightArmTileEntity>> TOY_FOXY_RIGHT_ARM = REGISTRY.register("toy_foxy_right_arm",
			() -> BlockEntityType.Builder.of(ToyFoxyRightArmTileEntity::new, FnafFrightsModBlocks.TOY_FOXY_RIGHT_ARM.get()).build(null));
	public static final RegistryObject<BlockEntityType<ToyFoxyRightLegTileEntity>> TOY_FOXY_RIGHT_LEG = REGISTRY.register("toy_foxy_right_leg",
			() -> BlockEntityType.Builder.of(ToyFoxyRightLegTileEntity::new, FnafFrightsModBlocks.TOY_FOXY_RIGHT_LEG.get()).build(null));
	public static final RegistryObject<BlockEntityType<ToyFoxyLeftArmTileEntity>> TOY_FOXY_LEFT_ARM = REGISTRY.register("toy_foxy_left_arm",
			() -> BlockEntityType.Builder.of(ToyFoxyLeftArmTileEntity::new, FnafFrightsModBlocks.TOY_FOXY_LEFT_ARM.get()).build(null));
	public static final RegistryObject<BlockEntityType<ToyFoxyLeftLegTileEntity>> TOY_FOXY_LEFT_LEG = REGISTRY.register("toy_foxy_left_leg",
			() -> BlockEntityType.Builder.of(ToyFoxyLeftLegTileEntity::new, FnafFrightsModBlocks.TOY_FOXY_LEFT_LEG.get()).build(null));
	public static final RegistryObject<BlockEntityType<ToyFoxyBlockTileEntity>> TOY_FOXY_BLOCK = REGISTRY.register("toy_foxy_block",
			() -> BlockEntityType.Builder.of(ToyFoxyBlockTileEntity::new, FnafFrightsModBlocks.TOY_FOXY_BLOCK.get()).build(null));
	public static final RegistryObject<BlockEntityType<FreddyBlockTileEntity>> FREDDY_BLOCK = REGISTRY.register("freddy_block", () -> BlockEntityType.Builder.of(FreddyBlockTileEntity::new, FnafFrightsModBlocks.FREDDY_BLOCK.get()).build(null));
	public static final RegistryObject<BlockEntityType<WitheredFreddyBlockTileEntity>> WITHERED_FREDDY_BLOCK = REGISTRY.register("withered_freddy_block",
			() -> BlockEntityType.Builder.of(WitheredFreddyBlockTileEntity::new, FnafFrightsModBlocks.WITHERED_FREDDY_BLOCK.get()).build(null));
	public static final RegistryObject<BlockEntityType<WitheredGoldenFreddyBlcokTileEntity>> WITHERED_GOLDEN_FREDDY_BLOCK = REGISTRY.register("withered_golden_freddy_block",
			() -> BlockEntityType.Builder.of(WitheredGoldenFreddyBlcokTileEntity::new, FnafFrightsModBlocks.WITHERED_GOLDEN_FREDDY_BLOCK.get()).build(null));
	public static final RegistryObject<BlockEntityType<ToyBonnieShowtimeTileEntity>> TOY_BONNIE_SHOWTIME = REGISTRY.register("toy_bonnie_showtime",
			() -> BlockEntityType.Builder.of(ToyBonnieShowtimeTileEntity::new, FnafFrightsModBlocks.TOY_BONNIE_SHOWTIME.get()).build(null));
	public static final RegistryObject<BlockEntityType<ToyBonnieShowtimeActiveTileEntity>> TOY_BONNIE_SHOWTIME_ACTIVE = REGISTRY.register("toy_bonnie_showtime_active",
			() -> BlockEntityType.Builder.of(ToyBonnieShowtimeActiveTileEntity::new, FnafFrightsModBlocks.TOY_BONNIE_SHOWTIME_ACTIVE.get()).build(null));
	public static final RegistryObject<BlockEntityType<ToyChicaShowtimeTileEntity>> TOY_CHICA_SHOWTIME = REGISTRY.register("toy_chica_showtime",
			() -> BlockEntityType.Builder.of(ToyChicaShowtimeTileEntity::new, FnafFrightsModBlocks.TOY_CHICA_SHOWTIME.get()).build(null));
	public static final RegistryObject<BlockEntityType<ToyChicaShowtimeActiveTileEntity>> TOY_CHICA_SHOWTIME_ACTIVE = REGISTRY.register("toy_chica_showtime_active",
			() -> BlockEntityType.Builder.of(ToyChicaShowtimeActiveTileEntity::new, FnafFrightsModBlocks.TOY_CHICA_SHOWTIME_ACTIVE.get()).build(null));
	public static final RegistryObject<BlockEntityType<ToyFreddyShowtimeTileEntity>> TOY_FREDDY_SHOWTIME = REGISTRY.register("toy_freddy_showtime",
			() -> BlockEntityType.Builder.of(ToyFreddyShowtimeTileEntity::new, FnafFrightsModBlocks.TOY_FREDDY_SHOWTIME.get()).build(null));
	public static final RegistryObject<BlockEntityType<ToyFreddyShowtimeActiveTileEntity>> TOY_FREDDY_SHOWTIME_ACTIVE = REGISTRY.register("toy_freddy_showtime_active",
			() -> BlockEntityType.Builder.of(ToyFreddyShowtimeActiveTileEntity::new, FnafFrightsModBlocks.TOY_FREDDY_SHOWTIME_ACTIVE.get()).build(null));
	public static final RegistryObject<BlockEntityType<FreddyShowtimeTileEntity>> FREDDY_SHOWTIME = REGISTRY.register("freddy_showtime",
			() -> BlockEntityType.Builder.of(FreddyShowtimeTileEntity::new, FnafFrightsModBlocks.FREDDY_SHOWTIME.get()).build(null));
	public static final RegistryObject<BlockEntityType<FreddyShowtimeActiveTileEntity>> FREDDY_SHOWTIME_ACTIVE = REGISTRY.register("freddy_showtime_active",
			() -> BlockEntityType.Builder.of(FreddyShowtimeActiveTileEntity::new, FnafFrightsModBlocks.FREDDY_SHOWTIME_ACTIVE.get()).build(null));
	public static final RegistryObject<BlockEntityType<BonnieShowtimeTileEntity>> BONNIE_SHOWTIME = REGISTRY.register("bonnie_showtime",
			() -> BlockEntityType.Builder.of(BonnieShowtimeTileEntity::new, FnafFrightsModBlocks.BONNIE_SHOWTIME.get()).build(null));
	public static final RegistryObject<BlockEntityType<BonnieShowtimeActiveTileEntity>> BONNIE_SHOWTIME_ACTIVE = REGISTRY.register("bonnie_showtime_active",
			() -> BlockEntityType.Builder.of(BonnieShowtimeActiveTileEntity::new, FnafFrightsModBlocks.BONNIE_SHOWTIME_ACTIVE.get()).build(null));
	public static final RegistryObject<BlockEntityType<ChicaShowtimeTileEntity>> CHICA_SHOWTIME = REGISTRY.register("chica_showtime",
			() -> BlockEntityType.Builder.of(ChicaShowtimeTileEntity::new, FnafFrightsModBlocks.CHICA_SHOWTIME.get()).build(null));
	public static final RegistryObject<BlockEntityType<ChicaShowtimeActiveTileEntity>> CHICA_SHOWTIME_ACTIVE = REGISTRY.register("chica_showtime_active",
			() -> BlockEntityType.Builder.of(ChicaShowtimeActiveTileEntity::new, FnafFrightsModBlocks.CHICA_SHOWTIME_ACTIVE.get()).build(null));
	public static final RegistryObject<BlockEntityType<FoxyShowtimeTileEntity>> FOXY_SHOWTIME = REGISTRY.register("foxy_showtime", () -> BlockEntityType.Builder.of(FoxyShowtimeTileEntity::new, FnafFrightsModBlocks.FOXY_SHOWTIME.get()).build(null));
	public static final RegistryObject<BlockEntityType<FoxyShowtimeActiveTileEntity>> FOXY_SHOWTIME_ACTIVE = REGISTRY.register("foxy_showtime_active",
			() -> BlockEntityType.Builder.of(FoxyShowtimeActiveTileEntity::new, FnafFrightsModBlocks.FOXY_SHOWTIME_ACTIVE.get()).build(null));
	public static final RegistryObject<BlockEntityType<ToyFoxyShowtimeTileEntity>> TOY_FOXY_SHOWTIME = REGISTRY.register("toy_foxy_showtime",
			() -> BlockEntityType.Builder.of(ToyFoxyShowtimeTileEntity::new, FnafFrightsModBlocks.TOY_FOXY_SHOWTIME.get()).build(null));
	public static final RegistryObject<BlockEntityType<ToyFoxyShowtimeActiveTileEntity>> TOY_FOXY_SHOWTIME_ACTIVE = REGISTRY.register("toy_foxy_showtime_active",
			() -> BlockEntityType.Builder.of(ToyFoxyShowtimeActiveTileEntity::new, FnafFrightsModBlocks.TOY_FOXY_SHOWTIME_ACTIVE.get()).build(null));
	public static final RegistryObject<BlockEntityType<ToyChicaBlockTileEntity>> TOY_CHICA_BLOCK = REGISTRY.register("toy_chica_block",
			() -> BlockEntityType.Builder.of(ToyChicaBlockTileEntity::new, FnafFrightsModBlocks.TOY_CHICA_BLOCK.get()).build(null));
	public static final RegistryObject<BlockEntityType<ToyFreddyBlockTileEntity>> TOY_FREDDY_BLOCK = REGISTRY.register("toy_freddy_block",
			() -> BlockEntityType.Builder.of(ToyFreddyBlockTileEntity::new, FnafFrightsModBlocks.TOY_FREDDY_BLOCK.get()).build(null));
	public static final RegistryObject<BlockEntityType<ToyFreddyTorsoTileEntity>> TOY_FREDDY_TORSO = REGISTRY.register("toy_freddy_torso",
			() -> BlockEntityType.Builder.of(ToyFreddyTorsoTileEntity::new, FnafFrightsModBlocks.TOY_FREDDY_TORSO.get()).build(null));
	public static final RegistryObject<BlockEntityType<ToyFreddyHeadTileEntity>> TOY_FREDDY_HEAD = REGISTRY.register("toy_freddy_head",
			() -> BlockEntityType.Builder.of(ToyFreddyHeadTileEntity::new, FnafFrightsModBlocks.TOY_FREDDY_HEAD.get()).build(null));
	public static final RegistryObject<BlockEntityType<ToyFreddyRightArmTileEntity>> TOY_FREDDY_RIGHT_ARM = REGISTRY.register("toy_freddy_right_arm",
			() -> BlockEntityType.Builder.of(ToyFreddyRightArmTileEntity::new, FnafFrightsModBlocks.TOY_FREDDY_RIGHT_ARM.get()).build(null));
	public static final RegistryObject<BlockEntityType<ToyFreddyLeftArmTileEntity>> TOY_FREDDY_LEFT_ARM = REGISTRY.register("toy_freddy_left_arm",
			() -> BlockEntityType.Builder.of(ToyFreddyLeftArmTileEntity::new, FnafFrightsModBlocks.TOY_FREDDY_LEFT_ARM.get()).build(null));
	public static final RegistryObject<BlockEntityType<ToyFreddyLeftLegTileEntity>> TOY_FREDDY_LEFT_LEG = REGISTRY.register("toy_freddy_left_leg",
			() -> BlockEntityType.Builder.of(ToyFreddyLeftLegTileEntity::new, FnafFrightsModBlocks.TOY_FREDDY_LEFT_LEG.get()).build(null));
	public static final RegistryObject<BlockEntityType<ToyFreddyRightLegTileEntity>> TOY_FREDDY_RIGHT_LEG = REGISTRY.register("toy_freddy_right_leg",
			() -> BlockEntityType.Builder.of(ToyFreddyRightLegTileEntity::new, FnafFrightsModBlocks.TOY_FREDDY_RIGHT_LEG.get()).build(null));
	public static final RegistryObject<BlockEntityType<ToyChicaTorsoTileEntity>> TOY_CHICA_TORSO = REGISTRY.register("toy_chica_torso",
			() -> BlockEntityType.Builder.of(ToyChicaTorsoTileEntity::new, FnafFrightsModBlocks.TOY_CHICA_TORSO.get()).build(null));
	public static final RegistryObject<BlockEntityType<ToyChicaRightArmTileEntity>> TOY_CHICA_RIGHT_ARM = REGISTRY.register("toy_chica_right_arm",
			() -> BlockEntityType.Builder.of(ToyChicaRightArmTileEntity::new, FnafFrightsModBlocks.TOY_CHICA_RIGHT_ARM.get()).build(null));
	public static final RegistryObject<BlockEntityType<ToyChicaHeadTileEntity>> TOY_CHICA_HEAD = REGISTRY.register("toy_chica_head",
			() -> BlockEntityType.Builder.of(ToyChicaHeadTileEntity::new, FnafFrightsModBlocks.TOY_CHICA_HEAD.get()).build(null));
	public static final RegistryObject<BlockEntityType<ToyChicaLeftArmTileEntity>> TOY_CHICA_LEFT_ARM = REGISTRY.register("toy_chica_left_arm",
			() -> BlockEntityType.Builder.of(ToyChicaLeftArmTileEntity::new, FnafFrightsModBlocks.TOY_CHICA_LEFT_ARM.get()).build(null));
	public static final RegistryObject<BlockEntityType<ToyChicaLeftLegTileEntity>> TOY_CHICA_LEFT_LEG = REGISTRY.register("toy_chica_left_leg",
			() -> BlockEntityType.Builder.of(ToyChicaLeftLegTileEntity::new, FnafFrightsModBlocks.TOY_CHICA_LEFT_LEG.get()).build(null));
	public static final RegistryObject<BlockEntityType<ToyChicaRightLegTileEntity>> TOY_CHICA_RIGHT_LEG = REGISTRY.register("toy_chica_right_leg",
			() -> BlockEntityType.Builder.of(ToyChicaRightLegTileEntity::new, FnafFrightsModBlocks.TOY_CHICA_RIGHT_LEG.get()).build(null));
	public static final RegistryObject<BlockEntityType<FoxyBlockTileEntity>> FOXY_BLOCK = REGISTRY.register("foxy_block", () -> BlockEntityType.Builder.of(FoxyBlockTileEntity::new, FnafFrightsModBlocks.FOXY_BLOCK.get()).build(null));
	public static final RegistryObject<BlockEntityType<WitheredFoxyBlockTileEntity>> WITHERED_FOXY_BLOCK = REGISTRY.register("withered_foxy_block",
			() -> BlockEntityType.Builder.of(WitheredFoxyBlockTileEntity::new, FnafFrightsModBlocks.WITHERED_FOXY_BLOCK.get()).build(null));
	public static final RegistryObject<BlockEntityType<WitheredBonnieBlockTileEntity>> WITHERED_BONNIE_BLOCK = REGISTRY.register("withered_bonnie_block",
			() -> BlockEntityType.Builder.of(WitheredBonnieBlockTileEntity::new, FnafFrightsModBlocks.WITHERED_BONNIE_BLOCK.get()).build(null));
	public static final RegistryObject<BlockEntityType<WitheredChicaBlockTileEntity>> WITHERED_CHICA_BLOCK = REGISTRY.register("withered_chica_block",
			() -> BlockEntityType.Builder.of(WitheredChicaBlockTileEntity::new, FnafFrightsModBlocks.WITHERED_CHICA_BLOCK.get()).build(null));
	public static final RegistryObject<BlockEntityType<ChicaBlockTileEntity>> CHICA_BLOCK = REGISTRY.register("chica_block", () -> BlockEntityType.Builder.of(ChicaBlockTileEntity::new, FnafFrightsModBlocks.CHICA_BLOCK.get()).build(null));
	public static final RegistryObject<BlockEntityType<BonnieBlockTileEntity>> BONNIE_BLOCK = REGISTRY.register("bonnie_block", () -> BlockEntityType.Builder.of(BonnieBlockTileEntity::new, FnafFrightsModBlocks.BONNIE_BLOCK.get()).build(null));
	public static final RegistryObject<BlockEntityType<SpringbonnieShowtimeTileEntity>> SPRINGBONNIE_SHOWTIME = REGISTRY.register("springbonnie_showtime",
			() -> BlockEntityType.Builder.of(SpringbonnieShowtimeTileEntity::new, FnafFrightsModBlocks.SPRINGBONNIE_SHOWTIME.get()).build(null));
	public static final RegistryObject<BlockEntityType<FredbearShowtimeTileEntity>> FREDBEAR_SHOWTIME = REGISTRY.register("fredbear_showtime",
			() -> BlockEntityType.Builder.of(FredbearShowtimeTileEntity::new, FnafFrightsModBlocks.FREDBEAR_SHOWTIME.get()).build(null));
	public static final RegistryObject<BlockEntityType<SpringBonnieShowtimeActiveTileEntity>> SPRING_BONNIE_SHOWTIME_ACTIVE = REGISTRY.register("spring_bonnie_showtime_active",
			() -> BlockEntityType.Builder.of(SpringBonnieShowtimeActiveTileEntity::new, FnafFrightsModBlocks.SPRING_BONNIE_SHOWTIME_ACTIVE.get()).build(null));
	public static final RegistryObject<BlockEntityType<FredbearShowtimeActiveTileEntity>> FREDBEAR_SHOWTIME_ACTIVE = REGISTRY.register("fredbear_showtime_active",
			() -> BlockEntityType.Builder.of(FredbearShowtimeActiveTileEntity::new, FnafFrightsModBlocks.FREDBEAR_SHOWTIME_ACTIVE.get()).build(null));
	public static final RegistryObject<BlockEntityType<ClassicChicaShowtimeTileEntity>> CLASSIC_CHICA_SHOWTIME = REGISTRY.register("classic_chica_showtime",
			() -> BlockEntityType.Builder.of(ClassicChicaShowtimeTileEntity::new, FnafFrightsModBlocks.CLASSIC_CHICA_SHOWTIME.get()).build(null));
	public static final RegistryObject<BlockEntityType<ClassicChicaShowtimeActiveTileEntity>> CLASSIC_CHICA_SHOWTIME_ACTIVE = REGISTRY.register("classic_chica_showtime_active",
			() -> BlockEntityType.Builder.of(ClassicChicaShowtimeActiveTileEntity::new, FnafFrightsModBlocks.CLASSIC_CHICA_SHOWTIME_ACTIVE.get()).build(null));
	public static final RegistryObject<BlockEntityType<FreddyFazbearShowtimeTileEntity>> FREDDY_FAZBEAR_SHOWTIME = REGISTRY.register("freddy_fazbear_showtime",
			() -> BlockEntityType.Builder.of(FreddyFazbearShowtimeTileEntity::new, FnafFrightsModBlocks.FREDDY_FAZBEAR_SHOWTIME.get()).build(null));
	public static final RegistryObject<BlockEntityType<FreddyFazbearShowtimeActiveTileEntity>> FREDDY_FAZBEAR_SHOWTIME_ACTIVE = REGISTRY.register("freddy_fazbear_showtime_active",
			() -> BlockEntityType.Builder.of(FreddyFazbearShowtimeActiveTileEntity::new, FnafFrightsModBlocks.FREDDY_FAZBEAR_SHOWTIME_ACTIVE.get()).build(null));
	public static final RegistryObject<BlockEntityType<BonnieBunnieShowtimeTileEntity>> BONNIE_BUNNIE_SHOWTIME = REGISTRY.register("bonnie_bunnie_showtime",
			() -> BlockEntityType.Builder.of(BonnieBunnieShowtimeTileEntity::new, FnafFrightsModBlocks.BONNIE_BUNNIE_SHOWTIME.get()).build(null));
	public static final RegistryObject<BlockEntityType<BonnieBunnieShowtimeActiveTileEntity>> BONNIE_BUNNIE_SHOWTIME_ACTIVE = REGISTRY.register("bonnie_bunnie_showtime_active",
			() -> BlockEntityType.Builder.of(BonnieBunnieShowtimeActiveTileEntity::new, FnafFrightsModBlocks.BONNIE_BUNNIE_SHOWTIME_ACTIVE.get()).build(null));
	public static final RegistryObject<BlockEntityType<SpringBonnieBunnieShowtimeTileEntity>> SPRING_BONNIE_BUNNIE_SHOWTIME = REGISTRY.register("spring_bonnie_bunnie_showtime",
			() -> BlockEntityType.Builder.of(SpringBonnieBunnieShowtimeTileEntity::new, FnafFrightsModBlocks.SPRING_BONNIE_BUNNIE_SHOWTIME.get()).build(null));
	public static final RegistryObject<BlockEntityType<SpringBonnieBunnieShowtimeActiveTileEntity>> SPRING_BONNIE_BUNNIE_SHOWTIME_ACTIVE = REGISTRY.register("spring_bonnie_bunnie_showtime_active",
			() -> BlockEntityType.Builder.of(SpringBonnieBunnieShowtimeActiveTileEntity::new, FnafFrightsModBlocks.SPRING_BONNIE_BUNNIE_SHOWTIME_ACTIVE.get()).build(null));
	public static final RegistryObject<BlockEntityType<GoldenFreddyShowtimeTileEntity>> YELLOW_BEAR_SHOWTIME = REGISTRY.register("yellow_bear_showtime",
			() -> BlockEntityType.Builder.of(GoldenFreddyShowtimeTileEntity::new, FnafFrightsModBlocks.YELLOW_BEAR_SHOWTIME.get()).build(null));
	public static final RegistryObject<BlockEntityType<GoldenFreddyShowtimeActiveTileEntity>> YELLOW_BEAR_SHOWTIME_ACTIVE = REGISTRY.register("yellow_bear_showtime_active",
			() -> BlockEntityType.Builder.of(GoldenFreddyShowtimeActiveTileEntity::new, FnafFrightsModBlocks.YELLOW_BEAR_SHOWTIME_ACTIVE.get()).build(null));
	public static final RegistryObject<BlockEntityType<FoxyPirateShowtimeTileEntity>> FOXY_PIRATE_SHOWTIME = REGISTRY.register("foxy_pirate_showtime",
			() -> BlockEntityType.Builder.of(FoxyPirateShowtimeTileEntity::new, FnafFrightsModBlocks.FOXY_PIRATE_SHOWTIME.get()).build(null));
	public static final RegistryObject<BlockEntityType<FoxyPirateShowtimeActiveTileEntity>> FOXY_PIRATE_SHOWTIME_ACTIVE = REGISTRY.register("foxy_pirate_showtime_active",
			() -> BlockEntityType.Builder.of(FoxyPirateShowtimeActiveTileEntity::new, FnafFrightsModBlocks.FOXY_PIRATE_SHOWTIME_ACTIVE.get()).build(null));
	public static final RegistryObject<BlockEntityType<GlitchtrapShowtimeTileEntity>> GLITCH_BONNIE_SHOWTIME = REGISTRY.register("glitch_bonnie_showtime",
			() -> BlockEntityType.Builder.of(GlitchtrapShowtimeTileEntity::new, FnafFrightsModBlocks.GLITCH_BONNIE_SHOWTIME.get()).build(null));
	public static final RegistryObject<BlockEntityType<GlitchtrapShowtimeActiveTileEntity>> GLITCH_BONNIE_SHOWTIME_ACTIVE = REGISTRY.register("glitch_bonnie_showtime_active",
			() -> BlockEntityType.Builder.of(GlitchtrapShowtimeActiveTileEntity::new, FnafFrightsModBlocks.GLITCH_BONNIE_SHOWTIME_ACTIVE.get()).build(null));
	public static final RegistryObject<BlockEntityType<UnBonnieShowtimeTileEntity>> SHAVEN_BONNIE_SHOWTIME = REGISTRY.register("shaven_bonnie_showtime",
			() -> BlockEntityType.Builder.of(UnBonnieShowtimeTileEntity::new, FnafFrightsModBlocks.SHAVEN_BONNIE_SHOWTIME.get()).build(null));
	public static final RegistryObject<BlockEntityType<UnBonnieShowtimeActiveTileEntity>> SHAVEN_BONNIE_SHOWTIME_ACTIVE = REGISTRY.register("shaven_bonnie_showtime_active",
			() -> BlockEntityType.Builder.of(UnBonnieShowtimeActiveTileEntity::new, FnafFrightsModBlocks.SHAVEN_BONNIE_SHOWTIME_ACTIVE.get()).build(null));
	public static final RegistryObject<BlockEntityType<FixedFoxyShowtimeTileEntity>> FIXED_FOXY_SHOWTIME = REGISTRY.register("fixed_foxy_showtime",
			() -> BlockEntityType.Builder.of(FixedFoxyShowtimeTileEntity::new, FnafFrightsModBlocks.FIXED_FOXY_SHOWTIME.get()).build(null));
	public static final RegistryObject<BlockEntityType<FixedFoxyShowtimeActiveTileEntity>> FIXED_FOXY_SHOWTIME_ACTIVE = REGISTRY.register("fixed_foxy_showtime_active",
			() -> BlockEntityType.Builder.of(FixedFoxyShowtimeActiveTileEntity::new, FnafFrightsModBlocks.FIXED_FOXY_SHOWTIME_ACTIVE.get()).build(null));
	public static final RegistryObject<BlockEntityType<SpringtrapShowtimeTileEntity>> SPRINGTRAP_SHOWTIME = REGISTRY.register("springtrap_showtime",
			() -> BlockEntityType.Builder.of(SpringtrapShowtimeTileEntity::new, FnafFrightsModBlocks.SPRINGTRAP_SHOWTIME.get()).build(null));
	public static final RegistryObject<BlockEntityType<SpringtrapShowtimeActiveTileEntity>> SPRINGTRAP_SHOWTIME_ACTIVE = REGISTRY.register("springtrap_showtime_active",
			() -> BlockEntityType.Builder.of(SpringtrapShowtimeActiveTileEntity::new, FnafFrightsModBlocks.SPRINGTRAP_SHOWTIME_ACTIVE.get()).build(null));
	public static final RegistryObject<BlockEntityType<ABonnieBunnieShowtimeTileEntity>> A_BONNIE_BUNNIE_SHOWTIME = REGISTRY.register("a_bonnie_bunnie_showtime",
			() -> BlockEntityType.Builder.of(ABonnieBunnieShowtimeTileEntity::new, FnafFrightsModBlocks.A_BONNIE_BUNNIE_SHOWTIME.get()).build(null));
	public static final RegistryObject<BlockEntityType<ABonnieBunnyActiveTileEntity>> A_BONNIE_BUNNY_ACTIVE = REGISTRY.register("a_bonnie_bunny_active",
			() -> BlockEntityType.Builder.of(ABonnieBunnyActiveTileEntity::new, FnafFrightsModBlocks.A_BONNIE_BUNNY_ACTIVE.get()).build(null));
	public static final RegistryObject<BlockEntityType<ABonnieShowtimeTileEntity>> A_BONNIE_SHOWTIME = REGISTRY.register("a_bonnie_showtime",
			() -> BlockEntityType.Builder.of(ABonnieShowtimeTileEntity::new, FnafFrightsModBlocks.A_BONNIE_SHOWTIME.get()).build(null));
	public static final RegistryObject<BlockEntityType<ABonnieActiveTileEntity>> A_BONNIE_ACTIVE = REGISTRY.register("a_bonnie_active",
			() -> BlockEntityType.Builder.of(ABonnieActiveTileEntity::new, FnafFrightsModBlocks.A_BONNIE_ACTIVE.get()).build(null));
	public static final RegistryObject<BlockEntityType<AChicaShowtimeTileEntity>> A_CHICA_SHOWTIME = REGISTRY.register("a_chica_showtime",
			() -> BlockEntityType.Builder.of(AChicaShowtimeTileEntity::new, FnafFrightsModBlocks.A_CHICA_SHOWTIME.get()).build(null));
	public static final RegistryObject<BlockEntityType<AChicaActiveTileEntity>> A_CHICA_ACTIVE = REGISTRY.register("a_chica_active",
			() -> BlockEntityType.Builder.of(AChicaActiveTileEntity::new, FnafFrightsModBlocks.A_CHICA_ACTIVE.get()).build(null));
	public static final RegistryObject<BlockEntityType<AChicaChickenShowtimeTileEntity>> A_CHICA_CHICKEN_SHOWTIME = REGISTRY.register("a_chica_chicken_showtime",
			() -> BlockEntityType.Builder.of(AChicaChickenShowtimeTileEntity::new, FnafFrightsModBlocks.A_CHICA_CHICKEN_SHOWTIME.get()).build(null));
	public static final RegistryObject<BlockEntityType<AChicaChickenActiveTileEntity>> A_CHICA_CHICKEN_ACTIVE = REGISTRY.register("a_chica_chicken_active",
			() -> BlockEntityType.Builder.of(AChicaChickenActiveTileEntity::new, FnafFrightsModBlocks.A_CHICA_CHICKEN_ACTIVE.get()).build(null));
	public static final RegistryObject<BlockEntityType<AFixedFoxyShowtimeTileEntity>> A_FIXED_FOXY_SHOWTIME = REGISTRY.register("a_fixed_foxy_showtime",
			() -> BlockEntityType.Builder.of(AFixedFoxyShowtimeTileEntity::new, FnafFrightsModBlocks.A_FIXED_FOXY_SHOWTIME.get()).build(null));
	public static final RegistryObject<BlockEntityType<AFixedFoxyActiveTileEntity>> A_FIXED_FOXY_ACTIVE = REGISTRY.register("a_fixed_foxy_active",
			() -> BlockEntityType.Builder.of(AFixedFoxyActiveTileEntity::new, FnafFrightsModBlocks.A_FIXED_FOXY_ACTIVE.get()).build(null));
	public static final RegistryObject<BlockEntityType<AShavenBonnieShowtimeTileEntity>> A_SHAVEN_BONNIE_SHOWTIME = REGISTRY.register("a_shaven_bonnie_showtime",
			() -> BlockEntityType.Builder.of(AShavenBonnieShowtimeTileEntity::new, FnafFrightsModBlocks.A_SHAVEN_BONNIE_SHOWTIME.get()).build(null));
	public static final RegistryObject<BlockEntityType<AShavenBonnieActiveTileEntity>> A_SHAVEN_BONNIE_ACTIVE = REGISTRY.register("a_shaven_bonnie_active",
			() -> BlockEntityType.Builder.of(AShavenBonnieActiveTileEntity::new, FnafFrightsModBlocks.A_SHAVEN_BONNIE_ACTIVE.get()).build(null));
	public static final RegistryObject<BlockEntityType<ASpringBonnieBunnieShowtimeTileEntity>> A_SPRING_BONNIE_BUNNIE_SHOWTIME = REGISTRY.register("a_spring_bonnie_bunnie_showtime",
			() -> BlockEntityType.Builder.of(ASpringBonnieBunnieShowtimeTileEntity::new, FnafFrightsModBlocks.A_SPRING_BONNIE_BUNNIE_SHOWTIME.get()).build(null));
	public static final RegistryObject<BlockEntityType<ASpringBonnieBunnieActiveTileEntity>> A_SPRING_BONNIE_BUNNIE_ACTIVE = REGISTRY.register("a_spring_bonnie_bunnie_active",
			() -> BlockEntityType.Builder.of(ASpringBonnieBunnieActiveTileEntity::new, FnafFrightsModBlocks.A_SPRING_BONNIE_BUNNIE_ACTIVE.get()).build(null));
	public static final RegistryObject<BlockEntityType<AFoxyPirateShowtimeTileEntity>> A_FOXY_PIRATE_SHOWTIME = REGISTRY.register("a_foxy_pirate_showtime",
			() -> BlockEntityType.Builder.of(AFoxyPirateShowtimeTileEntity::new, FnafFrightsModBlocks.A_FOXY_PIRATE_SHOWTIME.get()).build(null));
	public static final RegistryObject<BlockEntityType<AFoxyPirateActiveTileEntity>> A_FOXY_PIRATE_ACTIVE = REGISTRY.register("a_foxy_pirate_active",
			() -> BlockEntityType.Builder.of(AFoxyPirateActiveTileEntity::new, FnafFrightsModBlocks.A_FOXY_PIRATE_ACTIVE.get()).build(null));
	public static final RegistryObject<BlockEntityType<AFredbearShowtimeTileEntity>> A_FREDBEAR_SHOWTIME = REGISTRY.register("a_fredbear_showtime",
			() -> BlockEntityType.Builder.of(AFredbearShowtimeTileEntity::new, FnafFrightsModBlocks.A_FREDBEAR_SHOWTIME.get()).build(null));
	public static final RegistryObject<BlockEntityType<AFredbearActiveTileEntity>> A_FREDBEAR_ACTIVE = REGISTRY.register("a_fredbear_active",
			() -> BlockEntityType.Builder.of(AFredbearActiveTileEntity::new, FnafFrightsModBlocks.A_FREDBEAR_ACTIVE.get()).build(null));
	public static final RegistryObject<BlockEntityType<AFreddyFazbearShowtimeTileEntity>> A_FREDDY_FAZBEAR_SHOWTIME = REGISTRY.register("a_freddy_fazbear_showtime",
			() -> BlockEntityType.Builder.of(AFreddyFazbearShowtimeTileEntity::new, FnafFrightsModBlocks.A_FREDDY_FAZBEAR_SHOWTIME.get()).build(null));
	public static final RegistryObject<BlockEntityType<AFreddyFazbearActiveTileEntity>> A_FREDDY_FAZBEAR_ACTIVE = REGISTRY.register("a_freddy_fazbear_active",
			() -> BlockEntityType.Builder.of(AFreddyFazbearActiveTileEntity::new, FnafFrightsModBlocks.A_FREDDY_FAZBEAR_ACTIVE.get()).build(null));
	public static final RegistryObject<BlockEntityType<AFreddyShowtimeTileEntity>> A_FREDDY_SHOWTIME = REGISTRY.register("a_freddy_showtime",
			() -> BlockEntityType.Builder.of(AFreddyShowtimeTileEntity::new, FnafFrightsModBlocks.A_FREDDY_SHOWTIME.get()).build(null));
	public static final RegistryObject<BlockEntityType<AFreddyActiveTileEntity>> A_FREDDY_ACTIVE = REGISTRY.register("a_freddy_active",
			() -> BlockEntityType.Builder.of(AFreddyActiveTileEntity::new, FnafFrightsModBlocks.A_FREDDY_ACTIVE.get()).build(null));
	public static final RegistryObject<BlockEntityType<ASpringBonnieShowtimeTileEntity>> A_SPRING_BONNIE_SHOWTIME = REGISTRY.register("a_spring_bonnie_showtime",
			() -> BlockEntityType.Builder.of(ASpringBonnieShowtimeTileEntity::new, FnafFrightsModBlocks.A_SPRING_BONNIE_SHOWTIME.get()).build(null));
	public static final RegistryObject<BlockEntityType<ASpringBonnieActiveTileEntity>> A_SPRING_BONNIE_ACTIVE = REGISTRY.register("a_spring_bonnie_active",
			() -> BlockEntityType.Builder.of(ASpringBonnieActiveTileEntity::new, FnafFrightsModBlocks.A_SPRING_BONNIE_ACTIVE.get()).build(null));
	public static final RegistryObject<BlockEntityType<AGltichBonnieShowtimeTileEntity>> A_GLTICH_BONNIE_SHOWTIME = REGISTRY.register("a_gltich_bonnie_showtime",
			() -> BlockEntityType.Builder.of(AGltichBonnieShowtimeTileEntity::new, FnafFrightsModBlocks.A_GLTICH_BONNIE_SHOWTIME.get()).build(null));
	public static final RegistryObject<BlockEntityType<AGlitchBonnieActiveTileEntity>> A_GLITCH_BONNIE_ACTIVE = REGISTRY.register("a_glitch_bonnie_active",
			() -> BlockEntityType.Builder.of(AGlitchBonnieActiveTileEntity::new, FnafFrightsModBlocks.A_GLITCH_BONNIE_ACTIVE.get()).build(null));
	public static final RegistryObject<BlockEntityType<ASpringtrapShowtimeTileEntity>> A_SPRINGTRAP_SHOWTIME = REGISTRY.register("a_springtrap_showtime",
			() -> BlockEntityType.Builder.of(ASpringtrapShowtimeTileEntity::new, FnafFrightsModBlocks.A_SPRINGTRAP_SHOWTIME.get()).build(null));
	public static final RegistryObject<BlockEntityType<ASpringtrapActiveTileEntity>> A_SPRINGTRAP_ACTIVE = REGISTRY.register("a_springtrap_active",
			() -> BlockEntityType.Builder.of(ASpringtrapActiveTileEntity::new, FnafFrightsModBlocks.A_SPRINGTRAP_ACTIVE.get()).build(null));
	public static final RegistryObject<BlockEntityType<AToyBonnieShowtimeTileEntity>> A_TOY_BONNIE_SHOWTIME = REGISTRY.register("a_toy_bonnie_showtime",
			() -> BlockEntityType.Builder.of(AToyBonnieShowtimeTileEntity::new, FnafFrightsModBlocks.A_TOY_BONNIE_SHOWTIME.get()).build(null));
	public static final RegistryObject<BlockEntityType<AToyBonnieActiveTileEntity>> A_TOY_BONNIE_ACTIVE = REGISTRY.register("a_toy_bonnie_active",
			() -> BlockEntityType.Builder.of(AToyBonnieActiveTileEntity::new, FnafFrightsModBlocks.A_TOY_BONNIE_ACTIVE.get()).build(null));
	public static final RegistryObject<BlockEntityType<AToyChicaShowtimeTileEntity>> A_TOY_CHICA_SHOWTIME = REGISTRY.register("a_toy_chica_showtime",
			() -> BlockEntityType.Builder.of(AToyChicaShowtimeTileEntity::new, FnafFrightsModBlocks.A_TOY_CHICA_SHOWTIME.get()).build(null));
	public static final RegistryObject<BlockEntityType<AToyChicaActiveTileEntity>> A_TOY_CHICA_ACTIVE = REGISTRY.register("a_toy_chica_active",
			() -> BlockEntityType.Builder.of(AToyChicaActiveTileEntity::new, FnafFrightsModBlocks.A_TOY_CHICA_ACTIVE.get()).build(null));
	public static final RegistryObject<BlockEntityType<AToyFoxyShowtimeTileEntity>> A_TOY_FOXY_SHOWTIME = REGISTRY.register("a_toy_foxy_showtime",
			() -> BlockEntityType.Builder.of(AToyFoxyShowtimeTileEntity::new, FnafFrightsModBlocks.A_TOY_FOXY_SHOWTIME.get()).build(null));
	public static final RegistryObject<BlockEntityType<AToyFoxyActiveTileEntity>> A_TOY_FOXY_ACTIVE = REGISTRY.register("a_toy_foxy_active",
			() -> BlockEntityType.Builder.of(AToyFoxyActiveTileEntity::new, FnafFrightsModBlocks.A_TOY_FOXY_ACTIVE.get()).build(null));
	public static final RegistryObject<BlockEntityType<AToyFreddyShowtimeTileEntity>> A_TOY_FREDDY_SHOWTIME = REGISTRY.register("a_toy_freddy_showtime",
			() -> BlockEntityType.Builder.of(AToyFreddyShowtimeTileEntity::new, FnafFrightsModBlocks.A_TOY_FREDDY_SHOWTIME.get()).build(null));
	public static final RegistryObject<BlockEntityType<AToyFreddyActiveTileEntity>> A_TOY_FREDDY_ACTIVE = REGISTRY.register("a_toy_freddy_active",
			() -> BlockEntityType.Builder.of(AToyFreddyActiveTileEntity::new, FnafFrightsModBlocks.A_TOY_FREDDY_ACTIVE.get()).build(null));
	public static final RegistryObject<BlockEntityType<AYellowBearShowtimeTileEntity>> A_YELLOW_BEAR_SHOWTIME = REGISTRY.register("a_yellow_bear_showtime",
			() -> BlockEntityType.Builder.of(AYellowBearShowtimeTileEntity::new, FnafFrightsModBlocks.A_YELLOW_BEAR_SHOWTIME.get()).build(null));
	public static final RegistryObject<BlockEntityType<AYellowBearActiveTileEntity>> A_YELLOW_BEAR_ACTIVE = REGISTRY.register("a_yellow_bear_active",
			() -> BlockEntityType.Builder.of(AYellowBearActiveTileEntity::new, FnafFrightsModBlocks.A_YELLOW_BEAR_ACTIVE.get()).build(null));
	public static final RegistryObject<BlockEntityType<AFoxyShowtimeTileEntity>> A_FOXY_SHOWTIME = REGISTRY.register("a_foxy_showtime",
			() -> BlockEntityType.Builder.of(AFoxyShowtimeTileEntity::new, FnafFrightsModBlocks.A_FOXY_SHOWTIME.get()).build(null));
	public static final RegistryObject<BlockEntityType<AFoxyActiveTileEntity>> A_FOXY_ACTIVE = REGISTRY.register("a_foxy_active", () -> BlockEntityType.Builder.of(AFoxyActiveTileEntity::new, FnafFrightsModBlocks.A_FOXY_ACTIVE.get()).build(null));
	public static final RegistryObject<BlockEntityType<EmptyboxTileEntity>> EMPTYBOX = REGISTRY.register("emptybox", () -> BlockEntityType.Builder.of(EmptyboxTileEntity::new, FnafFrightsModBlocks.EMPTYBOX.get()).build(null));
	public static final RegistryObject<BlockEntityType<Endo02HeadTileEntity>> ENDO_02_HEAD = REGISTRY.register("endo_02_head", () -> BlockEntityType.Builder.of(Endo02HeadTileEntity::new, FnafFrightsModBlocks.ENDO_02_HEAD.get()).build(null));
	public static final RegistryObject<BlockEntityType<Endo02TorsoTileEntity>> ENDO_02_TORSO = REGISTRY.register("endo_02_torso", () -> BlockEntityType.Builder.of(Endo02TorsoTileEntity::new, FnafFrightsModBlocks.ENDO_02_TORSO.get()).build(null));
	public static final RegistryObject<BlockEntityType<Endo02LeftLegTileEntity>> ENDO_02_LEFT_LEG = REGISTRY.register("endo_02_left_leg",
			() -> BlockEntityType.Builder.of(Endo02LeftLegTileEntity::new, FnafFrightsModBlocks.ENDO_02_LEFT_LEG.get()).build(null));
	public static final RegistryObject<BlockEntityType<Endo02RightLegTileEntity>> ENDO_02_RIGHT_LEG = REGISTRY.register("endo_02_right_leg",
			() -> BlockEntityType.Builder.of(Endo02RightLegTileEntity::new, FnafFrightsModBlocks.ENDO_02_RIGHT_LEG.get()).build(null));
	public static final RegistryObject<BlockEntityType<Endo02LeftArmTileEntity>> ENDO_02_LEFT_ARM = REGISTRY.register("endo_02_left_arm",
			() -> BlockEntityType.Builder.of(Endo02LeftArmTileEntity::new, FnafFrightsModBlocks.ENDO_02_LEFT_ARM.get()).build(null));
	public static final RegistryObject<BlockEntityType<Endo02RightArmTileEntity>> ENDO_02_RIGHT_ARM = REGISTRY.register("endo_02_right_arm",
			() -> BlockEntityType.Builder.of(Endo02RightArmTileEntity::new, FnafFrightsModBlocks.ENDO_02_RIGHT_ARM.get()).build(null));
	public static final RegistryObject<BlockEntityType<OffsetFreddyShowtimeTileEntity>> OFFSET_FREDDY_SHOWTIME = REGISTRY.register("offset_freddy_showtime",
			() -> BlockEntityType.Builder.of(OffsetFreddyShowtimeTileEntity::new, FnafFrightsModBlocks.OFFSET_FREDDY_SHOWTIME.get()).build(null));
	public static final RegistryObject<BlockEntityType<OffsetFreddyActiveTileEntity>> OFFSET_FREDDY_ACTIVE = REGISTRY.register("offset_freddy_active",
			() -> BlockEntityType.Builder.of(OffsetFreddyActiveTileEntity::new, FnafFrightsModBlocks.OFFSET_FREDDY_ACTIVE.get()).build(null));
	public static final RegistryObject<BlockEntityType<BonnieBunnieTorsoTileEntity>> BONNIE_BUNNIE_TORSO = REGISTRY.register("bonnie_bunnie_torso",
			() -> BlockEntityType.Builder.of(BonnieBunnieTorsoTileEntity::new, FnafFrightsModBlocks.BONNIE_BUNNIE_TORSO.get()).build(null));
	public static final RegistryObject<BlockEntityType<BonnieBunnieLeftArmTileEntity>> BONNIE_BUNNIE_LEFT_ARM = REGISTRY.register("bonnie_bunnie_left_arm",
			() -> BlockEntityType.Builder.of(BonnieBunnieLeftArmTileEntity::new, FnafFrightsModBlocks.BONNIE_BUNNIE_LEFT_ARM.get()).build(null));
	public static final RegistryObject<BlockEntityType<BonnieBunnieRightArmTileEntity>> BONNIE_BUNNIE_RIGHT_ARM = REGISTRY.register("bonnie_bunnie_right_arm",
			() -> BlockEntityType.Builder.of(BonnieBunnieRightArmTileEntity::new, FnafFrightsModBlocks.BONNIE_BUNNIE_RIGHT_ARM.get()).build(null));
	public static final RegistryObject<BlockEntityType<BonnieBunnieHeadTileEntity>> BONNIE_BUNNIE_HEAD = REGISTRY.register("bonnie_bunnie_head",
			() -> BlockEntityType.Builder.of(BonnieBunnieHeadTileEntity::new, FnafFrightsModBlocks.BONNIE_BUNNIE_HEAD.get()).build(null));
	public static final RegistryObject<BlockEntityType<BonnieBunnieRightLegTileEntity>> BONNIE_BUNNIE_RIGHT_LEG = REGISTRY.register("bonnie_bunnie_right_leg",
			() -> BlockEntityType.Builder.of(BonnieBunnieRightLegTileEntity::new, FnafFrightsModBlocks.BONNIE_BUNNIE_RIGHT_LEG.get()).build(null));
	public static final RegistryObject<BlockEntityType<BonnieBunnieLeftLegTileEntity>> BONNIE_BUNNIE_LEFT_LEG = REGISTRY.register("bonnie_bunnie_left_leg",
			() -> BlockEntityType.Builder.of(BonnieBunnieLeftLegTileEntity::new, FnafFrightsModBlocks.BONNIE_BUNNIE_LEFT_LEG.get()).build(null));
	public static final RegistryObject<BlockEntityType<SpringBonnieBunnieTorsoTileEntity>> SPRING_BONNIE_BUNNIE_TORSO = REGISTRY.register("spring_bonnie_bunnie_torso",
			() -> BlockEntityType.Builder.of(SpringBonnieBunnieTorsoTileEntity::new, FnafFrightsModBlocks.SPRING_BONNIE_BUNNIE_TORSO.get()).build(null));
	public static final RegistryObject<BlockEntityType<SpringBonnieBunnieLeftArmTileEntity>> SPRING_BONNIE_BUNNIE_LEFT_ARM = REGISTRY.register("spring_bonnie_bunnie_left_arm",
			() -> BlockEntityType.Builder.of(SpringBonnieBunnieLeftArmTileEntity::new, FnafFrightsModBlocks.SPRING_BONNIE_BUNNIE_LEFT_ARM.get()).build(null));
	public static final RegistryObject<BlockEntityType<SpringBonnieBunnieRightArmTileEntity>> SPRING_BONNIE_BUNNIE_RIGHT_ARM = REGISTRY.register("spring_bonnie_bunnie_right_arm",
			() -> BlockEntityType.Builder.of(SpringBonnieBunnieRightArmTileEntity::new, FnafFrightsModBlocks.SPRING_BONNIE_BUNNIE_RIGHT_ARM.get()).build(null));
	public static final RegistryObject<BlockEntityType<SpringBonnieBunnieHeadTileEntity>> SPRING_BONNIE_BUNNIE_HEAD = REGISTRY.register("spring_bonnie_bunnie_head",
			() -> BlockEntityType.Builder.of(SpringBonnieBunnieHeadTileEntity::new, FnafFrightsModBlocks.SPRING_BONNIE_BUNNIE_HEAD.get()).build(null));
	public static final RegistryObject<BlockEntityType<SpringBonnieBunnieRightLegTileEntity>> SPRING_BONNIE_BUNNIE_RIGHT_LEG = REGISTRY.register("spring_bonnie_bunnie_right_leg",
			() -> BlockEntityType.Builder.of(SpringBonnieBunnieRightLegTileEntity::new, FnafFrightsModBlocks.SPRING_BONNIE_BUNNIE_RIGHT_LEG.get()).build(null));
	public static final RegistryObject<BlockEntityType<SpringBonnieBunnieLeftLegTileEntity>> SPRING_BONNIE_BUNNIE_LEFT_LEG = REGISTRY.register("spring_bonnie_bunnie_left_leg",
			() -> BlockEntityType.Builder.of(SpringBonnieBunnieLeftLegTileEntity::new, FnafFrightsModBlocks.SPRING_BONNIE_BUNNIE_LEFT_LEG.get()).build(null));
	public static final RegistryObject<BlockEntityType<Endo02FoxyHeadTileEntity>> ENDO_02_FOXY_HEAD = REGISTRY.register("endo_02_foxy_head",
			() -> BlockEntityType.Builder.of(Endo02FoxyHeadTileEntity::new, FnafFrightsModBlocks.ENDO_02_FOXY_HEAD.get()).build(null));
	public static final RegistryObject<BlockEntityType<Enod02BonnieHeadTileEntity>> ENOD_02_BONNIE_HEAD = REGISTRY.register("enod_02_bonnie_head",
			() -> BlockEntityType.Builder.of(Enod02BonnieHeadTileEntity::new, FnafFrightsModBlocks.ENOD_02_BONNIE_HEAD.get()).build(null));
	public static final RegistryObject<BlockEntityType<Endo02ChicaHeadTileEntity>> ENDO_02_CHICA_HEAD = REGISTRY.register("endo_02_chica_head",
			() -> BlockEntityType.Builder.of(Endo02ChicaHeadTileEntity::new, FnafFrightsModBlocks.ENDO_02_CHICA_HEAD.get()).build(null));
	public static final RegistryObject<BlockEntityType<FredBearTorsoTileEntity>> FRED_BEAR_TORSO = REGISTRY.register("fred_bear_torso",
			() -> BlockEntityType.Builder.of(FredBearTorsoTileEntity::new, FnafFrightsModBlocks.FRED_BEAR_TORSO.get()).build(null));
	public static final RegistryObject<BlockEntityType<FredBearLeftArmTileEntity>> FRED_BEAR_LEFT_ARM = REGISTRY.register("fred_bear_left_arm",
			() -> BlockEntityType.Builder.of(FredBearLeftArmTileEntity::new, FnafFrightsModBlocks.FRED_BEAR_LEFT_ARM.get()).build(null));
	public static final RegistryObject<BlockEntityType<FredBearRightArmTileEntity>> FRED_BEAR_RIGHT_ARM = REGISTRY.register("fred_bear_right_arm",
			() -> BlockEntityType.Builder.of(FredBearRightArmTileEntity::new, FnafFrightsModBlocks.FRED_BEAR_RIGHT_ARM.get()).build(null));
	public static final RegistryObject<BlockEntityType<FredBearHeadTileEntity>> FRED_BEAR_HEAD = REGISTRY.register("fred_bear_head",
			() -> BlockEntityType.Builder.of(FredBearHeadTileEntity::new, FnafFrightsModBlocks.FRED_BEAR_HEAD.get()).build(null));
	public static final RegistryObject<BlockEntityType<FredBearRightLegTileEntity>> FRED_BEAR_RIGHT_LEG = REGISTRY.register("fred_bear_right_leg",
			() -> BlockEntityType.Builder.of(FredBearRightLegTileEntity::new, FnafFrightsModBlocks.FRED_BEAR_RIGHT_LEG.get()).build(null));
	public static final RegistryObject<BlockEntityType<FredBearLeftLegTileEntity>> FRED_BEAR_LEFT_LEG = REGISTRY.register("fred_bear_left_leg",
			() -> BlockEntityType.Builder.of(FredBearLeftLegTileEntity::new, FnafFrightsModBlocks.FRED_BEAR_LEFT_LEG.get()).build(null));
	public static final RegistryObject<BlockEntityType<SpringBonnieTorsoTileEntity>> SPRING_BONNIE_TORSO = REGISTRY.register("spring_bonnie_torso",
			() -> BlockEntityType.Builder.of(SpringBonnieTorsoTileEntity::new, FnafFrightsModBlocks.SPRING_BONNIE_TORSO.get()).build(null));
	public static final RegistryObject<BlockEntityType<SpringBonnieLeftArmTileEntity>> SPRING_BONNIE_LEFT_ARM = REGISTRY.register("spring_bonnie_left_arm",
			() -> BlockEntityType.Builder.of(SpringBonnieLeftArmTileEntity::new, FnafFrightsModBlocks.SPRING_BONNIE_LEFT_ARM.get()).build(null));
	public static final RegistryObject<BlockEntityType<SpringBonnieRightArmTileEntity>> SPRING_BONNIE_RIGHT_ARM = REGISTRY.register("spring_bonnie_right_arm",
			() -> BlockEntityType.Builder.of(SpringBonnieRightArmTileEntity::new, FnafFrightsModBlocks.SPRING_BONNIE_RIGHT_ARM.get()).build(null));
	public static final RegistryObject<BlockEntityType<SpringBonnieHeadTileEntity>> SPRING_BONNIE_HEAD = REGISTRY.register("spring_bonnie_head",
			() -> BlockEntityType.Builder.of(SpringBonnieHeadTileEntity::new, FnafFrightsModBlocks.SPRING_BONNIE_HEAD.get()).build(null));
	public static final RegistryObject<BlockEntityType<SpringBonnieRightLegTileEntity>> SPRING_BONNIE_RIGHT_LEG = REGISTRY.register("spring_bonnie_right_leg",
			() -> BlockEntityType.Builder.of(SpringBonnieRightLegTileEntity::new, FnafFrightsModBlocks.SPRING_BONNIE_RIGHT_LEG.get()).build(null));
	public static final RegistryObject<BlockEntityType<SpringBonnieLeftLEgTileEntity>> SPRING_BONNIE_LEFT_L_EG = REGISTRY.register("spring_bonnie_left_l_eg",
			() -> BlockEntityType.Builder.of(SpringBonnieLeftLEgTileEntity::new, FnafFrightsModBlocks.SPRING_BONNIE_LEFT_L_EG.get()).build(null));
	public static final RegistryObject<BlockEntityType<FreddyFazbearTorsoTileEntity>> FREDDY_FAZBEAR_TORSO = REGISTRY.register("freddy_fazbear_torso",
			() -> BlockEntityType.Builder.of(FreddyFazbearTorsoTileEntity::new, FnafFrightsModBlocks.FREDDY_FAZBEAR_TORSO.get()).build(null));
	public static final RegistryObject<BlockEntityType<FreddyFazbearLeftArmTileEntity>> FREDDY_FAZBEAR_LEFT_ARM = REGISTRY.register("freddy_fazbear_left_arm",
			() -> BlockEntityType.Builder.of(FreddyFazbearLeftArmTileEntity::new, FnafFrightsModBlocks.FREDDY_FAZBEAR_LEFT_ARM.get()).build(null));
	public static final RegistryObject<BlockEntityType<FreddyFazbearRightArmTileEntity>> FREDDY_FAZBEAR_RIGHT_ARM = REGISTRY.register("freddy_fazbear_right_arm",
			() -> BlockEntityType.Builder.of(FreddyFazbearRightArmTileEntity::new, FnafFrightsModBlocks.FREDDY_FAZBEAR_RIGHT_ARM.get()).build(null));
	public static final RegistryObject<BlockEntityType<FreddyFazbearheadTileEntity>> FREDDY_FAZBEARHEAD = REGISTRY.register("freddy_fazbearhead",
			() -> BlockEntityType.Builder.of(FreddyFazbearheadTileEntity::new, FnafFrightsModBlocks.FREDDY_FAZBEARHEAD.get()).build(null));
	public static final RegistryObject<BlockEntityType<FreddyFazbearRightLegTileEntity>> FREDDY_FAZBEAR_RIGHT_LEG = REGISTRY.register("freddy_fazbear_right_leg",
			() -> BlockEntityType.Builder.of(FreddyFazbearRightLegTileEntity::new, FnafFrightsModBlocks.FREDDY_FAZBEAR_RIGHT_LEG.get()).build(null));
	public static final RegistryObject<BlockEntityType<FreddyFazbeareftLegTileEntity>> FREDDY_FAZBEAR_LEFT_LEG = REGISTRY.register("freddy_fazbear_left_leg",
			() -> BlockEntityType.Builder.of(FreddyFazbeareftLegTileEntity::new, FnafFrightsModBlocks.FREDDY_FAZBEAR_LEFT_LEG.get()).build(null));
	public static final RegistryObject<BlockEntityType<YellowBearTorsoTileEntity>> YELLOW_BEAR_TORSO = REGISTRY.register("yellow_bear_torso",
			() -> BlockEntityType.Builder.of(YellowBearTorsoTileEntity::new, FnafFrightsModBlocks.YELLOW_BEAR_TORSO.get()).build(null));
	public static final RegistryObject<BlockEntityType<YellowBearLeftArmTileEntity>> YELLOW_BEAR_LEFT_ARM = REGISTRY.register("yellow_bear_left_arm",
			() -> BlockEntityType.Builder.of(YellowBearLeftArmTileEntity::new, FnafFrightsModBlocks.YELLOW_BEAR_LEFT_ARM.get()).build(null));
	public static final RegistryObject<BlockEntityType<YellowBearRightArmTileEntity>> YELLOW_BEAR_RIGHT_ARM = REGISTRY.register("yellow_bear_right_arm",
			() -> BlockEntityType.Builder.of(YellowBearRightArmTileEntity::new, FnafFrightsModBlocks.YELLOW_BEAR_RIGHT_ARM.get()).build(null));
	public static final RegistryObject<BlockEntityType<YellowBearHeadTileEntity>> YELLOW_BEAR_HEAD = REGISTRY.register("yellow_bear_head",
			() -> BlockEntityType.Builder.of(YellowBearHeadTileEntity::new, FnafFrightsModBlocks.YELLOW_BEAR_HEAD.get()).build(null));
	public static final RegistryObject<BlockEntityType<YellowBearRightLegTileEntity>> YELLOW_BEAR_RIGHT_LEG = REGISTRY.register("yellow_bear_right_leg",
			() -> BlockEntityType.Builder.of(YellowBearRightLegTileEntity::new, FnafFrightsModBlocks.YELLOW_BEAR_RIGHT_LEG.get()).build(null));
	public static final RegistryObject<BlockEntityType<YellowBearLeftLegTileEntity>> YELLOW_BEAR_LEFT_LEG = REGISTRY.register("yellow_bear_left_leg",
			() -> BlockEntityType.Builder.of(YellowBearLeftLegTileEntity::new, FnafFrightsModBlocks.YELLOW_BEAR_LEFT_LEG.get()).build(null));
	public static final RegistryObject<BlockEntityType<GlitchBonnieTorsoTileEntity>> GLITCH_BONNIE_TORSO = REGISTRY.register("glitch_bonnie_torso",
			() -> BlockEntityType.Builder.of(GlitchBonnieTorsoTileEntity::new, FnafFrightsModBlocks.GLITCH_BONNIE_TORSO.get()).build(null));
	public static final RegistryObject<BlockEntityType<GlitchBonnieHeadTileEntity>> GLITCH_BONNIE_HEAD = REGISTRY.register("glitch_bonnie_head",
			() -> BlockEntityType.Builder.of(GlitchBonnieHeadTileEntity::new, FnafFrightsModBlocks.GLITCH_BONNIE_HEAD.get()).build(null));
	public static final RegistryObject<BlockEntityType<Endo01TorsoTileEntity>> ENDO_01_TORSO = REGISTRY.register("endo_01_torso", () -> BlockEntityType.Builder.of(Endo01TorsoTileEntity::new, FnafFrightsModBlocks.ENDO_01_TORSO.get()).build(null));
	public static final RegistryObject<BlockEntityType<Endo01LeftArmTileEntity>> ENDO_01_LEFT_ARM = REGISTRY.register("endo_01_left_arm",
			() -> BlockEntityType.Builder.of(Endo01LeftArmTileEntity::new, FnafFrightsModBlocks.ENDO_01_LEFT_ARM.get()).build(null));
	public static final RegistryObject<BlockEntityType<Endo01RightArmTileEntity>> ENDO_01_RIGHT_ARM = REGISTRY.register("endo_01_right_arm",
			() -> BlockEntityType.Builder.of(Endo01RightArmTileEntity::new, FnafFrightsModBlocks.ENDO_01_RIGHT_ARM.get()).build(null));
	public static final RegistryObject<BlockEntityType<Endo01HeadTileEntity>> ENDO_01_HEAD = REGISTRY.register("endo_01_head", () -> BlockEntityType.Builder.of(Endo01HeadTileEntity::new, FnafFrightsModBlocks.ENDO_01_HEAD.get()).build(null));
	public static final RegistryObject<BlockEntityType<Endo01RightLegTileEntity>> ENDO_01_RIGHT_LEG = REGISTRY.register("endo_01_right_leg",
			() -> BlockEntityType.Builder.of(Endo01RightLegTileEntity::new, FnafFrightsModBlocks.ENDO_01_RIGHT_LEG.get()).build(null));
	public static final RegistryObject<BlockEntityType<Endo01LeftLegTileEntity>> ENDO_01_LEFT_LEG = REGISTRY.register("endo_01_left_leg",
			() -> BlockEntityType.Builder.of(Endo01LeftLegTileEntity::new, FnafFrightsModBlocks.ENDO_01_LEFT_LEG.get()).build(null));
	public static final RegistryObject<BlockEntityType<FreddyBoxSpinTileEntity>> FREDDY_BOX_SPIN = REGISTRY.register("freddy_box_spin",
			() -> BlockEntityType.Builder.of(FreddyBoxSpinTileEntity::new, FnafFrightsModBlocks.FREDDY_BOX_SPIN.get()).build(null));
	public static final RegistryObject<BlockEntityType<FreddyBoxActiveTileEntity>> FREDDY_BOX_ACTIVE = REGISTRY.register("freddy_box_active",
			() -> BlockEntityType.Builder.of(FreddyBoxActiveTileEntity::new, FnafFrightsModBlocks.FREDDY_BOX_ACTIVE.get()).build(null));
	public static final RegistryObject<BlockEntityType<ChicaChickenTorsoTileEntity>> CHICA_CHICKEN_TORSO = REGISTRY.register("chica_chicken_torso",
			() -> BlockEntityType.Builder.of(ChicaChickenTorsoTileEntity::new, FnafFrightsModBlocks.CHICA_CHICKEN_TORSO.get()).build(null));
	public static final RegistryObject<BlockEntityType<ChicaChickenLeftArmTileEntity>> CHICA_CHICKEN_LEFT_ARM = REGISTRY.register("chica_chicken_left_arm",
			() -> BlockEntityType.Builder.of(ChicaChickenLeftArmTileEntity::new, FnafFrightsModBlocks.CHICA_CHICKEN_LEFT_ARM.get()).build(null));
	public static final RegistryObject<BlockEntityType<ChicaChickenRightArmTileEntity>> CHICA_CHICKEN_RIGHT_ARM = REGISTRY.register("chica_chicken_right_arm",
			() -> BlockEntityType.Builder.of(ChicaChickenRightArmTileEntity::new, FnafFrightsModBlocks.CHICA_CHICKEN_RIGHT_ARM.get()).build(null));
	public static final RegistryObject<BlockEntityType<ChicaChickenHeadTileEntity>> CHICA_CHICKEN_HEAD = REGISTRY.register("chica_chicken_head",
			() -> BlockEntityType.Builder.of(ChicaChickenHeadTileEntity::new, FnafFrightsModBlocks.CHICA_CHICKEN_HEAD.get()).build(null));
	public static final RegistryObject<BlockEntityType<ChicaChickenRightLegTileEntity>> CHICA_CHICKEN_RIGHT_LEG = REGISTRY.register("chica_chicken_right_leg",
			() -> BlockEntityType.Builder.of(ChicaChickenRightLegTileEntity::new, FnafFrightsModBlocks.CHICA_CHICKEN_RIGHT_LEG.get()).build(null));
	public static final RegistryObject<BlockEntityType<ChicaChickenLeftLegTileEntity>> CHICA_CHICKEN_LEFT_LEG = REGISTRY.register("chica_chicken_left_leg",
			() -> BlockEntityType.Builder.of(ChicaChickenLeftLegTileEntity::new, FnafFrightsModBlocks.CHICA_CHICKEN_LEFT_LEG.get()).build(null));
	public static final RegistryObject<BlockEntityType<PuppetBoxGiftTileEntity>> PUPPET_BOX_GIFT = REGISTRY.register("puppet_box_gift",
			() -> BlockEntityType.Builder.of(PuppetBoxGiftTileEntity::new, FnafFrightsModBlocks.PUPPET_BOX_GIFT.get()).build(null));
	public static final RegistryObject<BlockEntityType<PuppetBoxSlumpedTileEntity>> PUPPET_BOX_SLUMPED = REGISTRY.register("puppet_box_slumped",
			() -> BlockEntityType.Builder.of(PuppetBoxSlumpedTileEntity::new, FnafFrightsModBlocks.PUPPET_BOX_SLUMPED.get()).build(null));
	public static final RegistryObject<BlockEntityType<PuppetBoxWindingTileEntity>> PUPPET_BOX_WINDING = REGISTRY.register("puppet_box_winding",
			() -> BlockEntityType.Builder.of(PuppetBoxWindingTileEntity::new, FnafFrightsModBlocks.PUPPET_BOX_WINDING.get()).build(null));
	public static final RegistryObject<BlockEntityType<PuppetBoxJumpscareTileEntity>> PUPPET_BOX_JUMPSCARE = REGISTRY.register("puppet_box_jumpscare",
			() -> BlockEntityType.Builder.of(PuppetBoxJumpscareTileEntity::new, FnafFrightsModBlocks.PUPPET_BOX_JUMPSCARE.get()).build(null));
	public static final RegistryObject<BlockEntityType<FoxyPirateTorsoTileEntity>> FOXY_PIRATE_TORSO = REGISTRY.register("foxy_pirate_torso",
			() -> BlockEntityType.Builder.of(FoxyPirateTorsoTileEntity::new, FnafFrightsModBlocks.FOXY_PIRATE_TORSO.get()).build(null));
	public static final RegistryObject<BlockEntityType<FoxyPirateLeftArmTileEntity>> FOXY_PIRATE_LEFT_ARM = REGISTRY.register("foxy_pirate_left_arm",
			() -> BlockEntityType.Builder.of(FoxyPirateLeftArmTileEntity::new, FnafFrightsModBlocks.FOXY_PIRATE_LEFT_ARM.get()).build(null));
	public static final RegistryObject<BlockEntityType<FoxyPirateRightArmTileEntity>> FOXY_PIRATE_RIGHT_ARM = REGISTRY.register("foxy_pirate_right_arm",
			() -> BlockEntityType.Builder.of(FoxyPirateRightArmTileEntity::new, FnafFrightsModBlocks.FOXY_PIRATE_RIGHT_ARM.get()).build(null));
	public static final RegistryObject<BlockEntityType<FoxyPirateHeadTileEntity>> FOXY_PIRATE_HEAD = REGISTRY.register("foxy_pirate_head",
			() -> BlockEntityType.Builder.of(FoxyPirateHeadTileEntity::new, FnafFrightsModBlocks.FOXY_PIRATE_HEAD.get()).build(null));
	public static final RegistryObject<BlockEntityType<FoxyPirateRightLegTileEntity>> FOXY_PIRATE_RIGHT_LEG = REGISTRY.register("foxy_pirate_right_leg",
			() -> BlockEntityType.Builder.of(FoxyPirateRightLegTileEntity::new, FnafFrightsModBlocks.FOXY_PIRATE_RIGHT_LEG.get()).build(null));
	public static final RegistryObject<BlockEntityType<FoxyPirateLeftLegTileEntity>> FOXY_PIRATE_LEFT_LEG = REGISTRY.register("foxy_pirate_left_leg",
			() -> BlockEntityType.Builder.of(FoxyPirateLeftLegTileEntity::new, FnafFrightsModBlocks.FOXY_PIRATE_LEFT_LEG.get()).build(null));
	public static final RegistryObject<BlockEntityType<BrokenFoxyPirateTorsoTileEntity>> BROKEN_FOXY_PIRATE_TORSO = REGISTRY.register("broken_foxy_pirate_torso",
			() -> BlockEntityType.Builder.of(BrokenFoxyPirateTorsoTileEntity::new, FnafFrightsModBlocks.BROKEN_FOXY_PIRATE_TORSO.get()).build(null));
	public static final RegistryObject<BlockEntityType<BrokenFoxyPirateLeftArmTileEntity>> BROKEN_FOXY_PIRATE_LEFT_ARM = REGISTRY.register("broken_foxy_pirate_left_arm",
			() -> BlockEntityType.Builder.of(BrokenFoxyPirateLeftArmTileEntity::new, FnafFrightsModBlocks.BROKEN_FOXY_PIRATE_LEFT_ARM.get()).build(null));
	public static final RegistryObject<BlockEntityType<BrokenFoxyPirateRightArmTileEntity>> BROKEN_FOXY_PIRATE_RIGHT_ARM = REGISTRY.register("broken_foxy_pirate_right_arm",
			() -> BlockEntityType.Builder.of(BrokenFoxyPirateRightArmTileEntity::new, FnafFrightsModBlocks.BROKEN_FOXY_PIRATE_RIGHT_ARM.get()).build(null));
	public static final RegistryObject<BlockEntityType<BrokenFoxyPirateHeadTileEntity>> BROKEN_FOXY_PIRATE_HEAD = REGISTRY.register("broken_foxy_pirate_head",
			() -> BlockEntityType.Builder.of(BrokenFoxyPirateHeadTileEntity::new, FnafFrightsModBlocks.BROKEN_FOXY_PIRATE_HEAD.get()).build(null));
	public static final RegistryObject<BlockEntityType<BrokenFoxyPirateRightLegTileEntity>> BROKEN_FOXY_PIRATE_RIGHT_LEG = REGISTRY.register("broken_foxy_pirate_right_leg",
			() -> BlockEntityType.Builder.of(BrokenFoxyPirateRightLegTileEntity::new, FnafFrightsModBlocks.BROKEN_FOXY_PIRATE_RIGHT_LEG.get()).build(null));
	public static final RegistryObject<BlockEntityType<BrokenFoxyPirateLeftLegTileEntity>> BROKEN_FOXY_PIRATE_LEFT_LEG = REGISTRY.register("broken_foxy_pirate_left_leg",
			() -> BlockEntityType.Builder.of(BrokenFoxyPirateLeftLegTileEntity::new, FnafFrightsModBlocks.BROKEN_FOXY_PIRATE_LEFT_LEG.get()).build(null));
	public static final RegistryObject<BlockEntityType<OffsetFreddyFazbearShowtimeTileEntity>> OFFSET_FREDDY_FAZBEAR_SHOWTIME = REGISTRY.register("offset_freddy_fazbear_showtime",
			() -> BlockEntityType.Builder.of(OffsetFreddyFazbearShowtimeTileEntity::new, FnafFrightsModBlocks.OFFSET_FREDDY_FAZBEAR_SHOWTIME.get()).build(null));
	public static final RegistryObject<BlockEntityType<OffsetFreddyFazbearActiveTileEntity>> OFFSET_FREDDY_FAZBEAR_ACTIVE = REGISTRY.register("offset_freddy_fazbear_active",
			() -> BlockEntityType.Builder.of(OffsetFreddyFazbearActiveTileEntity::new, FnafFrightsModBlocks.OFFSET_FREDDY_FAZBEAR_ACTIVE.get()).build(null));
	public static final RegistryObject<BlockEntityType<OffsetFredBearShowtimeTileEntity>> OFFSET_FRED_BEAR_SHOWTIME = REGISTRY.register("offset_fred_bear_showtime",
			() -> BlockEntityType.Builder.of(OffsetFredBearShowtimeTileEntity::new, FnafFrightsModBlocks.OFFSET_FRED_BEAR_SHOWTIME.get()).build(null));
	public static final RegistryObject<BlockEntityType<OffsetFredBearActiveTileEntity>> OFFSET_FRED_BEAR_ACTIVE = REGISTRY.register("offset_fred_bear_active",
			() -> BlockEntityType.Builder.of(OffsetFredBearActiveTileEntity::new, FnafFrightsModBlocks.OFFSET_FRED_BEAR_ACTIVE.get()).build(null));
	public static final RegistryObject<BlockEntityType<OffsetToyFreddyShowtimeTileEntity>> OFFSET_TOY_FREDDY_SHOWTIME = REGISTRY.register("offset_toy_freddy_showtime",
			() -> BlockEntityType.Builder.of(OffsetToyFreddyShowtimeTileEntity::new, FnafFrightsModBlocks.OFFSET_TOY_FREDDY_SHOWTIME.get()).build(null));
	public static final RegistryObject<BlockEntityType<OffsetToyFreddyActiveTileEntity>> OFFSET_TOY_FREDDY_ACTIVE = REGISTRY.register("offset_toy_freddy_active",
			() -> BlockEntityType.Builder.of(OffsetToyFreddyActiveTileEntity::new, FnafFrightsModBlocks.OFFSET_TOY_FREDDY_ACTIVE.get()).build(null));
	public static final RegistryObject<BlockEntityType<OffsetSpringBonnieShowtimeTileEntity>> OFFSET_SPRING_BONNIE_SHOWTIME = REGISTRY.register("offset_spring_bonnie_showtime",
			() -> BlockEntityType.Builder.of(OffsetSpringBonnieShowtimeTileEntity::new, FnafFrightsModBlocks.OFFSET_SPRING_BONNIE_SHOWTIME.get()).build(null));
	public static final RegistryObject<BlockEntityType<OffsetSpringBonnieActiveTileEntity>> OFFSET_SPRING_BONNIE_ACTIVE = REGISTRY.register("offset_spring_bonnie_active",
			() -> BlockEntityType.Builder.of(OffsetSpringBonnieActiveTileEntity::new, FnafFrightsModBlocks.OFFSET_SPRING_BONNIE_ACTIVE.get()).build(null));
	public static final RegistryObject<BlockEntityType<OffsetFoxyShowtimeTileEntity>> OFFSET_FOXY_SHOWTIME = REGISTRY.register("offset_foxy_showtime",
			() -> BlockEntityType.Builder.of(OffsetFoxyShowtimeTileEntity::new, FnafFrightsModBlocks.OFFSET_FOXY_SHOWTIME.get()).build(null));
	public static final RegistryObject<BlockEntityType<OffsetFoxyActiveTileEntity>> OFFSET_FOXY_ACTIVE = REGISTRY.register("offset_foxy_active",
			() -> BlockEntityType.Builder.of(OffsetFoxyActiveTileEntity::new, FnafFrightsModBlocks.OFFSET_FOXY_ACTIVE.get()).build(null));
	public static final RegistryObject<BlockEntityType<OffsetFoxyPirateShowtimeTileEntity>> OFFSET_FOXY_PIRATE_SHOWTIME = REGISTRY.register("offset_foxy_pirate_showtime",
			() -> BlockEntityType.Builder.of(OffsetFoxyPirateShowtimeTileEntity::new, FnafFrightsModBlocks.OFFSET_FOXY_PIRATE_SHOWTIME.get()).build(null));
	public static final RegistryObject<BlockEntityType<OffsetFoxyPirateActiveTileEntity>> OFFSET_FOXY_PIRATE_ACTIVE = REGISTRY.register("offset_foxy_pirate_active",
			() -> BlockEntityType.Builder.of(OffsetFoxyPirateActiveTileEntity::new, FnafFrightsModBlocks.OFFSET_FOXY_PIRATE_ACTIVE.get()).build(null));
	public static final RegistryObject<BlockEntityType<OffsetFixedFoxyShowtimeTileEntity>> OFFSET_FIXED_FOXY_SHOWTIME = REGISTRY.register("offset_fixed_foxy_showtime",
			() -> BlockEntityType.Builder.of(OffsetFixedFoxyShowtimeTileEntity::new, FnafFrightsModBlocks.OFFSET_FIXED_FOXY_SHOWTIME.get()).build(null));
	public static final RegistryObject<BlockEntityType<OffsetFixedFoxyActiveTileEntity>> OFFSET_FIXED_FOXY_ACTIVE = REGISTRY.register("offset_fixed_foxy_active",
			() -> BlockEntityType.Builder.of(OffsetFixedFoxyActiveTileEntity::new, FnafFrightsModBlocks.OFFSET_FIXED_FOXY_ACTIVE.get()).build(null));
	public static final RegistryObject<BlockEntityType<OffsetToyFoxyShowtimeTileEntity>> OFFSET_TOY_FOXY_SHOWTIME = REGISTRY.register("offset_toy_foxy_showtime",
			() -> BlockEntityType.Builder.of(OffsetToyFoxyShowtimeTileEntity::new, FnafFrightsModBlocks.OFFSET_TOY_FOXY_SHOWTIME.get()).build(null));
	public static final RegistryObject<BlockEntityType<OffsetToyFoxyActiveTileEntity>> OFFSET_TOY_FOXY_ACTIVE = REGISTRY.register("offset_toy_foxy_active",
			() -> BlockEntityType.Builder.of(OffsetToyFoxyActiveTileEntity::new, FnafFrightsModBlocks.OFFSET_TOY_FOXY_ACTIVE.get()).build(null));
	public static final RegistryObject<BlockEntityType<GeneratorTileEntity>> GENERATOR = REGISTRY.register("generator", () -> BlockEntityType.Builder.of(GeneratorTileEntity::new, FnafFrightsModBlocks.GENERATOR.get()).build(null));
	public static final RegistryObject<BlockEntityType<Generator1TileEntity>> GENERATOR_1 = REGISTRY.register("generator_1", () -> BlockEntityType.Builder.of(Generator1TileEntity::new, FnafFrightsModBlocks.GENERATOR_1.get()).build(null));
	public static final RegistryObject<BlockEntityType<Generator2TileEntity>> GENERATOR_2 = REGISTRY.register("generator_2", () -> BlockEntityType.Builder.of(Generator2TileEntity::new, FnafFrightsModBlocks.GENERATOR_2.get()).build(null));
	public static final RegistryObject<BlockEntityType<Generator3TileEntity>> GENERATOR_3 = REGISTRY.register("generator_3", () -> BlockEntityType.Builder.of(Generator3TileEntity::new, FnafFrightsModBlocks.GENERATOR_3.get()).build(null));
	public static final RegistryObject<BlockEntityType<Generator4TileEntity>> GENERATOR_4 = REGISTRY.register("generator_4", () -> BlockEntityType.Builder.of(Generator4TileEntity::new, FnafFrightsModBlocks.GENERATOR_4.get()).build(null));
	public static final RegistryObject<BlockEntityType<Generator5TileEntity>> GENERATOR_5 = REGISTRY.register("generator_5", () -> BlockEntityType.Builder.of(Generator5TileEntity::new, FnafFrightsModBlocks.GENERATOR_5.get()).build(null));
	public static final RegistryObject<BlockEntityType<Generator6TileEntity>> GENERATOR_6 = REGISTRY.register("generator_6", () -> BlockEntityType.Builder.of(Generator6TileEntity::new, FnafFrightsModBlocks.GENERATOR_6.get()).build(null));
	public static final RegistryObject<BlockEntityType<Generator7TileEntity>> GENERATOR_7 = REGISTRY.register("generator_7", () -> BlockEntityType.Builder.of(Generator7TileEntity::new, FnafFrightsModBlocks.GENERATOR_7.get()).build(null));
	public static final RegistryObject<BlockEntityType<Generator8TileEntity>> GENERATOR_8 = REGISTRY.register("generator_8", () -> BlockEntityType.Builder.of(Generator8TileEntity::new, FnafFrightsModBlocks.GENERATOR_8.get()).build(null));
	public static final RegistryObject<BlockEntityType<ChristmasFreddyTileEntity>> CHRISTMAS_FREDDY = REGISTRY.register("christmas_freddy",
			() -> BlockEntityType.Builder.of(ChristmasFreddyTileEntity::new, FnafFrightsModBlocks.CHRISTMAS_FREDDY.get()).build(null));
	public static final RegistryObject<BlockEntityType<ChristmasFreddyATileEntity>> CHRISTMAS_FREDDY_A = REGISTRY.register("christmas_freddy_a",
			() -> BlockEntityType.Builder.of(ChristmasFreddyATileEntity::new, FnafFrightsModBlocks.CHRISTMAS_FREDDY_A.get()).build(null));
	public static final RegistryObject<BlockEntityType<ChristmasBonnieTileEntity>> CHRISTMAS_BONNIE = REGISTRY.register("christmas_bonnie",
			() -> BlockEntityType.Builder.of(ChristmasBonnieTileEntity::new, FnafFrightsModBlocks.CHRISTMAS_BONNIE.get()).build(null));
	public static final RegistryObject<BlockEntityType<ChristmasBonnieATileEntity>> CHRISTMAS_BONNIE_A = REGISTRY.register("christmas_bonnie_a",
			() -> BlockEntityType.Builder.of(ChristmasBonnieATileEntity::new, FnafFrightsModBlocks.CHRISTMAS_BONNIE_A.get()).build(null));
	public static final RegistryObject<BlockEntityType<ChristmasChicaTileEntity>> CHRISTMAS_CHICA = REGISTRY.register("christmas_chica",
			() -> BlockEntityType.Builder.of(ChristmasChicaTileEntity::new, FnafFrightsModBlocks.CHRISTMAS_CHICA.get()).build(null));
	public static final RegistryObject<BlockEntityType<ChristmasChicaATileEntity>> CHRISTMAS_CHICA_A = REGISTRY.register("christmas_chica_a",
			() -> BlockEntityType.Builder.of(ChristmasChicaATileEntity::new, FnafFrightsModBlocks.CHRISTMAS_CHICA_A.get()).build(null));
	public static final RegistryObject<BlockEntityType<ChristmasFoxyTileEntity>> CHRISTMAS_FOXY = REGISTRY.register("christmas_foxy",
			() -> BlockEntityType.Builder.of(ChristmasFoxyTileEntity::new, FnafFrightsModBlocks.CHRISTMAS_FOXY.get()).build(null));
	public static final RegistryObject<BlockEntityType<ChristmasFoxyATileEntity>> CHRISTMAS_FOXY_A = REGISTRY.register("christmas_foxy_a",
			() -> BlockEntityType.Builder.of(ChristmasFoxyATileEntity::new, FnafFrightsModBlocks.CHRISTMAS_FOXY_A.get()).build(null));
	public static final RegistryObject<BlockEntityType<Endo02BlockTileEntity>> ENDO_02_BLOCK = REGISTRY.register("endo_02_block", () -> BlockEntityType.Builder.of(Endo02BlockTileEntity::new, FnafFrightsModBlocks.ENDO_02_BLOCK.get()).build(null));
	public static final RegistryObject<BlockEntityType<VassilisTileEntity>> VASSILIS = REGISTRY.register("vassilis", () -> BlockEntityType.Builder.of(VassilisTileEntity::new, FnafFrightsModBlocks.VASSILIS.get()).build(null));
	public static final RegistryObject<BlockEntityType<VassilisATileEntity>> VASSILIS_A = REGISTRY.register("vassilis_a", () -> BlockEntityType.Builder.of(VassilisATileEntity::new, FnafFrightsModBlocks.VASSILIS_A.get()).build(null));
	public static final RegistryObject<BlockEntityType<VasstronicTileEntity>> VASSTRONIC = REGISTRY.register("vasstronic", () -> BlockEntityType.Builder.of(VasstronicTileEntity::new, FnafFrightsModBlocks.VASSTRONIC.get()).build(null));
	public static final RegistryObject<BlockEntityType<BlloonBoyStatueTileEntity>> BLLOON_BOY_STATUE = REGISTRY.register("blloon_boy_statue",
			() -> BlockEntityType.Builder.of(BlloonBoyStatueTileEntity::new, FnafFrightsModBlocks.BLLOON_BOY_STATUE.get()).build(null));
	public static final RegistryObject<BlockEntityType<ToyCarnieShowtimeTileEntity>> TOY_CARNIE_SHOWTIME = REGISTRY.register("toy_carnie_showtime",
			() -> BlockEntityType.Builder.of(ToyCarnieShowtimeTileEntity::new, FnafFrightsModBlocks.TOY_CARNIE_SHOWTIME.get()).build(null));
	public static final RegistryObject<BlockEntityType<ToyCarnieActiveTileEntity>> TOY_CARNIE_ACTIVE = REGISTRY.register("toy_carnie_active",
			() -> BlockEntityType.Builder.of(ToyCarnieActiveTileEntity::new, FnafFrightsModBlocks.TOY_CARNIE_ACTIVE.get()).build(null));
	public static final RegistryObject<BlockEntityType<CaptainFoxyStatueTileEntity>> CAPTAIN_FOXY_STATUE = REGISTRY.register("captain_foxy_statue",
			() -> BlockEntityType.Builder.of(CaptainFoxyStatueTileEntity::new, FnafFrightsModBlocks.CAPTAIN_FOXY_STATUE.get()).build(null));
	public static final RegistryObject<BlockEntityType<AngledToyCarnieTileEntity>> ANGLED_TOY_CARNIE = REGISTRY.register("angled_toy_carnie",
			() -> BlockEntityType.Builder.of(AngledToyCarnieTileEntity::new, FnafFrightsModBlocks.ANGLED_TOY_CARNIE.get()).build(null));
	public static final RegistryObject<BlockEntityType<AngledBlloonBoyStatueTileEntity>> ANGLED_BLLOON_BOY_STATUE = REGISTRY.register("angled_blloon_boy_statue",
			() -> BlockEntityType.Builder.of(AngledBlloonBoyStatueTileEntity::new, FnafFrightsModBlocks.ANGLED_BLLOON_BOY_STATUE.get()).build(null));
	public static final RegistryObject<BlockEntityType<PuppetwalldecorTileEntity>> PUPPETWALLDECOR = REGISTRY.register("puppetwalldecor",
			() -> BlockEntityType.Builder.of(PuppetwalldecorTileEntity::new, FnafFrightsModBlocks.PUPPETWALLDECOR.get()).build(null));
	public static final RegistryObject<BlockEntityType<BurntToyFreddyJumpscareTileEntity>> BURNT_TOY_FREDDY_JUMPSCARE = REGISTRY.register("burnt_toy_freddy_jumpscare",
			() -> BlockEntityType.Builder.of(BurntToyFreddyJumpscareTileEntity::new, FnafFrightsModBlocks.BURNT_TOY_FREDDY_JUMPSCARE.get()).build(null));
	public static final RegistryObject<BlockEntityType<BurntToyBonnieJumpscareTileEntity>> BURNT_TOY_BONNIE_JUMPSCARE = REGISTRY.register("burnt_toy_bonnie_jumpscare",
			() -> BlockEntityType.Builder.of(BurntToyBonnieJumpscareTileEntity::new, FnafFrightsModBlocks.BURNT_TOY_BONNIE_JUMPSCARE.get()).build(null));
	public static final RegistryObject<BlockEntityType<BurntToyChicaTileEntity>> BURNT_TOY_CHICA = REGISTRY.register("burnt_toy_chica",
			() -> BlockEntityType.Builder.of(BurntToyChicaTileEntity::new, FnafFrightsModBlocks.BURNT_TOY_CHICA.get()).build(null));

	private static RegistryObject<BlockEntityType<?>> register(String registryname, RegistryObject<Block> block, BlockEntityType.BlockEntitySupplier<?> supplier) {
		return REGISTRY.register(registryname, () -> BlockEntityType.Builder.of(supplier, block.get()).build(null));
	}
}
