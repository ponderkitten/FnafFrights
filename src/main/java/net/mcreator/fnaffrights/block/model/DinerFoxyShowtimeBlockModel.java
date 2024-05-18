package net.mcreator.fnaffrights.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnaffrights.block.entity.DinerFoxyShowtimeTileEntity;

public class DinerFoxyShowtimeBlockModel extends AnimatedGeoModel<DinerFoxyShowtimeTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(DinerFoxyShowtimeTileEntity animatable) {
		return new ResourceLocation("fnaf_frights", "animations/showtimedinerfoxy.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(DinerFoxyShowtimeTileEntity animatable) {
		return new ResourceLocation("fnaf_frights", "geo/showtimedinerfoxy.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(DinerFoxyShowtimeTileEntity entity) {
		return new ResourceLocation("fnaf_frights", "textures/blocks/dinerfoxy.png");
	}
}
