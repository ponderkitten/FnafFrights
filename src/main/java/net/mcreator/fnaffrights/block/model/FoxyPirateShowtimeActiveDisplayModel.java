package net.mcreator.fnaffrights.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnaffrights.block.display.FoxyPirateShowtimeActiveDisplayItem;

public class FoxyPirateShowtimeActiveDisplayModel extends AnimatedGeoModel<FoxyPirateShowtimeActiveDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(FoxyPirateShowtimeActiveDisplayItem animatable) {
		return new ResourceLocation("fnaf_frights", "animations/foxypirateshowtimeactive.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(FoxyPirateShowtimeActiveDisplayItem animatable) {
		return new ResourceLocation("fnaf_frights", "geo/foxypirateshowtimeactive.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(FoxyPirateShowtimeActiveDisplayItem entity) {
		return new ResourceLocation("fnaf_frights", "textures/blocks/foxy.png");
	}
}
