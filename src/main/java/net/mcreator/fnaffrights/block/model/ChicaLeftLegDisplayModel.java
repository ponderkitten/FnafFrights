package net.mcreator.fnaffrights.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnaffrights.block.display.ChicaLeftLegDisplayItem;

public class ChicaLeftLegDisplayModel extends AnimatedGeoModel<ChicaLeftLegDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(ChicaLeftLegDisplayItem animatable) {
		return new ResourceLocation("fnaf_frights", "animations/chicaleftleg.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(ChicaLeftLegDisplayItem animatable) {
		return new ResourceLocation("fnaf_frights", "geo/chicaleftleg.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(ChicaLeftLegDisplayItem entity) {
		return new ResourceLocation("fnaf_frights", "textures/blocks/unwithered_chica.png");
	}
}
