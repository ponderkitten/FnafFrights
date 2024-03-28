package net.mcreator.fnaffrights.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnaffrights.block.entity.ToyFreddyShowtimeTileEntity;

public class ToyFreddyShowtimeBlockModel extends AnimatedGeoModel<ToyFreddyShowtimeTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(ToyFreddyShowtimeTileEntity animatable) {
		return new ResourceLocation("fnaf_frights", "animations/toyfreddyshowtime.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(ToyFreddyShowtimeTileEntity animatable) {
		return new ResourceLocation("fnaf_frights", "geo/toyfreddyshowtime.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(ToyFreddyShowtimeTileEntity entity) {
		return new ResourceLocation("fnaf_frights", "textures/blocks/toy_freddy.png");
	}
}
