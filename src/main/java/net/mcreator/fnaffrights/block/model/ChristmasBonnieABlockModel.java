package net.mcreator.fnaffrights.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnaffrights.block.entity.ChristmasBonnieATileEntity;

public class ChristmasBonnieABlockModel extends AnimatedGeoModel<ChristmasBonnieATileEntity> {
	@Override
	public ResourceLocation getAnimationResource(ChristmasBonnieATileEntity animatable) {
		return new ResourceLocation("fnaf_frights", "animations/christmasbonnieactive.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(ChristmasBonnieATileEntity animatable) {
		return new ResourceLocation("fnaf_frights", "geo/christmasbonnieactive.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(ChristmasBonnieATileEntity entity) {
		return new ResourceLocation("fnaf_frights", "textures/blocks/christmasbonnieflat.png");
	}
}
