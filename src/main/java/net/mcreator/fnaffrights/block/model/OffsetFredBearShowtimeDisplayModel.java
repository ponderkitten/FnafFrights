package net.mcreator.fnaffrights.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnaffrights.block.display.OffsetFredBearShowtimeDisplayItem;

public class OffsetFredBearShowtimeDisplayModel extends AnimatedGeoModel<OffsetFredBearShowtimeDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(OffsetFredBearShowtimeDisplayItem animatable) {
		return new ResourceLocation("fnaf_frights", "animations/ofredbearshowtime.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(OffsetFredBearShowtimeDisplayItem animatable) {
		return new ResourceLocation("fnaf_frights", "geo/ofredbearshowtime.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(OffsetFredBearShowtimeDisplayItem entity) {
		return new ResourceLocation("fnaf_frights", "textures/blocks/fredbear4.png");
	}
}
