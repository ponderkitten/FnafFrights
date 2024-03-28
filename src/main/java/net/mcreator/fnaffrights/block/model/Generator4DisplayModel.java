package net.mcreator.fnaffrights.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnaffrights.block.display.Generator4DisplayItem;

public class Generator4DisplayModel extends AnimatedGeoModel<Generator4DisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(Generator4DisplayItem animatable) {
		return new ResourceLocation("fnaf_frights", "animations/generator4.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(Generator4DisplayItem animatable) {
		return new ResourceLocation("fnaf_frights", "geo/generator4.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(Generator4DisplayItem entity) {
		return new ResourceLocation("fnaf_frights", "textures/blocks/genmedfuel.png");
	}
}
