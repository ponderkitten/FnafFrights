package net.mcreator.fnaffrights.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnaffrights.block.entity.BonnieBunnieHeadTileEntity;

public class BonnieBunnieHeadBlockModel extends AnimatedGeoModel<BonnieBunnieHeadTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(BonnieBunnieHeadTileEntity animatable) {
		return new ResourceLocation("fnaf_frights", "animations/bonniebunniehead.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(BonnieBunnieHeadTileEntity animatable) {
		return new ResourceLocation("fnaf_frights", "geo/bonniebunniehead.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(BonnieBunnieHeadTileEntity entity) {
		return new ResourceLocation("fnaf_frights", "textures/blocks/bonnie_the_bunny.png");
	}
}
