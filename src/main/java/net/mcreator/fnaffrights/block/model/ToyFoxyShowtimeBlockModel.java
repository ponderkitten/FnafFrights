package net.mcreator.fnaffrights.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnaffrights.block.entity.ToyFoxyShowtimeTileEntity;

public class ToyFoxyShowtimeBlockModel extends AnimatedGeoModel<ToyFoxyShowtimeTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(ToyFoxyShowtimeTileEntity animatable) {
		return new ResourceLocation("fnaf_frights", "animations/toyfoxyshowtime.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(ToyFoxyShowtimeTileEntity animatable) {
		return new ResourceLocation("fnaf_frights", "geo/toyfoxyshowtime.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(ToyFoxyShowtimeTileEntity entity) {
		return new ResourceLocation("fnaf_frights", "textures/blocks/toy_foxy.png");
	}
}
