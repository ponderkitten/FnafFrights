package net.mcreator.fnaffrights.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnaffrights.block.display.ChicaBlockDisplayItem;

public class ChicaBlockDisplayModel extends AnimatedGeoModel<ChicaBlockDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(ChicaBlockDisplayItem animatable) {
		return new ResourceLocation("fnaf_frights", "animations/classicchicablock.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(ChicaBlockDisplayItem animatable) {
		return new ResourceLocation("fnaf_frights", "geo/classicchicablock.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(ChicaBlockDisplayItem entity) {
		return new ResourceLocation("fnaf_frights", "textures/blocks/unwithered_chica.png");
	}
}
