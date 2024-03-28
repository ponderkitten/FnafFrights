package net.mcreator.fnaffrights.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnaffrights.block.entity.ToyFreddyHeadTileEntity;

public class ToyFreddyHeadBlockModel extends AnimatedGeoModel<ToyFreddyHeadTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(ToyFreddyHeadTileEntity animatable) {
		return new ResourceLocation("fnaf_frights", "animations/toyfreddyhead.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(ToyFreddyHeadTileEntity animatable) {
		return new ResourceLocation("fnaf_frights", "geo/toyfreddyhead.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(ToyFreddyHeadTileEntity entity) {
		return new ResourceLocation("fnaf_frights", "textures/blocks/toy_freddy.png");
	}
}
