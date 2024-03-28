package net.mcreator.fnaffrights.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnaffrights.block.display.Generator1DisplayItem;

public class Generator1DisplayModel extends AnimatedGeoModel<Generator1DisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(Generator1DisplayItem animatable) {
		return new ResourceLocation("fnaf_frights", "animations/generator1.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(Generator1DisplayItem animatable) {
		return new ResourceLocation("fnaf_frights", "geo/generator1.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(Generator1DisplayItem entity) {
		return new ResourceLocation("fnaf_frights", "textures/blocks/genlowfuel.png");
	}
}
