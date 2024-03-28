package net.mcreator.fnaffrights.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnaffrights.block.entity.OffsetFreddyActiveTileEntity;

public class OffsetFreddyActiveBlockModel extends AnimatedGeoModel<OffsetFreddyActiveTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(OffsetFreddyActiveTileEntity animatable) {
		return new ResourceLocation("fnaf_frights", "animations/ofreddyshowtimeactive.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(OffsetFreddyActiveTileEntity animatable) {
		return new ResourceLocation("fnaf_frights", "geo/ofreddyshowtimeactive.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(OffsetFreddyActiveTileEntity entity) {
		return new ResourceLocation("fnaf_frights", "textures/blocks/unwithered_freddy.png");
	}
}
