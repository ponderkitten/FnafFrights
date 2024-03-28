package net.mcreator.fnaffrights.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnaffrights.block.entity.WitheredFreddyBlockTileEntity;

public class WitheredFreddyBlockBlockModel extends AnimatedGeoModel<WitheredFreddyBlockTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(WitheredFreddyBlockTileEntity animatable) {
		return new ResourceLocation("fnaf_frights", "animations/witheredfreddyblock.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(WitheredFreddyBlockTileEntity animatable) {
		return new ResourceLocation("fnaf_frights", "geo/witheredfreddyblock.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(WitheredFreddyBlockTileEntity entity) {
		return new ResourceLocation("fnaf_frights", "textures/blocks/witheredfreddytexture.png");
	}
}
