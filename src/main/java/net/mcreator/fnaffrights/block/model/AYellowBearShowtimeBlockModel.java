package net.mcreator.fnaffrights.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnaffrights.block.entity.AYellowBearShowtimeTileEntity;

public class AYellowBearShowtimeBlockModel extends AnimatedGeoModel<AYellowBearShowtimeTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(AYellowBearShowtimeTileEntity animatable) {
		return new ResourceLocation("fnaf_frights", "animations/afreddyfazbearshowtime.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(AYellowBearShowtimeTileEntity animatable) {
		return new ResourceLocation("fnaf_frights", "geo/afreddyfazbearshowtime.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(AYellowBearShowtimeTileEntity entity) {
		return new ResourceLocation("fnaf_frights", "textures/blocks/golden_freddy_normal_eyes.png");
	}
}
