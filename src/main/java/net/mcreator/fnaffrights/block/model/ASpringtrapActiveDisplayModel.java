package net.mcreator.fnaffrights.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnaffrights.block.display.ASpringtrapActiveDisplayItem;

public class ASpringtrapActiveDisplayModel extends AnimatedGeoModel<ASpringtrapActiveDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(ASpringtrapActiveDisplayItem animatable) {
		return new ResourceLocation("fnaf_frights", "animations/aspringtrapshowtimeactive.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(ASpringtrapActiveDisplayItem animatable) {
		return new ResourceLocation("fnaf_frights", "geo/aspringtrapshowtimeactive.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(ASpringtrapActiveDisplayItem entity) {
		return new ResourceLocation("fnaf_frights", "textures/blocks/springtrapsuffer.png");
	}
}
