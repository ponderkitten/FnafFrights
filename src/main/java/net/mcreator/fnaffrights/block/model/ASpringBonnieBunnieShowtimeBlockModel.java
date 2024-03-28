package net.mcreator.fnaffrights.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnaffrights.block.entity.ASpringBonnieBunnieShowtimeTileEntity;

public class ASpringBonnieBunnieShowtimeBlockModel extends AnimatedGeoModel<ASpringBonnieBunnieShowtimeTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(ASpringBonnieBunnieShowtimeTileEntity animatable) {
		return new ResourceLocation("fnaf_frights", "animations/abonniebunnieshowtime.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(ASpringBonnieBunnieShowtimeTileEntity animatable) {
		return new ResourceLocation("fnaf_frights", "geo/abonniebunnieshowtime.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(ASpringBonnieBunnieShowtimeTileEntity entity) {
		return new ResourceLocation("fnaf_frights", "textures/blocks/spring_bonnie_fnaf1.png");
	}
}
