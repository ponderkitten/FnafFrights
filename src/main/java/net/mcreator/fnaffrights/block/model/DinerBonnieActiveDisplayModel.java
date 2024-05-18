package net.mcreator.fnaffrights.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnaffrights.block.display.DinerBonnieActiveDisplayItem;

public class DinerBonnieActiveDisplayModel extends AnimatedGeoModel<DinerBonnieActiveDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(DinerBonnieActiveDisplayItem animatable) {
		return new ResourceLocation("fnaf_frights", "animations/showtimedinerbonnieactive.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(DinerBonnieActiveDisplayItem animatable) {
		return new ResourceLocation("fnaf_frights", "geo/showtimedinerbonnieactive.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(DinerBonnieActiveDisplayItem entity) {
		return new ResourceLocation("fnaf_frights", "textures/blocks/dinerbonnie.png");
	}
}
