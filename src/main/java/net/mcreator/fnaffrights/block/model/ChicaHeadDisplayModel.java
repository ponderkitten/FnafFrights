package net.mcreator.fnaffrights.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnaffrights.block.display.ChicaHeadDisplayItem;

public class ChicaHeadDisplayModel extends AnimatedGeoModel<ChicaHeadDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(ChicaHeadDisplayItem animatable) {
		return new ResourceLocation("fnaf_frights", "animations/chicahead.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(ChicaHeadDisplayItem animatable) {
		return new ResourceLocation("fnaf_frights", "geo/chicahead.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(ChicaHeadDisplayItem entity) {
		return new ResourceLocation("fnaf_frights", "textures/blocks/unwithered_chica.png");
	}
}
