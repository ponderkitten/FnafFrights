package net.mcreator.fnaffrights.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnaffrights.block.display.SpringBonnieBunnieRightArmDisplayItem;

public class SpringBonnieBunnieRightArmDisplayModel extends AnimatedGeoModel<SpringBonnieBunnieRightArmDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(SpringBonnieBunnieRightArmDisplayItem animatable) {
		return new ResourceLocation("fnaf_frights", "animations/bonniebunnierightarm.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(SpringBonnieBunnieRightArmDisplayItem animatable) {
		return new ResourceLocation("fnaf_frights", "geo/bonniebunnierightarm.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(SpringBonnieBunnieRightArmDisplayItem entity) {
		return new ResourceLocation("fnaf_frights", "textures/blocks/spring_bonnie_fnaf1.png");
	}
}
