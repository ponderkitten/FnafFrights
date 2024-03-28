package net.mcreator.fnaffrights.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnaffrights.block.display.ChicaTorsoDisplayItem;

public class ChicaTorsoDisplayModel extends AnimatedGeoModel<ChicaTorsoDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(ChicaTorsoDisplayItem animatable) {
		return new ResourceLocation("fnaf_frights", "animations/chicatorso.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(ChicaTorsoDisplayItem animatable) {
		return new ResourceLocation("fnaf_frights", "geo/chicatorso.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(ChicaTorsoDisplayItem entity) {
		return new ResourceLocation("fnaf_frights", "textures/blocks/unwithered_chica.png");
	}
}
