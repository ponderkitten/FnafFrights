package net.mcreator.fnaffrights.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnaffrights.block.display.ToyFoxyTorsoDisplayItem;

public class ToyFoxyTorsoDisplayModel extends AnimatedGeoModel<ToyFoxyTorsoDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(ToyFoxyTorsoDisplayItem animatable) {
		return new ResourceLocation("fnaf_frights", "animations/toyfoxytorso.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(ToyFoxyTorsoDisplayItem animatable) {
		return new ResourceLocation("fnaf_frights", "geo/toyfoxytorso.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(ToyFoxyTorsoDisplayItem entity) {
		return new ResourceLocation("fnaf_frights", "textures/blocks/toy_foxy.png");
	}
}
