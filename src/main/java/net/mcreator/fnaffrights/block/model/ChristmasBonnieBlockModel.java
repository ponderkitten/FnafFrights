package net.mcreator.fnaffrights.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnaffrights.block.entity.ChristmasBonnieTileEntity;

public class ChristmasBonnieBlockModel extends AnimatedGeoModel<ChristmasBonnieTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(ChristmasBonnieTileEntity animatable) {
		return new ResourceLocation("fnaf_frights", "animations/christmasbonnieshowtime.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(ChristmasBonnieTileEntity animatable) {
		return new ResourceLocation("fnaf_frights", "geo/christmasbonnieshowtime.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(ChristmasBonnieTileEntity entity) {
		return new ResourceLocation("fnaf_frights", "textures/blocks/christmasbonnieflat.png");
	}
}
