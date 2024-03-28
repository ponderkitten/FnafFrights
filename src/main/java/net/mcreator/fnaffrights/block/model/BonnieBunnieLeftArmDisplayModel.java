package net.mcreator.fnaffrights.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnaffrights.block.display.BonnieBunnieLeftArmDisplayItem;

public class BonnieBunnieLeftArmDisplayModel extends AnimatedGeoModel<BonnieBunnieLeftArmDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(BonnieBunnieLeftArmDisplayItem animatable) {
		return new ResourceLocation("fnaf_frights", "animations/bonniebunnieleftarm.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(BonnieBunnieLeftArmDisplayItem animatable) {
		return new ResourceLocation("fnaf_frights", "geo/bonniebunnieleftarm.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(BonnieBunnieLeftArmDisplayItem entity) {
		return new ResourceLocation("fnaf_frights", "textures/blocks/bonnie_the_bunny.png");
	}
}
