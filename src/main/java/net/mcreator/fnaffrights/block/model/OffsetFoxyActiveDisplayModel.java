package net.mcreator.fnaffrights.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnaffrights.block.display.OffsetFoxyActiveDisplayItem;

public class OffsetFoxyActiveDisplayModel extends AnimatedGeoModel<OffsetFoxyActiveDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(OffsetFoxyActiveDisplayItem animatable) {
		return new ResourceLocation("fnaf_frights", "animations/ofoxyshowtimeactive.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(OffsetFoxyActiveDisplayItem animatable) {
		return new ResourceLocation("fnaf_frights", "geo/ofoxyshowtimeactive.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(OffsetFoxyActiveDisplayItem entity) {
		return new ResourceLocation("fnaf_frights", "textures/blocks/unwithered_foxy.png");
	}
}
