package net.mcreator.fnaffrights.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnaffrights.block.display.FredBearRightLegDisplayItem;

public class FredBearRightLegDisplayModel extends AnimatedGeoModel<FredBearRightLegDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(FredBearRightLegDisplayItem animatable) {
		return new ResourceLocation("fnaf_frights", "animations/fredbearrightleg.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(FredBearRightLegDisplayItem animatable) {
		return new ResourceLocation("fnaf_frights", "geo/fredbearrightleg.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(FredBearRightLegDisplayItem entity) {
		return new ResourceLocation("fnaf_frights", "textures/blocks/fredbear4.png");
	}
}
