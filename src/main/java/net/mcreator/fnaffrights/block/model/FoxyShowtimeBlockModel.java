package net.mcreator.fnaffrights.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnaffrights.block.entity.FoxyShowtimeTileEntity;

public class FoxyShowtimeBlockModel extends AnimatedGeoModel<FoxyShowtimeTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(FoxyShowtimeTileEntity animatable) {
		return new ResourceLocation("fnaf_frights", "animations/foxyshowtime.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(FoxyShowtimeTileEntity animatable) {
		return new ResourceLocation("fnaf_frights", "geo/foxyshowtime.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(FoxyShowtimeTileEntity entity) {
		return new ResourceLocation("fnaf_frights", "textures/blocks/unwithered_foxy.png");
	}
}
