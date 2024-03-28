package net.mcreator.fnaffrights.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnaffrights.block.display.AShavenBonnieActiveDisplayItem;

public class AShavenBonnieActiveDisplayModel extends AnimatedGeoModel<AShavenBonnieActiveDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(AShavenBonnieActiveDisplayItem animatable) {
		return new ResourceLocation("fnaf_frights", "animations/abonnieshowtimeactive.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(AShavenBonnieActiveDisplayItem animatable) {
		return new ResourceLocation("fnaf_frights", "geo/abonnieshowtimeactive.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(AShavenBonnieActiveDisplayItem entity) {
		return new ResourceLocation("fnaf_frights", "textures/blocks/unbonnie.png");
	}
}
