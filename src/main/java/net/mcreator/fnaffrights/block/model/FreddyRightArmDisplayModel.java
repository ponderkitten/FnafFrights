package net.mcreator.fnaffrights.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnaffrights.block.display.FreddyRightArmDisplayItem;

public class FreddyRightArmDisplayModel extends AnimatedGeoModel<FreddyRightArmDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(FreddyRightArmDisplayItem animatable) {
		return new ResourceLocation("fnaf_frights", "animations/freddyrightarm.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(FreddyRightArmDisplayItem animatable) {
		return new ResourceLocation("fnaf_frights", "geo/freddyrightarm.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(FreddyRightArmDisplayItem entity) {
		return new ResourceLocation("fnaf_frights", "textures/blocks/unwithered_freddy.png");
	}
}
