package net.mcreator.fnaffrights.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnaffrights.block.entity.ToyFreddyBlockTileEntity;

public class ToyFreddyBlockBlockModel extends AnimatedGeoModel<ToyFreddyBlockTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(ToyFreddyBlockTileEntity animatable) {
		return new ResourceLocation("fnaf_frights", "animations/toyfreddyblock.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(ToyFreddyBlockTileEntity animatable) {
		return new ResourceLocation("fnaf_frights", "geo/toyfreddyblock.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(ToyFreddyBlockTileEntity entity) {
		return new ResourceLocation("fnaf_frights", "textures/blocks/toy_freddy.png");
	}
}
