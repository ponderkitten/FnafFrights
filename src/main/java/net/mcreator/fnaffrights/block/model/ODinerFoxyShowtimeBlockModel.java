package net.mcreator.fnaffrights.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnaffrights.block.entity.ODinerFoxyShowtimeTileEntity;

public class ODinerFoxyShowtimeBlockModel extends AnimatedGeoModel<ODinerFoxyShowtimeTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(ODinerFoxyShowtimeTileEntity animatable) {
		return new ResourceLocation("fnaf_frights", "animations/oshowtimedinerfoxy.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(ODinerFoxyShowtimeTileEntity animatable) {
		return new ResourceLocation("fnaf_frights", "geo/oshowtimedinerfoxy.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(ODinerFoxyShowtimeTileEntity entity) {
		return new ResourceLocation("fnaf_frights", "textures/blocks/dinerfoxy.png");
	}
}
