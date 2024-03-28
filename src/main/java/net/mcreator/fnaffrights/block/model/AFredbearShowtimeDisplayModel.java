package net.mcreator.fnaffrights.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnaffrights.block.display.AFredbearShowtimeDisplayItem;

public class AFredbearShowtimeDisplayModel extends AnimatedGeoModel<AFredbearShowtimeDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(AFredbearShowtimeDisplayItem animatable) {
		return new ResourceLocation("fnaf_frights", "animations/afredbearshowtime.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(AFredbearShowtimeDisplayItem animatable) {
		return new ResourceLocation("fnaf_frights", "geo/afredbearshowtime.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(AFredbearShowtimeDisplayItem entity) {
		return new ResourceLocation("fnaf_frights", "textures/blocks/fredbear4.png");
	}
}
