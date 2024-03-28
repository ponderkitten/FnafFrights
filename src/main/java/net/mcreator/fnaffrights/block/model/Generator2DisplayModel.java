package net.mcreator.fnaffrights.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnaffrights.block.display.Generator2DisplayItem;

public class Generator2DisplayModel extends AnimatedGeoModel<Generator2DisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(Generator2DisplayItem animatable) {
		return new ResourceLocation("fnaf_frights", "animations/generator2.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(Generator2DisplayItem animatable) {
		return new ResourceLocation("fnaf_frights", "geo/generator2.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(Generator2DisplayItem entity) {
		return new ResourceLocation("fnaf_frights", "textures/blocks/genlowfuel.png");
	}
}
