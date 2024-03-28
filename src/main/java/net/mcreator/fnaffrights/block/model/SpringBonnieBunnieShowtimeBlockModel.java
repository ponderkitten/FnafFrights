package net.mcreator.fnaffrights.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnaffrights.block.entity.SpringBonnieBunnieShowtimeTileEntity;

public class SpringBonnieBunnieShowtimeBlockModel extends AnimatedGeoModel<SpringBonnieBunnieShowtimeTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(SpringBonnieBunnieShowtimeTileEntity animatable) {
		return new ResourceLocation("fnaf_frights", "animations/bonniebunnieshowtime.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(SpringBonnieBunnieShowtimeTileEntity animatable) {
		return new ResourceLocation("fnaf_frights", "geo/bonniebunnieshowtime.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(SpringBonnieBunnieShowtimeTileEntity entity) {
		return new ResourceLocation("fnaf_frights", "textures/blocks/spring_bonnie_fnaf1.png");
	}
}
