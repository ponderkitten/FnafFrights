package net.mcreator.fnaffrights.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnaffrights.block.display.FredBearTorsoDisplayItem;

public class FredBearTorsoDisplayModel extends AnimatedGeoModel<FredBearTorsoDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(FredBearTorsoDisplayItem animatable) {
		return new ResourceLocation("fnaf_frights", "animations/fredbeartorso.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(FredBearTorsoDisplayItem animatable) {
		return new ResourceLocation("fnaf_frights", "geo/fredbeartorso.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(FredBearTorsoDisplayItem entity) {
		return new ResourceLocation("fnaf_frights", "textures/blocks/fredbear4.png");
	}
}
