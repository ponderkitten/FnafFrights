package net.mcreator.fnaffrights.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnaffrights.block.entity.ChicaShowtimeActiveTileEntity;

public class ChicaShowtimeActiveBlockModel extends AnimatedGeoModel<ChicaShowtimeActiveTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(ChicaShowtimeActiveTileEntity animatable) {
		return new ResourceLocation("fnaf_frights", "animations/chicashowtimeactive.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(ChicaShowtimeActiveTileEntity animatable) {
		return new ResourceLocation("fnaf_frights", "geo/chicashowtimeactive.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(ChicaShowtimeActiveTileEntity entity) {
		return new ResourceLocation("fnaf_frights", "textures/blocks/unwithered_chica.png");
	}
}
