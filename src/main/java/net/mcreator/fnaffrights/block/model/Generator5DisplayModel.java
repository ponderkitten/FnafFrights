package net.mcreator.fnaffrights.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnaffrights.block.display.Generator5DisplayItem;

public class Generator5DisplayModel extends AnimatedGeoModel<Generator5DisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(Generator5DisplayItem animatable) {
		return new ResourceLocation("fnaf_frights", "animations/generator5.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(Generator5DisplayItem animatable) {
		return new ResourceLocation("fnaf_frights", "geo/generator5.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(Generator5DisplayItem entity) {
		return new ResourceLocation("fnaf_frights", "textures/blocks/genhighfuel.png");
	}
}
