package net.mcreator.fnaffrights.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnaffrights.block.entity.AToyFoxyShowtimeTileEntity;

public class AToyFoxyShowtimeBlockModel extends AnimatedGeoModel<AToyFoxyShowtimeTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(AToyFoxyShowtimeTileEntity animatable) {
		return new ResourceLocation("fnaf_frights", "animations/atoyfoxyshowtime.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(AToyFoxyShowtimeTileEntity animatable) {
		return new ResourceLocation("fnaf_frights", "geo/atoyfoxyshowtime.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(AToyFoxyShowtimeTileEntity entity) {
		return new ResourceLocation("fnaf_frights", "textures/blocks/toy_foxy.png");
	}
}
