package net.mcreator.fnaffrights.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnaffrights.block.entity.OffsetFreddyFazbearActiveTileEntity;

public class OffsetFreddyFazbearActiveBlockModel extends AnimatedGeoModel<OffsetFreddyFazbearActiveTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(OffsetFreddyFazbearActiveTileEntity animatable) {
		return new ResourceLocation("fnaf_frights", "animations/ofreddyfazbearshowtimeactive.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(OffsetFreddyFazbearActiveTileEntity animatable) {
		return new ResourceLocation("fnaf_frights", "geo/ofreddyfazbearshowtimeactive.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(OffsetFreddyFazbearActiveTileEntity entity) {
		return new ResourceLocation("fnaf_frights", "textures/blocks/freddyfazbeartexture.png");
	}
}
