package net.mcreator.fnaffrights.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnaffrights.block.entity.ToyFoxyBlockTileEntity;

public class ToyFoxyBlockBlockModel extends AnimatedGeoModel<ToyFoxyBlockTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(ToyFoxyBlockTileEntity animatable) {
		return new ResourceLocation("fnaf_frights", "animations/toyfoxyblock.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(ToyFoxyBlockTileEntity animatable) {
		return new ResourceLocation("fnaf_frights", "geo/toyfoxyblock.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(ToyFoxyBlockTileEntity entity) {
		return new ResourceLocation("fnaf_frights", "textures/blocks/toy_foxy.png");
	}
}
