package net.mcreator.fnaffrights.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnaffrights.block.entity.AYellowBearActiveTileEntity;

public class AYellowBearActiveBlockModel extends AnimatedGeoModel<AYellowBearActiveTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(AYellowBearActiveTileEntity animatable) {
		return new ResourceLocation("fnaf_frights", "animations/afreddyfazbearshowtimeactive.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(AYellowBearActiveTileEntity animatable) {
		return new ResourceLocation("fnaf_frights", "geo/afreddyfazbearshowtimeactive.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(AYellowBearActiveTileEntity entity) {
		return new ResourceLocation("fnaf_frights", "textures/blocks/golden_freddy_normal_eyes.png");
	}
}
