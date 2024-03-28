package net.mcreator.fnaffrights.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnaffrights.block.entity.WitheredGoldenFreddyBlcokTileEntity;

public class WitheredGoldenFreddyBlcokBlockModel extends AnimatedGeoModel<WitheredGoldenFreddyBlcokTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(WitheredGoldenFreddyBlcokTileEntity animatable) {
		return new ResourceLocation("fnaf_frights", "animations/witheredfreddyblock.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(WitheredGoldenFreddyBlcokTileEntity animatable) {
		return new ResourceLocation("fnaf_frights", "geo/witheredfreddyblock.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(WitheredGoldenFreddyBlcokTileEntity entity) {
		return new ResourceLocation("fnaf_frights", "textures/blocks/witheredgoldenfreddytexture.png");
	}
}
