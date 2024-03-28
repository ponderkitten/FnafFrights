package net.mcreator.fnaffrights.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnaffrights.block.display.ChicaChickenRightLegDisplayItem;

public class ChicaChickenRightLegDisplayModel extends AnimatedGeoModel<ChicaChickenRightLegDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(ChicaChickenRightLegDisplayItem animatable) {
		return new ResourceLocation("fnaf_frights", "animations/chicachickenrightleg.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(ChicaChickenRightLegDisplayItem animatable) {
		return new ResourceLocation("fnaf_frights", "geo/chicachickenrightleg.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(ChicaChickenRightLegDisplayItem entity) {
		return new ResourceLocation("fnaf_frights", "textures/blocks/chica.png");
	}
}
