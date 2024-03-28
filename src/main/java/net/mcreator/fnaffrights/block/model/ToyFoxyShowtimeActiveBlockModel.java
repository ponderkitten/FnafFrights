package net.mcreator.fnaffrights.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnaffrights.block.entity.ToyFoxyShowtimeActiveTileEntity;

public class ToyFoxyShowtimeActiveBlockModel extends AnimatedGeoModel<ToyFoxyShowtimeActiveTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(ToyFoxyShowtimeActiveTileEntity animatable) {
		return new ResourceLocation("fnaf_frights", "animations/toyfoxyshowtimeactive.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(ToyFoxyShowtimeActiveTileEntity animatable) {
		return new ResourceLocation("fnaf_frights", "geo/toyfoxyshowtimeactive.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(ToyFoxyShowtimeActiveTileEntity entity) {
		return new ResourceLocation("fnaf_frights", "textures/blocks/toy_foxy.png");
	}
}
