package net.mcreator.fnaffrights.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnaffrights.block.entity.UnBonnieShowtimeActiveTileEntity;

public class UnBonnieShowtimeActiveBlockModel extends AnimatedGeoModel<UnBonnieShowtimeActiveTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(UnBonnieShowtimeActiveTileEntity animatable) {
		return new ResourceLocation("fnaf_frights", "animations/bonnieshowtimeactive.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(UnBonnieShowtimeActiveTileEntity animatable) {
		return new ResourceLocation("fnaf_frights", "geo/bonnieshowtimeactive.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(UnBonnieShowtimeActiveTileEntity entity) {
		return new ResourceLocation("fnaf_frights", "textures/blocks/unbonnie.png");
	}
}
