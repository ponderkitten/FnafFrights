package net.mcreator.fnaffrights.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnaffrights.block.entity.AFredbearActiveTileEntity;

public class AFredbearActiveBlockModel extends AnimatedGeoModel<AFredbearActiveTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(AFredbearActiveTileEntity animatable) {
		return new ResourceLocation("fnaf_frights", "animations/afredbearshowtimeactive.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(AFredbearActiveTileEntity animatable) {
		return new ResourceLocation("fnaf_frights", "geo/afredbearshowtimeactive.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(AFredbearActiveTileEntity entity) {
		return new ResourceLocation("fnaf_frights", "textures/blocks/fredbear4.png");
	}
}
