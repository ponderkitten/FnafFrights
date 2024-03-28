package net.mcreator.fnaffrights.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnaffrights.block.display.ToyBonnieShowtimeDisplayItem;

public class ToyBonnieShowtimeDisplayModel extends AnimatedGeoModel<ToyBonnieShowtimeDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(ToyBonnieShowtimeDisplayItem animatable) {
		return new ResourceLocation("fnaf_frights", "animations/toybonnieshowtime.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(ToyBonnieShowtimeDisplayItem animatable) {
		return new ResourceLocation("fnaf_frights", "geo/toybonnieshowtime.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(ToyBonnieShowtimeDisplayItem entity) {
		return new ResourceLocation("fnaf_frights", "textures/blocks/toy_bonnie.png");
	}
}
