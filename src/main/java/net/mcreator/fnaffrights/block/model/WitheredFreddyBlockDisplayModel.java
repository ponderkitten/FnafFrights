package net.mcreator.fnaffrights.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnaffrights.block.display.WitheredFreddyBlockDisplayItem;

public class WitheredFreddyBlockDisplayModel extends AnimatedGeoModel<WitheredFreddyBlockDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(WitheredFreddyBlockDisplayItem animatable) {
		return new ResourceLocation("fnaf_frights", "animations/witheredfreddyblock.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(WitheredFreddyBlockDisplayItem animatable) {
		return new ResourceLocation("fnaf_frights", "geo/witheredfreddyblock.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(WitheredFreddyBlockDisplayItem entity) {
		return new ResourceLocation("fnaf_frights", "textures/blocks/witheredfreddytexture.png");
	}
}
