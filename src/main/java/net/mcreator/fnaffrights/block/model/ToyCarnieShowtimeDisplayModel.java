package net.mcreator.fnaffrights.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnaffrights.block.display.ToyCarnieShowtimeDisplayItem;

public class ToyCarnieShowtimeDisplayModel extends AnimatedGeoModel<ToyCarnieShowtimeDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(ToyCarnieShowtimeDisplayItem animatable) {
		return new ResourceLocation("fnaf_frights", "animations/toycarnieshowtime.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(ToyCarnieShowtimeDisplayItem animatable) {
		return new ResourceLocation("fnaf_frights", "geo/toycarnieshowtime.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(ToyCarnieShowtimeDisplayItem entity) {
		return new ResourceLocation("fnaf_frights", "textures/blocks/legallydistinctcarnie.png");
	}
}
