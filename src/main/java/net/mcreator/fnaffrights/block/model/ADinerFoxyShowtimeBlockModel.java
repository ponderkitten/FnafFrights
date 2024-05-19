package net.mcreator.fnaffrights.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnaffrights.block.entity.ADinerFoxyShowtimeTileEntity;

public class ADinerFoxyShowtimeBlockModel extends AnimatedGeoModel<ADinerFoxyShowtimeTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(ADinerFoxyShowtimeTileEntity animatable) {
		return new ResourceLocation("fnaf_frights", "animations/ashowtimedinerfoxy.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(ADinerFoxyShowtimeTileEntity animatable) {
		return new ResourceLocation("fnaf_frights", "geo/ashowtimedinerfoxy.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(ADinerFoxyShowtimeTileEntity entity) {
		return new ResourceLocation("fnaf_frights", "textures/blocks/dinerfoxy.png");
	}
}
