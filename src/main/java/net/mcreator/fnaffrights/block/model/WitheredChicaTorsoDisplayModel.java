package net.mcreator.fnaffrights.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnaffrights.block.display.WitheredChicaTorsoDisplayItem;

public class WitheredChicaTorsoDisplayModel extends AnimatedGeoModel<WitheredChicaTorsoDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(WitheredChicaTorsoDisplayItem animatable) {
		return new ResourceLocation("fnaf_frights", "animations/witheredchicatorso.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(WitheredChicaTorsoDisplayItem animatable) {
		return new ResourceLocation("fnaf_frights", "geo/witheredchicatorso.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(WitheredChicaTorsoDisplayItem entity) {
		return new ResourceLocation("fnaf_frights", "textures/blocks/witheredchicatexture.png");
	}
}
