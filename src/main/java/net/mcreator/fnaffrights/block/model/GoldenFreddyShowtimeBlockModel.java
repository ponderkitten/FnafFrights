package net.mcreator.fnaffrights.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnaffrights.block.entity.GoldenFreddyShowtimeTileEntity;

public class GoldenFreddyShowtimeBlockModel extends AnimatedGeoModel<GoldenFreddyShowtimeTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(GoldenFreddyShowtimeTileEntity animatable) {
		return new ResourceLocation("fnaf_frights", "animations/freddyfazbearshowtime.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(GoldenFreddyShowtimeTileEntity animatable) {
		return new ResourceLocation("fnaf_frights", "geo/freddyfazbearshowtime.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(GoldenFreddyShowtimeTileEntity entity) {
		return new ResourceLocation("fnaf_frights", "textures/blocks/golden_freddy_normal_eyes.png");
	}
}
