package net.mcreator.fnaffrights.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnaffrights.block.entity.ToyChicaShowtimeTileEntity;

public class ToyChicaShowtimeBlockModel extends AnimatedGeoModel<ToyChicaShowtimeTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(ToyChicaShowtimeTileEntity animatable) {
		return new ResourceLocation("fnaf_frights", "animations/toychicashowtime.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(ToyChicaShowtimeTileEntity animatable) {
		return new ResourceLocation("fnaf_frights", "geo/toychicashowtime.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(ToyChicaShowtimeTileEntity entity) {
		return new ResourceLocation("fnaf_frights", "textures/blocks/toy_chica.png");
	}
}
