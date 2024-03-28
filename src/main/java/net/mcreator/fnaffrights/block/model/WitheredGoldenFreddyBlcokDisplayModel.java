package net.mcreator.fnaffrights.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnaffrights.block.display.WitheredGoldenFreddyBlcokDisplayItem;

public class WitheredGoldenFreddyBlcokDisplayModel extends AnimatedGeoModel<WitheredGoldenFreddyBlcokDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(WitheredGoldenFreddyBlcokDisplayItem animatable) {
		return new ResourceLocation("fnaf_frights", "animations/witheredfreddyblock.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(WitheredGoldenFreddyBlcokDisplayItem animatable) {
		return new ResourceLocation("fnaf_frights", "geo/witheredfreddyblock.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(WitheredGoldenFreddyBlcokDisplayItem entity) {
		return new ResourceLocation("fnaf_frights", "textures/blocks/witheredgoldenfreddytexture.png");
	}
}
