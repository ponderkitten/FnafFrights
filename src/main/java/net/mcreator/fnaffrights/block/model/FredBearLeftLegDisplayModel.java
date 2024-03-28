package net.mcreator.fnaffrights.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnaffrights.block.display.FredBearLeftLegDisplayItem;

public class FredBearLeftLegDisplayModel extends AnimatedGeoModel<FredBearLeftLegDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(FredBearLeftLegDisplayItem animatable) {
		return new ResourceLocation("fnaf_frights", "animations/fredbearleftleg.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(FredBearLeftLegDisplayItem animatable) {
		return new ResourceLocation("fnaf_frights", "geo/fredbearleftleg.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(FredBearLeftLegDisplayItem entity) {
		return new ResourceLocation("fnaf_frights", "textures/blocks/fredbear4.png");
	}
}
