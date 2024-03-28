package net.mcreator.fnaffrights.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnaffrights.block.display.AFreddyActiveDisplayItem;

public class AFreddyActiveDisplayModel extends AnimatedGeoModel<AFreddyActiveDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(AFreddyActiveDisplayItem animatable) {
		return new ResourceLocation("fnaf_frights", "animations/afreddyshowtimeactive.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(AFreddyActiveDisplayItem animatable) {
		return new ResourceLocation("fnaf_frights", "geo/afreddyshowtimeactive.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(AFreddyActiveDisplayItem entity) {
		return new ResourceLocation("fnaf_frights", "textures/blocks/unwithered_freddy.png");
	}
}
