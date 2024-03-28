package net.mcreator.fnaffrights.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnaffrights.block.display.Generator7DisplayItem;

public class Generator7DisplayModel extends AnimatedGeoModel<Generator7DisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(Generator7DisplayItem animatable) {
		return new ResourceLocation("fnaf_frights", "animations/generator7.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(Generator7DisplayItem animatable) {
		return new ResourceLocation("fnaf_frights", "geo/generator7.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(Generator7DisplayItem entity) {
		return new ResourceLocation("fnaf_frights", "textures/blocks/genhighfuel.png");
	}
}
