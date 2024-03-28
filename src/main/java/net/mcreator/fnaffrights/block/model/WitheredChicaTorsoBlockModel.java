package net.mcreator.fnaffrights.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnaffrights.block.entity.WitheredChicaTorsoTileEntity;

public class WitheredChicaTorsoBlockModel extends AnimatedGeoModel<WitheredChicaTorsoTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(WitheredChicaTorsoTileEntity animatable) {
		return new ResourceLocation("fnaf_frights", "animations/witheredchicatorso.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(WitheredChicaTorsoTileEntity animatable) {
		return new ResourceLocation("fnaf_frights", "geo/witheredchicatorso.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(WitheredChicaTorsoTileEntity entity) {
		return new ResourceLocation("fnaf_frights", "textures/blocks/witheredchicatexture.png");
	}
}
