package net.mcreator.fnaffrights.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnaffrights.block.entity.OffsetFoxyShowtimeTileEntity;

public class OffsetFoxyShowtimeBlockModel extends AnimatedGeoModel<OffsetFoxyShowtimeTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(OffsetFoxyShowtimeTileEntity animatable) {
		return new ResourceLocation("fnaf_frights", "animations/ofoxyshowtime.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(OffsetFoxyShowtimeTileEntity animatable) {
		return new ResourceLocation("fnaf_frights", "geo/ofoxyshowtime.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(OffsetFoxyShowtimeTileEntity entity) {
		return new ResourceLocation("fnaf_frights", "textures/blocks/unwithered_foxy.png");
	}
}
