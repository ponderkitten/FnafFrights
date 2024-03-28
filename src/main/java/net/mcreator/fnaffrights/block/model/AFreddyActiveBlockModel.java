package net.mcreator.fnaffrights.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnaffrights.block.entity.AFreddyActiveTileEntity;

public class AFreddyActiveBlockModel extends AnimatedGeoModel<AFreddyActiveTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(AFreddyActiveTileEntity animatable) {
		return new ResourceLocation("fnaf_frights", "animations/afreddyshowtimeactive.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(AFreddyActiveTileEntity animatable) {
		return new ResourceLocation("fnaf_frights", "geo/afreddyshowtimeactive.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(AFreddyActiveTileEntity entity) {
		return new ResourceLocation("fnaf_frights", "textures/blocks/unwithered_freddy.png");
	}
}
