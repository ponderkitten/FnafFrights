package net.mcreator.fnaffrights.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnaffrights.block.entity.ToyFoxyHeadTileEntity;

public class ToyFoxyHeadBlockModel extends AnimatedGeoModel<ToyFoxyHeadTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(ToyFoxyHeadTileEntity animatable) {
		return new ResourceLocation("fnaf_frights", "animations/toyfoxyhead.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(ToyFoxyHeadTileEntity animatable) {
		return new ResourceLocation("fnaf_frights", "geo/toyfoxyhead.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(ToyFoxyHeadTileEntity entity) {
		return new ResourceLocation("fnaf_frights", "textures/blocks/toy_foxy.png");
	}
}
