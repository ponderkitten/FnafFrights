package net.mcreator.fnaffrights.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnaffrights.block.display.BonnieBunnieTorsoDisplayItem;

public class BonnieBunnieTorsoDisplayModel extends AnimatedGeoModel<BonnieBunnieTorsoDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(BonnieBunnieTorsoDisplayItem animatable) {
		return new ResourceLocation("fnaf_frights", "animations/bonniebunnietorso.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(BonnieBunnieTorsoDisplayItem animatable) {
		return new ResourceLocation("fnaf_frights", "geo/bonniebunnietorso.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(BonnieBunnieTorsoDisplayItem entity) {
		return new ResourceLocation("fnaf_frights", "textures/blocks/bonnie_the_bunny.png");
	}
}
