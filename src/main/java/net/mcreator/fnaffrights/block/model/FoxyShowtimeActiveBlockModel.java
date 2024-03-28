package net.mcreator.fnaffrights.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnaffrights.block.entity.FoxyShowtimeActiveTileEntity;

public class FoxyShowtimeActiveBlockModel extends AnimatedGeoModel<FoxyShowtimeActiveTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(FoxyShowtimeActiveTileEntity animatable) {
		return new ResourceLocation("fnaf_frights", "animations/foxyshowtimeactive.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(FoxyShowtimeActiveTileEntity animatable) {
		return new ResourceLocation("fnaf_frights", "geo/foxyshowtimeactive.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(FoxyShowtimeActiveTileEntity entity) {
		return new ResourceLocation("fnaf_frights", "textures/blocks/unwithered_foxy.png");
	}
}
