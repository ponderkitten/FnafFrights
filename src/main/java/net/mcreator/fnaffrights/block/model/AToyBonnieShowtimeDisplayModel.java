package net.mcreator.fnaffrights.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnaffrights.block.display.AToyBonnieShowtimeDisplayItem;

public class AToyBonnieShowtimeDisplayModel extends AnimatedGeoModel<AToyBonnieShowtimeDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(AToyBonnieShowtimeDisplayItem animatable) {
		return new ResourceLocation("fnaf_frights", "animations/atoybonnieshowtime.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(AToyBonnieShowtimeDisplayItem animatable) {
		return new ResourceLocation("fnaf_frights", "geo/atoybonnieshowtime.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(AToyBonnieShowtimeDisplayItem entity) {
		return new ResourceLocation("fnaf_frights", "textures/blocks/toy_bonnie.png");
	}
}
