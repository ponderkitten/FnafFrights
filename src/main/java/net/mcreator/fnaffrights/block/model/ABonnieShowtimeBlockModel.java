package net.mcreator.fnaffrights.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnaffrights.block.entity.ABonnieShowtimeTileEntity;

public class ABonnieShowtimeBlockModel extends AnimatedGeoModel<ABonnieShowtimeTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(ABonnieShowtimeTileEntity animatable) {
		return new ResourceLocation("fnaf_frights", "animations/abonnieshowtime.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(ABonnieShowtimeTileEntity animatable) {
		return new ResourceLocation("fnaf_frights", "geo/abonnieshowtime.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(ABonnieShowtimeTileEntity entity) {
		return new ResourceLocation("fnaf_frights", "textures/blocks/unwithered_bonnie.png");
	}
}
