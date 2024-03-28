package net.mcreator.fnaffrights.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnaffrights.block.entity.ChicaTorsoTileEntity;

public class ChicaTorsoBlockModel extends AnimatedGeoModel<ChicaTorsoTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(ChicaTorsoTileEntity animatable) {
		return new ResourceLocation("fnaf_frights", "animations/chicatorso.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(ChicaTorsoTileEntity animatable) {
		return new ResourceLocation("fnaf_frights", "geo/chicatorso.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(ChicaTorsoTileEntity entity) {
		return new ResourceLocation("fnaf_frights", "textures/blocks/unwithered_chica.png");
	}
}
