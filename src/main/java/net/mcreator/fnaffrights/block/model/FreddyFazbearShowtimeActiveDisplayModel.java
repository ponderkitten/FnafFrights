package net.mcreator.fnaffrights.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnaffrights.block.display.FreddyFazbearShowtimeActiveDisplayItem;

public class FreddyFazbearShowtimeActiveDisplayModel extends AnimatedGeoModel<FreddyFazbearShowtimeActiveDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(FreddyFazbearShowtimeActiveDisplayItem animatable) {
		return new ResourceLocation("fnaf_frights", "animations/freddyfazbearshowtimeactive.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(FreddyFazbearShowtimeActiveDisplayItem animatable) {
		return new ResourceLocation("fnaf_frights", "geo/freddyfazbearshowtimeactive.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(FreddyFazbearShowtimeActiveDisplayItem entity) {
		return new ResourceLocation("fnaf_frights", "textures/blocks/freddyfazbeartexture.png");
	}
}
