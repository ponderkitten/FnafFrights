package net.mcreator.fnaffrights.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnaffrights.block.entity.AFoxyShowtimeTileEntity;

public class AFoxyShowtimeBlockModel extends AnimatedGeoModel<AFoxyShowtimeTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(AFoxyShowtimeTileEntity animatable) {
		return new ResourceLocation("fnaf_frights", "animations/afoxyshowtime.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(AFoxyShowtimeTileEntity animatable) {
		return new ResourceLocation("fnaf_frights", "geo/afoxyshowtime.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(AFoxyShowtimeTileEntity entity) {
		return new ResourceLocation("fnaf_frights", "textures/blocks/unwithered_foxy.png");
	}
}
