package net.mcreator.fnaffrights.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnaffrights.block.display.ToyFoxyRightLegDisplayItem;

public class ToyFoxyRightLegDisplayModel extends AnimatedGeoModel<ToyFoxyRightLegDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(ToyFoxyRightLegDisplayItem animatable) {
		return new ResourceLocation("fnaf_frights", "animations/toyfoxyrightleg.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(ToyFoxyRightLegDisplayItem animatable) {
		return new ResourceLocation("fnaf_frights", "geo/toyfoxyrightleg.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(ToyFoxyRightLegDisplayItem entity) {
		return new ResourceLocation("fnaf_frights", "textures/blocks/toy_foxy.png");
	}
}
