package net.mcreator.fnaffrights.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnaffrights.block.display.ToyFoxyLeftLegDisplayItem;

public class ToyFoxyLeftLegDisplayModel extends AnimatedGeoModel<ToyFoxyLeftLegDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(ToyFoxyLeftLegDisplayItem animatable) {
		return new ResourceLocation("fnaf_frights", "animations/toyfoxyleftleg.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(ToyFoxyLeftLegDisplayItem animatable) {
		return new ResourceLocation("fnaf_frights", "geo/toyfoxyleftleg.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(ToyFoxyLeftLegDisplayItem entity) {
		return new ResourceLocation("fnaf_frights", "textures/blocks/toy_foxy.png");
	}
}
