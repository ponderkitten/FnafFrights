package net.mcreator.fnaffrights.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnaffrights.block.display.WitheredFreddyRightArmDisplayItem;

public class WitheredFreddyRightArmDisplayModel extends AnimatedGeoModel<WitheredFreddyRightArmDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(WitheredFreddyRightArmDisplayItem animatable) {
		return new ResourceLocation("fnaf_frights", "animations/freddyrightarm.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(WitheredFreddyRightArmDisplayItem animatable) {
		return new ResourceLocation("fnaf_frights", "geo/freddyrightarm.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(WitheredFreddyRightArmDisplayItem entity) {
		return new ResourceLocation("fnaf_frights", "textures/blocks/witheredfreddytexture.png");
	}
}
