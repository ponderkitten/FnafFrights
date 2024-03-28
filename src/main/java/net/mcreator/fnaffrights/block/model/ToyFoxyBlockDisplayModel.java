package net.mcreator.fnaffrights.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnaffrights.block.display.ToyFoxyBlockDisplayItem;

public class ToyFoxyBlockDisplayModel extends AnimatedGeoModel<ToyFoxyBlockDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(ToyFoxyBlockDisplayItem animatable) {
		return new ResourceLocation("fnaf_frights", "animations/toyfoxyblock.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(ToyFoxyBlockDisplayItem animatable) {
		return new ResourceLocation("fnaf_frights", "geo/toyfoxyblock.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(ToyFoxyBlockDisplayItem entity) {
		return new ResourceLocation("fnaf_frights", "textures/blocks/toy_foxy.png");
	}
}
