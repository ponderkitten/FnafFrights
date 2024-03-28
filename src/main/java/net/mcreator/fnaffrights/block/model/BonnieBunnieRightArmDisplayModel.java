package net.mcreator.fnaffrights.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnaffrights.block.display.BonnieBunnieRightArmDisplayItem;

public class BonnieBunnieRightArmDisplayModel extends AnimatedGeoModel<BonnieBunnieRightArmDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(BonnieBunnieRightArmDisplayItem animatable) {
		return new ResourceLocation("fnaf_frights", "animations/bonniebunnierightarm.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(BonnieBunnieRightArmDisplayItem animatable) {
		return new ResourceLocation("fnaf_frights", "geo/bonniebunnierightarm.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(BonnieBunnieRightArmDisplayItem entity) {
		return new ResourceLocation("fnaf_frights", "textures/blocks/bonnie_the_bunny.png");
	}
}
