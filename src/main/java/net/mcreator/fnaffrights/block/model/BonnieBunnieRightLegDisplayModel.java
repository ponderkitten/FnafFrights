package net.mcreator.fnaffrights.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnaffrights.block.display.BonnieBunnieRightLegDisplayItem;

public class BonnieBunnieRightLegDisplayModel extends AnimatedGeoModel<BonnieBunnieRightLegDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(BonnieBunnieRightLegDisplayItem animatable) {
		return new ResourceLocation("fnaf_frights", "animations/bonniebunnierightleg.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(BonnieBunnieRightLegDisplayItem animatable) {
		return new ResourceLocation("fnaf_frights", "geo/bonniebunnierightleg.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(BonnieBunnieRightLegDisplayItem entity) {
		return new ResourceLocation("fnaf_frights", "textures/blocks/bonnie_the_bunny.png");
	}
}
