package net.mcreator.fnaffrights.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnaffrights.block.display.SpringBonnieBunnieHeadDisplayItem;

public class SpringBonnieBunnieHeadDisplayModel extends AnimatedGeoModel<SpringBonnieBunnieHeadDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(SpringBonnieBunnieHeadDisplayItem animatable) {
		return new ResourceLocation("fnaf_frights", "animations/bonniebunniehead.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(SpringBonnieBunnieHeadDisplayItem animatable) {
		return new ResourceLocation("fnaf_frights", "geo/bonniebunniehead.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(SpringBonnieBunnieHeadDisplayItem entity) {
		return new ResourceLocation("fnaf_frights", "textures/blocks/spring_bonnie_fnaf1.png");
	}
}
