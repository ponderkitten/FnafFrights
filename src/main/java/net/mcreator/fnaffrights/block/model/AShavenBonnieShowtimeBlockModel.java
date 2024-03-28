package net.mcreator.fnaffrights.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnaffrights.block.entity.AShavenBonnieShowtimeTileEntity;

public class AShavenBonnieShowtimeBlockModel extends AnimatedGeoModel<AShavenBonnieShowtimeTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(AShavenBonnieShowtimeTileEntity animatable) {
		return new ResourceLocation("fnaf_frights", "animations/abonnieshowtime.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(AShavenBonnieShowtimeTileEntity animatable) {
		return new ResourceLocation("fnaf_frights", "geo/abonnieshowtime.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(AShavenBonnieShowtimeTileEntity entity) {
		return new ResourceLocation("fnaf_frights", "textures/blocks/unbonnie.png");
	}
}
