package net.mcreator.fnaffrights.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnaffrights.block.entity.ToyChicaShowtimeActiveTileEntity;

public class ToyChicaShowtimeActiveBlockModel extends AnimatedGeoModel<ToyChicaShowtimeActiveTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(ToyChicaShowtimeActiveTileEntity animatable) {
		return new ResourceLocation("fnaf_frights", "animations/toychicashowtimeactive.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(ToyChicaShowtimeActiveTileEntity animatable) {
		return new ResourceLocation("fnaf_frights", "geo/toychicashowtimeactive.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(ToyChicaShowtimeActiveTileEntity entity) {
		return new ResourceLocation("fnaf_frights", "textures/blocks/toy_chica.png");
	}
}
