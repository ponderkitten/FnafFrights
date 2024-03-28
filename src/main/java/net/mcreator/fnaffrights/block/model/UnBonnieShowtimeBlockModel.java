package net.mcreator.fnaffrights.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnaffrights.block.entity.UnBonnieShowtimeTileEntity;

public class UnBonnieShowtimeBlockModel extends AnimatedGeoModel<UnBonnieShowtimeTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(UnBonnieShowtimeTileEntity animatable) {
		return new ResourceLocation("fnaf_frights", "animations/bonnieshowtime.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(UnBonnieShowtimeTileEntity animatable) {
		return new ResourceLocation("fnaf_frights", "geo/bonnieshowtime.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(UnBonnieShowtimeTileEntity entity) {
		return new ResourceLocation("fnaf_frights", "textures/blocks/unbonnie.png");
	}
}
