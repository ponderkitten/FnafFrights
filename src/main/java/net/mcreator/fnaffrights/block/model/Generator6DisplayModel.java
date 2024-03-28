package net.mcreator.fnaffrights.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnaffrights.block.display.Generator6DisplayItem;

public class Generator6DisplayModel extends AnimatedGeoModel<Generator6DisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(Generator6DisplayItem animatable) {
		return new ResourceLocation("fnaf_frights", "animations/generator6.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(Generator6DisplayItem animatable) {
		return new ResourceLocation("fnaf_frights", "geo/generator6.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(Generator6DisplayItem entity) {
		return new ResourceLocation("fnaf_frights", "textures/blocks/genhighfuel.png");
	}
}
