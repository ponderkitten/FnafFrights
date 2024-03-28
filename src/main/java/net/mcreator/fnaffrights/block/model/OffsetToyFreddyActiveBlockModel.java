package net.mcreator.fnaffrights.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnaffrights.block.entity.OffsetToyFreddyActiveTileEntity;

public class OffsetToyFreddyActiveBlockModel extends AnimatedGeoModel<OffsetToyFreddyActiveTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(OffsetToyFreddyActiveTileEntity animatable) {
		return new ResourceLocation("fnaf_frights", "animations/otoyfreddyshowtimeactive.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(OffsetToyFreddyActiveTileEntity animatable) {
		return new ResourceLocation("fnaf_frights", "geo/otoyfreddyshowtimeactive.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(OffsetToyFreddyActiveTileEntity entity) {
		return new ResourceLocation("fnaf_frights", "textures/blocks/toy_freddy.png");
	}
}
