package net.mcreator.fnaffrights.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnaffrights.block.display.WitheredFreddyLeftArmDisplayItem;

public class WitheredFreddyLeftArmDisplayModel extends AnimatedGeoModel<WitheredFreddyLeftArmDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(WitheredFreddyLeftArmDisplayItem animatable) {
		return new ResourceLocation("fnaf_frights", "animations/freddyleftarm.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(WitheredFreddyLeftArmDisplayItem animatable) {
		return new ResourceLocation("fnaf_frights", "geo/freddyleftarm.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(WitheredFreddyLeftArmDisplayItem entity) {
		return new ResourceLocation("fnaf_frights", "textures/blocks/witheredfreddytexture.png");
	}
}
