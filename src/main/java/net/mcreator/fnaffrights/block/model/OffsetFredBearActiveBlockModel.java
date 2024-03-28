package net.mcreator.fnaffrights.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnaffrights.block.entity.OffsetFredBearActiveTileEntity;

public class OffsetFredBearActiveBlockModel extends AnimatedGeoModel<OffsetFredBearActiveTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(OffsetFredBearActiveTileEntity animatable) {
		return new ResourceLocation("fnaf_frights", "animations/ofredbearshowtimeactive.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(OffsetFredBearActiveTileEntity animatable) {
		return new ResourceLocation("fnaf_frights", "geo/ofredbearshowtimeactive.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(OffsetFredBearActiveTileEntity entity) {
		return new ResourceLocation("fnaf_frights", "textures/blocks/fredbear4.png");
	}
}
