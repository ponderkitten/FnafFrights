package net.mcreator.fnaffrights.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnaffrights.block.display.OffsetFreddyActiveDisplayItem;

public class OffsetFreddyActiveDisplayModel extends AnimatedGeoModel<OffsetFreddyActiveDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(OffsetFreddyActiveDisplayItem animatable) {
		return new ResourceLocation("fnaf_frights", "animations/ofreddyshowtimeactive.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(OffsetFreddyActiveDisplayItem animatable) {
		return new ResourceLocation("fnaf_frights", "geo/ofreddyshowtimeactive.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(OffsetFreddyActiveDisplayItem entity) {
		return new ResourceLocation("fnaf_frights", "textures/blocks/unwithered_freddy.png");
	}
}
