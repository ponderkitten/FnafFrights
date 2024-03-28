package net.mcreator.fnaffrights.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnaffrights.block.entity.ABonnieBunnieShowtimeTileEntity;

public class ABonnieBunnieShowtimeBlockModel extends AnimatedGeoModel<ABonnieBunnieShowtimeTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(ABonnieBunnieShowtimeTileEntity animatable) {
		return new ResourceLocation("fnaf_frights", "animations/abonniebunnieshowtime.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(ABonnieBunnieShowtimeTileEntity animatable) {
		return new ResourceLocation("fnaf_frights", "geo/abonniebunnieshowtime.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(ABonnieBunnieShowtimeTileEntity entity) {
		return new ResourceLocation("fnaf_frights", "textures/blocks/bonnie_the_bunny.png");
	}
}
