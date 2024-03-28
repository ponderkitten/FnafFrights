package net.mcreator.fnaffrights.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnaffrights.block.entity.ASpringtrapShowtimeTileEntity;

public class ASpringtrapShowtimeBlockModel extends AnimatedGeoModel<ASpringtrapShowtimeTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(ASpringtrapShowtimeTileEntity animatable) {
		return new ResourceLocation("fnaf_frights", "animations/aspringtrapshowtime.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(ASpringtrapShowtimeTileEntity animatable) {
		return new ResourceLocation("fnaf_frights", "geo/aspringtrapshowtime.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(ASpringtrapShowtimeTileEntity entity) {
		return new ResourceLocation("fnaf_frights", "textures/blocks/springtrapsuffer.png");
	}
}
