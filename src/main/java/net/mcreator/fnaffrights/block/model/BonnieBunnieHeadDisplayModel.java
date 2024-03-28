package net.mcreator.fnaffrights.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnaffrights.block.display.BonnieBunnieHeadDisplayItem;

public class BonnieBunnieHeadDisplayModel extends AnimatedGeoModel<BonnieBunnieHeadDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(BonnieBunnieHeadDisplayItem animatable) {
		return new ResourceLocation("fnaf_frights", "animations/bonniebunniehead.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(BonnieBunnieHeadDisplayItem animatable) {
		return new ResourceLocation("fnaf_frights", "geo/bonniebunniehead.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(BonnieBunnieHeadDisplayItem entity) {
		return new ResourceLocation("fnaf_frights", "textures/blocks/bonnie_the_bunny.png");
	}
}
