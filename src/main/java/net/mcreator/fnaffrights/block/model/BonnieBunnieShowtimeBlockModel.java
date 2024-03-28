package net.mcreator.fnaffrights.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnaffrights.block.entity.BonnieBunnieShowtimeTileEntity;

public class BonnieBunnieShowtimeBlockModel extends AnimatedGeoModel<BonnieBunnieShowtimeTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(BonnieBunnieShowtimeTileEntity animatable) {
		return new ResourceLocation("fnaf_frights", "animations/bonniebunnieshowtime.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(BonnieBunnieShowtimeTileEntity animatable) {
		return new ResourceLocation("fnaf_frights", "geo/bonniebunnieshowtime.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(BonnieBunnieShowtimeTileEntity entity) {
		return new ResourceLocation("fnaf_frights", "textures/blocks/bonnie_the_bunny.png");
	}
}
