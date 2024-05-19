package net.mcreator.fnaffrights.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnaffrights.block.entity.ODinerFoxyActiveTileEntity;

public class ODinerFoxyActiveBlockModel extends AnimatedGeoModel<ODinerFoxyActiveTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(ODinerFoxyActiveTileEntity animatable) {
		return new ResourceLocation("fnaf_frights", "animations/oshowtimedinerfoxyactive.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(ODinerFoxyActiveTileEntity animatable) {
		return new ResourceLocation("fnaf_frights", "geo/oshowtimedinerfoxyactive.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(ODinerFoxyActiveTileEntity entity) {
		return new ResourceLocation("fnaf_frights", "textures/blocks/dinerfoxy.png");
	}
}
