package net.mcreator.fnaffrights.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnaffrights.block.display.ToyFoxyLeftArmDisplayItem;

public class ToyFoxyLeftArmDisplayModel extends AnimatedGeoModel<ToyFoxyLeftArmDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(ToyFoxyLeftArmDisplayItem animatable) {
		return new ResourceLocation("fnaf_frights", "animations/toyfoxyleftarm.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(ToyFoxyLeftArmDisplayItem animatable) {
		return new ResourceLocation("fnaf_frights", "geo/toyfoxyleftarm.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(ToyFoxyLeftArmDisplayItem entity) {
		return new ResourceLocation("fnaf_frights", "textures/blocks/toy_foxy.png");
	}
}
