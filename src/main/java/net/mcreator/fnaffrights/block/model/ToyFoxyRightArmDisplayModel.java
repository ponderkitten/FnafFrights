package net.mcreator.fnaffrights.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnaffrights.block.display.ToyFoxyRightArmDisplayItem;

public class ToyFoxyRightArmDisplayModel extends AnimatedGeoModel<ToyFoxyRightArmDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(ToyFoxyRightArmDisplayItem animatable) {
		return new ResourceLocation("fnaf_frights", "animations/toyfoxyrightarm.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(ToyFoxyRightArmDisplayItem animatable) {
		return new ResourceLocation("fnaf_frights", "geo/toyfoxyrightarm.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(ToyFoxyRightArmDisplayItem entity) {
		return new ResourceLocation("fnaf_frights", "textures/blocks/toy_foxy.png");
	}
}
