package net.mcreator.fnaffrights.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnaffrights.block.display.GeneratorDisplayItem;

public class GeneratorDisplayModel extends AnimatedGeoModel<GeneratorDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(GeneratorDisplayItem animatable) {
		return new ResourceLocation("fnaf_frights", "animations/generator.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(GeneratorDisplayItem animatable) {
		return new ResourceLocation("fnaf_frights", "geo/generator.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(GeneratorDisplayItem entity) {
		return new ResourceLocation("fnaf_frights", "textures/blocks/generator.png");
	}
}
