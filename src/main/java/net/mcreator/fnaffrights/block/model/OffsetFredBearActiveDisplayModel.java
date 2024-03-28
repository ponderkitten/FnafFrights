package net.mcreator.fnaffrights.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnaffrights.block.display.OffsetFredBearActiveDisplayItem;

public class OffsetFredBearActiveDisplayModel extends AnimatedGeoModel<OffsetFredBearActiveDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(OffsetFredBearActiveDisplayItem animatable) {
		return new ResourceLocation("fnaf_frights", "animations/ofredbearshowtimeactive.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(OffsetFredBearActiveDisplayItem animatable) {
		return new ResourceLocation("fnaf_frights", "geo/ofredbearshowtimeactive.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(OffsetFredBearActiveDisplayItem entity) {
		return new ResourceLocation("fnaf_frights", "textures/blocks/fredbear4.png");
	}
}
