package net.mcreator.fnaffrights.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnaffrights.block.display.BonnieBunnieLeftLegDisplayItem;

public class BonnieBunnieLeftLegDisplayModel extends AnimatedGeoModel<BonnieBunnieLeftLegDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(BonnieBunnieLeftLegDisplayItem animatable) {
		return new ResourceLocation("fnaf_frights", "animations/bonniebunnieleftleg.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(BonnieBunnieLeftLegDisplayItem animatable) {
		return new ResourceLocation("fnaf_frights", "geo/bonniebunnieleftleg.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(BonnieBunnieLeftLegDisplayItem entity) {
		return new ResourceLocation("fnaf_frights", "textures/blocks/bonnie_the_bunny.png");
	}
}
