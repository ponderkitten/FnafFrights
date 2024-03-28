package net.mcreator.fnaffrights.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnaffrights.block.display.FreddyFazbearShowtimeDisplayItem;

public class FreddyFazbearShowtimeDisplayModel extends AnimatedGeoModel<FreddyFazbearShowtimeDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(FreddyFazbearShowtimeDisplayItem animatable) {
		return new ResourceLocation("fnaf_frights", "animations/freddyfazbearshowtime.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(FreddyFazbearShowtimeDisplayItem animatable) {
		return new ResourceLocation("fnaf_frights", "geo/freddyfazbearshowtime.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(FreddyFazbearShowtimeDisplayItem entity) {
		return new ResourceLocation("fnaf_frights", "textures/blocks/freddyfazbeartexture.png");
	}
}
