package net.mcreator.fnaffrights.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnaffrights.block.display.FredbearShowtimeDisplayItem;

public class FredbearShowtimeDisplayModel extends AnimatedGeoModel<FredbearShowtimeDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(FredbearShowtimeDisplayItem animatable) {
		return new ResourceLocation("fnaf_frights", "animations/fredbearshowtime.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(FredbearShowtimeDisplayItem animatable) {
		return new ResourceLocation("fnaf_frights", "geo/fredbearshowtime.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(FredbearShowtimeDisplayItem entity) {
		return new ResourceLocation("fnaf_frights", "textures/blocks/fredbear4.png");
	}
}
