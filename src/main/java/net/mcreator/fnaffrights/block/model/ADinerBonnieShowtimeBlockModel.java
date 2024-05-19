package net.mcreator.fnaffrights.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnaffrights.block.entity.ADinerBonnieShowtimeTileEntity;

public class ADinerBonnieShowtimeBlockModel extends AnimatedGeoModel<ADinerBonnieShowtimeTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(ADinerBonnieShowtimeTileEntity animatable) {
		return new ResourceLocation("fnaf_frights", "animations/ashowtimedinerbonnie.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(ADinerBonnieShowtimeTileEntity animatable) {
		return new ResourceLocation("fnaf_frights", "geo/ashowtimedinerbonnie.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(ADinerBonnieShowtimeTileEntity entity) {
		return new ResourceLocation("fnaf_frights", "textures/blocks/dinerbonnie.png");
	}
}
