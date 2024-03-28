package net.mcreator.fnaffrights.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnaffrights.block.entity.AToyFreddyActiveTileEntity;

public class AToyFreddyActiveBlockModel extends AnimatedGeoModel<AToyFreddyActiveTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(AToyFreddyActiveTileEntity animatable) {
		return new ResourceLocation("fnaf_frights", "animations/atoyfreddyshowtimeactive.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(AToyFreddyActiveTileEntity animatable) {
		return new ResourceLocation("fnaf_frights", "geo/atoyfreddyshowtimeactive.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(AToyFreddyActiveTileEntity entity) {
		return new ResourceLocation("fnaf_frights", "textures/blocks/toy_freddy.png");
	}
}
