package net.mcreator.fnaffrights.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnaffrights.block.entity.FixedFoxyShowtimeTileEntity;

public class FixedFoxyShowtimeBlockModel extends AnimatedGeoModel<FixedFoxyShowtimeTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(FixedFoxyShowtimeTileEntity animatable) {
		return new ResourceLocation("fnaf_frights", "animations/fixedfoxypirateshowtime.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(FixedFoxyShowtimeTileEntity animatable) {
		return new ResourceLocation("fnaf_frights", "geo/fixedfoxypirateshowtime.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(FixedFoxyShowtimeTileEntity entity) {
		return new ResourceLocation("fnaf_frights", "textures/blocks/fixedfoxy.png");
	}
}
