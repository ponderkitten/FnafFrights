package net.mcreator.fnaffrights.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnaffrights.block.display.ChicaLeftArmDisplayItem;

public class ChicaLeftArmDisplayModel extends AnimatedGeoModel<ChicaLeftArmDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(ChicaLeftArmDisplayItem animatable) {
		return new ResourceLocation("fnaf_frights", "animations/chicaleftarm.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(ChicaLeftArmDisplayItem animatable) {
		return new ResourceLocation("fnaf_frights", "geo/chicaleftarm.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(ChicaLeftArmDisplayItem entity) {
		return new ResourceLocation("fnaf_frights", "textures/blocks/unwithered_chica.png");
	}
}
