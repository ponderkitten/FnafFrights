package net.mcreator.fnaffrights.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnaffrights.block.entity.AFixedFoxyShowtimeTileEntity;

public class AFixedFoxyShowtimeBlockModel extends AnimatedGeoModel<AFixedFoxyShowtimeTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(AFixedFoxyShowtimeTileEntity animatable) {
		return new ResourceLocation("fnaf_frights", "animations/afixedfoxypirateshowtime.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(AFixedFoxyShowtimeTileEntity animatable) {
		return new ResourceLocation("fnaf_frights", "geo/afixedfoxypirateshowtime.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(AFixedFoxyShowtimeTileEntity entity) {
		return new ResourceLocation("fnaf_frights", "textures/blocks/fixedfoxy.png");
	}
}
