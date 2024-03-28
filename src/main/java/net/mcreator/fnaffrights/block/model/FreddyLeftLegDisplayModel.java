package net.mcreator.fnaffrights.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnaffrights.block.display.FreddyLeftLegDisplayItem;

public class FreddyLeftLegDisplayModel extends AnimatedGeoModel<FreddyLeftLegDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(FreddyLeftLegDisplayItem animatable) {
		return new ResourceLocation("fnaf_frights", "animations/freddyleftleg.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(FreddyLeftLegDisplayItem animatable) {
		return new ResourceLocation("fnaf_frights", "geo/freddyleftleg.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(FreddyLeftLegDisplayItem entity) {
		return new ResourceLocation("fnaf_frights", "textures/blocks/unwithered_freddy.png");
	}
}
