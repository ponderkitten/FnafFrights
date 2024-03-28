package net.mcreator.fnaffrights.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnaffrights.block.entity.AFreddyFazbearActiveTileEntity;

public class AFreddyFazbearActiveBlockModel extends AnimatedGeoModel<AFreddyFazbearActiveTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(AFreddyFazbearActiveTileEntity animatable) {
		return new ResourceLocation("fnaf_frights", "animations/afreddyfazbearshowtimeactive.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(AFreddyFazbearActiveTileEntity animatable) {
		return new ResourceLocation("fnaf_frights", "geo/afreddyfazbearshowtimeactive.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(AFreddyFazbearActiveTileEntity entity) {
		return new ResourceLocation("fnaf_frights", "textures/blocks/freddyfazbeartexture.png");
	}
}
