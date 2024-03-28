package net.mcreator.fnaffrights.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnaffrights.block.entity.AFreddyShowtimeTileEntity;

public class AFreddyShowtimeBlockModel extends AnimatedGeoModel<AFreddyShowtimeTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(AFreddyShowtimeTileEntity animatable) {
		return new ResourceLocation("fnaf_frights", "animations/afreddyshowtime.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(AFreddyShowtimeTileEntity animatable) {
		return new ResourceLocation("fnaf_frights", "geo/afreddyshowtime.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(AFreddyShowtimeTileEntity entity) {
		return new ResourceLocation("fnaf_frights", "textures/blocks/unwithered_freddy.png");
	}
}
