package net.mcreator.fnaffrights.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnaffrights.block.entity.ToyChicaTorsoTileEntity;

public class ToyChicaTorsoBlockModel extends AnimatedGeoModel<ToyChicaTorsoTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(ToyChicaTorsoTileEntity animatable) {
		return new ResourceLocation("fnaf_frights", "animations/toychicatorso.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(ToyChicaTorsoTileEntity animatable) {
		return new ResourceLocation("fnaf_frights", "geo/toychicatorso.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(ToyChicaTorsoTileEntity entity) {
		return new ResourceLocation("fnaf_frights", "textures/blocks/toy_chica.png");
	}
}
