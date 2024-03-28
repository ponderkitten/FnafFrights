package net.mcreator.fnaffrights.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnaffrights.block.display.SpringBonnieBunnieLeftArmDisplayItem;

public class SpringBonnieBunnieLeftArmDisplayModel extends AnimatedGeoModel<SpringBonnieBunnieLeftArmDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(SpringBonnieBunnieLeftArmDisplayItem animatable) {
		return new ResourceLocation("fnaf_frights", "animations/bonniebunnieleftarm.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(SpringBonnieBunnieLeftArmDisplayItem animatable) {
		return new ResourceLocation("fnaf_frights", "geo/bonniebunnieleftarm.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(SpringBonnieBunnieLeftArmDisplayItem entity) {
		return new ResourceLocation("fnaf_frights", "textures/blocks/spring_bonnie_fnaf1.png");
	}
}
