package net.mcreator.fnaffrights.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnaffrights.block.display.WitheredChicaLeftArmDisplayItem;

public class WitheredChicaLeftArmDisplayModel extends AnimatedGeoModel<WitheredChicaLeftArmDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(WitheredChicaLeftArmDisplayItem animatable) {
		return new ResourceLocation("fnaf_frights", "animations/witheredchicaleftarm.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(WitheredChicaLeftArmDisplayItem animatable) {
		return new ResourceLocation("fnaf_frights", "geo/witheredchicaleftarm.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(WitheredChicaLeftArmDisplayItem entity) {
		return new ResourceLocation("fnaf_frights", "textures/blocks/witheredchicatexture.png");
	}
}
