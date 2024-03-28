package net.mcreator.fnaffrights.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnaffrights.block.display.FreddyLeftArmDisplayItem;

public class FreddyLeftArmDisplayModel extends AnimatedGeoModel<FreddyLeftArmDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(FreddyLeftArmDisplayItem animatable) {
		return new ResourceLocation("fnaf_frights", "animations/freddyleftarm.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(FreddyLeftArmDisplayItem animatable) {
		return new ResourceLocation("fnaf_frights", "geo/freddyleftarm.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(FreddyLeftArmDisplayItem entity) {
		return new ResourceLocation("fnaf_frights", "textures/blocks/unwithered_freddy.png");
	}
}
