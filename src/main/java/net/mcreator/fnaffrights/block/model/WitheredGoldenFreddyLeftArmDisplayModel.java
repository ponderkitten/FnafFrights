package net.mcreator.fnaffrights.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnaffrights.block.display.WitheredGoldenFreddyLeftArmDisplayItem;

public class WitheredGoldenFreddyLeftArmDisplayModel extends AnimatedGeoModel<WitheredGoldenFreddyLeftArmDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(WitheredGoldenFreddyLeftArmDisplayItem animatable) {
		return new ResourceLocation("fnaf_frights", "animations/freddyleftarm.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(WitheredGoldenFreddyLeftArmDisplayItem animatable) {
		return new ResourceLocation("fnaf_frights", "geo/freddyleftarm.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(WitheredGoldenFreddyLeftArmDisplayItem entity) {
		return new ResourceLocation("fnaf_frights", "textures/blocks/witheredgoldenfreddytexture.png");
	}
}
