package net.mcreator.fnaffrights.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnaffrights.block.entity.OffsetFreddyShowtimeTileEntity;

public class OffsetFreddyShowtimeBlockModel extends AnimatedGeoModel<OffsetFreddyShowtimeTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(OffsetFreddyShowtimeTileEntity animatable) {
		return new ResourceLocation("fnaf_frights", "animations/ofreddyshowtime.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(OffsetFreddyShowtimeTileEntity animatable) {
		return new ResourceLocation("fnaf_frights", "geo/ofreddyshowtime.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(OffsetFreddyShowtimeTileEntity entity) {
		return new ResourceLocation("fnaf_frights", "textures/blocks/unwithered_freddy.png");
	}
}
