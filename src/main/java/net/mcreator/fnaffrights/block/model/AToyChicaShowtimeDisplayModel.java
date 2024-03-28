package net.mcreator.fnaffrights.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnaffrights.block.display.AToyChicaShowtimeDisplayItem;

public class AToyChicaShowtimeDisplayModel extends AnimatedGeoModel<AToyChicaShowtimeDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(AToyChicaShowtimeDisplayItem animatable) {
		return new ResourceLocation("fnaf_frights", "animations/atoychicashowtime.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(AToyChicaShowtimeDisplayItem animatable) {
		return new ResourceLocation("fnaf_frights", "geo/atoychicashowtime.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(AToyChicaShowtimeDisplayItem entity) {
		return new ResourceLocation("fnaf_frights", "textures/blocks/toy_chica.png");
	}
}
