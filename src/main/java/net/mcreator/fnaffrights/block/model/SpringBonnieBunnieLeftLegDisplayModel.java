package net.mcreator.fnaffrights.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnaffrights.block.display.SpringBonnieBunnieLeftLegDisplayItem;

public class SpringBonnieBunnieLeftLegDisplayModel extends AnimatedGeoModel<SpringBonnieBunnieLeftLegDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(SpringBonnieBunnieLeftLegDisplayItem animatable) {
		return new ResourceLocation("fnaf_frights", "animations/bonniebunnieleftleg.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(SpringBonnieBunnieLeftLegDisplayItem animatable) {
		return new ResourceLocation("fnaf_frights", "geo/bonniebunnieleftleg.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(SpringBonnieBunnieLeftLegDisplayItem entity) {
		return new ResourceLocation("fnaf_frights", "textures/blocks/spring_bonnie_fnaf1.png");
	}
}
