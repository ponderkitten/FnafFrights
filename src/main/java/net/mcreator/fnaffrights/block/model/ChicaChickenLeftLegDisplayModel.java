package net.mcreator.fnaffrights.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnaffrights.block.display.ChicaChickenLeftLegDisplayItem;

public class ChicaChickenLeftLegDisplayModel extends AnimatedGeoModel<ChicaChickenLeftLegDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(ChicaChickenLeftLegDisplayItem animatable) {
		return new ResourceLocation("fnaf_frights", "animations/chicachickenleftleg.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(ChicaChickenLeftLegDisplayItem animatable) {
		return new ResourceLocation("fnaf_frights", "geo/chicachickenleftleg.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(ChicaChickenLeftLegDisplayItem entity) {
		return new ResourceLocation("fnaf_frights", "textures/blocks/chica.png");
	}
}
