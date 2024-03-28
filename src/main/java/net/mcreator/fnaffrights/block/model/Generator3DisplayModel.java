package net.mcreator.fnaffrights.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnaffrights.block.display.Generator3DisplayItem;

public class Generator3DisplayModel extends AnimatedGeoModel<Generator3DisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(Generator3DisplayItem animatable) {
		return new ResourceLocation("fnaf_frights", "animations/generator3.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(Generator3DisplayItem animatable) {
		return new ResourceLocation("fnaf_frights", "geo/generator3.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(Generator3DisplayItem entity) {
		return new ResourceLocation("fnaf_frights", "textures/blocks/genmedfuel.png");
	}
}
