package net.mcreator.fnaffrights.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnaffrights.block.entity.ODinerFreddyShowtimeTileEntity;

public class ODinerFreddyShowtimeBlockModel extends AnimatedGeoModel<ODinerFreddyShowtimeTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(ODinerFreddyShowtimeTileEntity animatable) {
		return new ResourceLocation("fnaf_frights", "animations/oshowtimedinerfreddy.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(ODinerFreddyShowtimeTileEntity animatable) {
		return new ResourceLocation("fnaf_frights", "geo/oshowtimedinerfreddy.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(ODinerFreddyShowtimeTileEntity entity) {
		return new ResourceLocation("fnaf_frights", "textures/blocks/dinerfreddy.png");
	}
}
