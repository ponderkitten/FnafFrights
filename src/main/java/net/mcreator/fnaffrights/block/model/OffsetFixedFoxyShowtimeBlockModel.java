package net.mcreator.fnaffrights.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnaffrights.block.entity.OffsetFixedFoxyShowtimeTileEntity;

public class OffsetFixedFoxyShowtimeBlockModel extends AnimatedGeoModel<OffsetFixedFoxyShowtimeTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(OffsetFixedFoxyShowtimeTileEntity animatable) {
		return new ResourceLocation("fnaf_frights", "animations/ofixedfoxypirateshowtime.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(OffsetFixedFoxyShowtimeTileEntity animatable) {
		return new ResourceLocation("fnaf_frights", "geo/ofixedfoxypirateshowtime.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(OffsetFixedFoxyShowtimeTileEntity entity) {
		return new ResourceLocation("fnaf_frights", "textures/blocks/fixedfoxy.png");
	}
}
