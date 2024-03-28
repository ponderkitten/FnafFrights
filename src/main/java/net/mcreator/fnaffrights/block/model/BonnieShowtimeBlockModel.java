package net.mcreator.fnaffrights.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnaffrights.block.entity.BonnieShowtimeTileEntity;

public class BonnieShowtimeBlockModel extends AnimatedGeoModel<BonnieShowtimeTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(BonnieShowtimeTileEntity animatable) {
		return new ResourceLocation("fnaf_frights", "animations/bonnieshowtime.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(BonnieShowtimeTileEntity animatable) {
		return new ResourceLocation("fnaf_frights", "geo/bonnieshowtime.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(BonnieShowtimeTileEntity entity) {
		return new ResourceLocation("fnaf_frights", "textures/blocks/unwithered_bonnie.png");
	}
}
