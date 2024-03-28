package net.mcreator.fnaffrights.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnaffrights.block.display.AFredbearActiveDisplayItem;

public class AFredbearActiveDisplayModel extends AnimatedGeoModel<AFredbearActiveDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(AFredbearActiveDisplayItem animatable) {
		return new ResourceLocation("fnaf_frights", "animations/afredbearshowtimeactive.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(AFredbearActiveDisplayItem animatable) {
		return new ResourceLocation("fnaf_frights", "geo/afredbearshowtimeactive.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(AFredbearActiveDisplayItem entity) {
		return new ResourceLocation("fnaf_frights", "textures/blocks/fredbear4.png");
	}
}
