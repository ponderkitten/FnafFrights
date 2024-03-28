package net.mcreator.fnaffrights.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnaffrights.block.display.ChicaChickenHeadDisplayItem;

public class ChicaChickenHeadDisplayModel extends AnimatedGeoModel<ChicaChickenHeadDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(ChicaChickenHeadDisplayItem animatable) {
		return new ResourceLocation("fnaf_frights", "animations/chicachickenhead.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(ChicaChickenHeadDisplayItem animatable) {
		return new ResourceLocation("fnaf_frights", "geo/chicachickenhead.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(ChicaChickenHeadDisplayItem entity) {
		return new ResourceLocation("fnaf_frights", "textures/blocks/chica.png");
	}
}
