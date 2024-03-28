package net.mcreator.fnaffrights.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnaffrights.block.entity.SpringBonnieBunnieHeadTileEntity;

public class SpringBonnieBunnieHeadBlockModel extends AnimatedGeoModel<SpringBonnieBunnieHeadTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(SpringBonnieBunnieHeadTileEntity animatable) {
		return new ResourceLocation("fnaf_frights", "animations/bonniebunniehead.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(SpringBonnieBunnieHeadTileEntity animatable) {
		return new ResourceLocation("fnaf_frights", "geo/bonniebunniehead.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(SpringBonnieBunnieHeadTileEntity entity) {
		return new ResourceLocation("fnaf_frights", "textures/blocks/spring_bonnie_fnaf1.png");
	}
}
