package net.mcreator.fnaffrights.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnaffrights.block.entity.ToyFreddyShowtimeActiveTileEntity;

public class ToyFreddyShowtimeActiveBlockModel extends AnimatedGeoModel<ToyFreddyShowtimeActiveTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(ToyFreddyShowtimeActiveTileEntity animatable) {
		return new ResourceLocation("fnaf_frights", "animations/toyfreddyshowtimeactive.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(ToyFreddyShowtimeActiveTileEntity animatable) {
		return new ResourceLocation("fnaf_frights", "geo/toyfreddyshowtimeactive.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(ToyFreddyShowtimeActiveTileEntity entity) {
		return new ResourceLocation("fnaf_frights", "textures/blocks/toy_freddy.png");
	}
}
