package net.mcreator.fnaffrights.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnaffrights.block.display.AFreddyFazbearShowtimeDisplayItem;

public class AFreddyFazbearShowtimeDisplayModel extends AnimatedGeoModel<AFreddyFazbearShowtimeDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(AFreddyFazbearShowtimeDisplayItem animatable) {
		return new ResourceLocation("fnaf_frights", "animations/afreddyfazbearshowtime.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(AFreddyFazbearShowtimeDisplayItem animatable) {
		return new ResourceLocation("fnaf_frights", "geo/afreddyfazbearshowtime.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(AFreddyFazbearShowtimeDisplayItem entity) {
		return new ResourceLocation("fnaf_frights", "textures/blocks/freddyfazbeartexture.png");
	}
}
