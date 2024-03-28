package net.mcreator.fnaffrights.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnaffrights.block.display.FredBearHeadDisplayItem;

public class FredBearHeadDisplayModel extends AnimatedGeoModel<FredBearHeadDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(FredBearHeadDisplayItem animatable) {
		return new ResourceLocation("fnaf_frights", "animations/fredbearhead.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(FredBearHeadDisplayItem animatable) {
		return new ResourceLocation("fnaf_frights", "geo/fredbearhead.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(FredBearHeadDisplayItem entity) {
		return new ResourceLocation("fnaf_frights", "textures/blocks/fredbear4.png");
	}
}
