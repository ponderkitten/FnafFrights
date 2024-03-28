package net.mcreator.fnaffrights.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnaffrights.block.entity.OffsetFoxyActiveTileEntity;

public class OffsetFoxyActiveBlockModel extends AnimatedGeoModel<OffsetFoxyActiveTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(OffsetFoxyActiveTileEntity animatable) {
		return new ResourceLocation("fnaf_frights", "animations/ofoxyshowtimeactive.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(OffsetFoxyActiveTileEntity animatable) {
		return new ResourceLocation("fnaf_frights", "geo/ofoxyshowtimeactive.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(OffsetFoxyActiveTileEntity entity) {
		return new ResourceLocation("fnaf_frights", "textures/blocks/unwithered_foxy.png");
	}
}
