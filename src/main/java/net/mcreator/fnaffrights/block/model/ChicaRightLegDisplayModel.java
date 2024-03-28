package net.mcreator.fnaffrights.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnaffrights.block.display.ChicaRightLegDisplayItem;

public class ChicaRightLegDisplayModel extends AnimatedGeoModel<ChicaRightLegDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(ChicaRightLegDisplayItem animatable) {
		return new ResourceLocation("fnaf_frights", "animations/chicarightleg.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(ChicaRightLegDisplayItem animatable) {
		return new ResourceLocation("fnaf_frights", "geo/chicarightleg.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(ChicaRightLegDisplayItem entity) {
		return new ResourceLocation("fnaf_frights", "textures/blocks/unwithered_chica.png");
	}
}
