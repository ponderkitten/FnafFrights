package net.mcreator.fnaffrights.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnaffrights.block.entity.GoldenFreddyShowtimeActiveTileEntity;

public class GoldenFreddyShowtimeActiveBlockModel extends AnimatedGeoModel<GoldenFreddyShowtimeActiveTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(GoldenFreddyShowtimeActiveTileEntity animatable) {
		return new ResourceLocation("fnaf_frights", "animations/freddyfazbearshowtimeactive.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(GoldenFreddyShowtimeActiveTileEntity animatable) {
		return new ResourceLocation("fnaf_frights", "geo/freddyfazbearshowtimeactive.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(GoldenFreddyShowtimeActiveTileEntity entity) {
		return new ResourceLocation("fnaf_frights", "textures/blocks/golden_freddy_normal_eyes.png");
	}
}
