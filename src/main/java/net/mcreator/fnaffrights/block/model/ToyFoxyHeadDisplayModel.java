package net.mcreator.fnaffrights.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnaffrights.block.display.ToyFoxyHeadDisplayItem;

public class ToyFoxyHeadDisplayModel extends AnimatedGeoModel<ToyFoxyHeadDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(ToyFoxyHeadDisplayItem animatable) {
		return new ResourceLocation("fnaf_frights", "animations/toyfoxyhead.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(ToyFoxyHeadDisplayItem animatable) {
		return new ResourceLocation("fnaf_frights", "geo/toyfoxyhead.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(ToyFoxyHeadDisplayItem entity) {
		return new ResourceLocation("fnaf_frights", "textures/blocks/toy_foxy.png");
	}
}
