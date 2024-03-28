package net.mcreator.fnaffrights.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnaffrights.block.entity.OffsetToyFoxyShowtimeTileEntity;

public class OffsetToyFoxyShowtimeBlockModel extends AnimatedGeoModel<OffsetToyFoxyShowtimeTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(OffsetToyFoxyShowtimeTileEntity animatable) {
		return new ResourceLocation("fnaf_frights", "animations/otoyfoxyshowtime.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(OffsetToyFoxyShowtimeTileEntity animatable) {
		return new ResourceLocation("fnaf_frights", "geo/otoyfoxyshowtime.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(OffsetToyFoxyShowtimeTileEntity entity) {
		return new ResourceLocation("fnaf_frights", "textures/blocks/toy_foxy.png");
	}
}
