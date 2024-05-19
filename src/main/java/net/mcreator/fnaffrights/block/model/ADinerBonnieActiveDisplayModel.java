package net.mcreator.fnaffrights.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnaffrights.block.display.ADinerBonnieActiveDisplayItem;

public class ADinerBonnieActiveDisplayModel extends AnimatedGeoModel<ADinerBonnieActiveDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(ADinerBonnieActiveDisplayItem animatable) {
		return new ResourceLocation("fnaf_frights", "animations/ashowtimedinerbonnieactive.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(ADinerBonnieActiveDisplayItem animatable) {
		return new ResourceLocation("fnaf_frights", "geo/ashowtimedinerbonnieactive.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(ADinerBonnieActiveDisplayItem entity) {
		return new ResourceLocation("fnaf_frights", "textures/blocks/dinerbonnie.png");
	}
}
