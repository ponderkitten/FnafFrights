package net.mcreator.fnaffrights.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnaffrights.block.display.FredbearShowtimeActiveDisplayItem;

public class FredbearShowtimeActiveDisplayModel extends AnimatedGeoModel<FredbearShowtimeActiveDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(FredbearShowtimeActiveDisplayItem animatable) {
		return new ResourceLocation("fnaf_frights", "animations/fredbearshowtimeactive.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(FredbearShowtimeActiveDisplayItem animatable) {
		return new ResourceLocation("fnaf_frights", "geo/fredbearshowtimeactive.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(FredbearShowtimeActiveDisplayItem entity) {
		return new ResourceLocation("fnaf_frights", "textures/blocks/fredbear4.png");
	}
}
