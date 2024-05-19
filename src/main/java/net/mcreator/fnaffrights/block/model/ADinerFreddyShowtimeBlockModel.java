package net.mcreator.fnaffrights.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnaffrights.block.entity.ADinerFreddyShowtimeTileEntity;

public class ADinerFreddyShowtimeBlockModel extends AnimatedGeoModel<ADinerFreddyShowtimeTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(ADinerFreddyShowtimeTileEntity animatable) {
		return new ResourceLocation("fnaf_frights", "animations/ashowtimedinerfreddy.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(ADinerFreddyShowtimeTileEntity animatable) {
		return new ResourceLocation("fnaf_frights", "geo/ashowtimedinerfreddy.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(ADinerFreddyShowtimeTileEntity entity) {
		return new ResourceLocation("fnaf_frights", "textures/blocks/dinerfreddy.png");
	}
}
