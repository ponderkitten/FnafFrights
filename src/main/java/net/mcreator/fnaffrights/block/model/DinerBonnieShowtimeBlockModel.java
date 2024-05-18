package net.mcreator.fnaffrights.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnaffrights.block.entity.DinerBonnieShowtimeTileEntity;

public class DinerBonnieShowtimeBlockModel extends AnimatedGeoModel<DinerBonnieShowtimeTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(DinerBonnieShowtimeTileEntity animatable) {
		return new ResourceLocation("fnaf_frights", "animations/showtimedinerbonnie.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(DinerBonnieShowtimeTileEntity animatable) {
		return new ResourceLocation("fnaf_frights", "geo/showtimedinerbonnie.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(DinerBonnieShowtimeTileEntity entity) {
		return new ResourceLocation("fnaf_frights", "textures/blocks/dinerbonnie.png");
	}
}
