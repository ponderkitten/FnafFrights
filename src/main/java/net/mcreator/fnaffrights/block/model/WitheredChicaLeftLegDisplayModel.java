package net.mcreator.fnaffrights.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnaffrights.block.display.WitheredChicaLeftLegDisplayItem;

public class WitheredChicaLeftLegDisplayModel extends AnimatedGeoModel<WitheredChicaLeftLegDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(WitheredChicaLeftLegDisplayItem animatable) {
		return new ResourceLocation("fnaf_frights", "animations/witheredchicaleftleg.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(WitheredChicaLeftLegDisplayItem animatable) {
		return new ResourceLocation("fnaf_frights", "geo/witheredchicaleftleg.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(WitheredChicaLeftLegDisplayItem entity) {
		return new ResourceLocation("fnaf_frights", "textures/blocks/witheredchicatexture.png");
	}
}
