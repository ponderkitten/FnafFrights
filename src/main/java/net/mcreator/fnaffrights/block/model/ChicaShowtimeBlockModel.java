package net.mcreator.fnaffrights.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnaffrights.block.entity.ChicaShowtimeTileEntity;

public class ChicaShowtimeBlockModel extends AnimatedGeoModel<ChicaShowtimeTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(ChicaShowtimeTileEntity animatable) {
		return new ResourceLocation("fnaf_frights", "animations/chicashowtime.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(ChicaShowtimeTileEntity animatable) {
		return new ResourceLocation("fnaf_frights", "geo/chicashowtime.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(ChicaShowtimeTileEntity entity) {
		return new ResourceLocation("fnaf_frights", "textures/blocks/unwithered_chica.png");
	}
}
