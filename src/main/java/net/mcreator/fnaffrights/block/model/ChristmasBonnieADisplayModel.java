package net.mcreator.fnaffrights.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnaffrights.block.display.ChristmasBonnieADisplayItem;

public class ChristmasBonnieADisplayModel extends AnimatedGeoModel<ChristmasBonnieADisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(ChristmasBonnieADisplayItem animatable) {
		return new ResourceLocation("fnaf_frights", "animations/christmasbonnieactive.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(ChristmasBonnieADisplayItem animatable) {
		return new ResourceLocation("fnaf_frights", "geo/christmasbonnieactive.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(ChristmasBonnieADisplayItem entity) {
		return new ResourceLocation("fnaf_frights", "textures/blocks/christmasbonnieflat.png");
	}
}
