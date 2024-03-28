package net.mcreator.fnaffrights.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnaffrights.block.display.ABonnieActiveDisplayItem;

public class ABonnieActiveDisplayModel extends AnimatedGeoModel<ABonnieActiveDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(ABonnieActiveDisplayItem animatable) {
		return new ResourceLocation("fnaf_frights", "animations/abonnieshowtimeactive.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(ABonnieActiveDisplayItem animatable) {
		return new ResourceLocation("fnaf_frights", "geo/abonnieshowtimeactive.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(ABonnieActiveDisplayItem entity) {
		return new ResourceLocation("fnaf_frights", "textures/blocks/unwithered_bonnie.png");
	}
}
