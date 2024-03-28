package net.mcreator.fnaffrights.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnaffrights.block.display.OffsetFreddyFazbearShowtimeDisplayItem;

public class OffsetFreddyFazbearShowtimeDisplayModel extends AnimatedGeoModel<OffsetFreddyFazbearShowtimeDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(OffsetFreddyFazbearShowtimeDisplayItem animatable) {
		return new ResourceLocation("fnaf_frights", "animations/ofreddyfazbearshowtime.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(OffsetFreddyFazbearShowtimeDisplayItem animatable) {
		return new ResourceLocation("fnaf_frights", "geo/ofreddyfazbearshowtime.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(OffsetFreddyFazbearShowtimeDisplayItem entity) {
		return new ResourceLocation("fnaf_frights", "textures/blocks/freddyfazbeartexture.png");
	}
}
