package net.mcreator.fnaffrights.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnaffrights.block.entity.DinerFoxyActiveTileEntity;

public class DinerFoxyActiveBlockModel extends AnimatedGeoModel<DinerFoxyActiveTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(DinerFoxyActiveTileEntity animatable) {
		return new ResourceLocation("fnaf_frights", "animations/showtimedinerfoxyactive.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(DinerFoxyActiveTileEntity animatable) {
		return new ResourceLocation("fnaf_frights", "geo/showtimedinerfoxyactive.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(DinerFoxyActiveTileEntity entity) {
		return new ResourceLocation("fnaf_frights", "textures/blocks/dinerfoxy.png");
	}
}
