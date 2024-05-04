package net.mcreator.fnaffrights.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnaffrights.block.entity.BurntBBTileEntity;

public class BurntBBBlockModel extends AnimatedGeoModel<BurntBBTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(BurntBBTileEntity animatable) {
		return new ResourceLocation("fnaf_frights", "animations/balloonboy.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(BurntBBTileEntity animatable) {
		return new ResourceLocation("fnaf_frights", "geo/balloonboy.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(BurntBBTileEntity entity) {
		return new ResourceLocation("fnaf_frights", "textures/blocks/bb_burnt.png");
	}
}
