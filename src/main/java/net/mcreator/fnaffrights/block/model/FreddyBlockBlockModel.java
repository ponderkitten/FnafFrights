package net.mcreator.fnaffrights.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnaffrights.block.entity.FreddyBlockTileEntity;

public class FreddyBlockBlockModel extends AnimatedGeoModel<FreddyBlockTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(FreddyBlockTileEntity animatable) {
		return new ResourceLocation("fnaf_frights", "animations/witheredfreddyblock.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(FreddyBlockTileEntity animatable) {
		return new ResourceLocation("fnaf_frights", "geo/witheredfreddyblock.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(FreddyBlockTileEntity entity) {
		return new ResourceLocation("fnaf_frights", "textures/blocks/unwithered_freddy.png");
	}
}
