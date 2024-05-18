package net.mcreator.fnaffrights.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnaffrights.block.entity.DinerFreddyShowtimeTileEntity;

public class DinerFreddyShowtimeBlockModel extends AnimatedGeoModel<DinerFreddyShowtimeTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(DinerFreddyShowtimeTileEntity animatable) {
		return new ResourceLocation("fnaf_frights", "animations/showtimedinerfreddy.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(DinerFreddyShowtimeTileEntity animatable) {
		return new ResourceLocation("fnaf_frights", "geo/showtimedinerfreddy.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(DinerFreddyShowtimeTileEntity entity) {
		return new ResourceLocation("fnaf_frights", "textures/blocks/dinerfreddy.png");
	}
}
