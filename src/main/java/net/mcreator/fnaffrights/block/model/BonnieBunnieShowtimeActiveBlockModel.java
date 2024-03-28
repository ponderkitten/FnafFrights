package net.mcreator.fnaffrights.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnaffrights.block.entity.BonnieBunnieShowtimeActiveTileEntity;

public class BonnieBunnieShowtimeActiveBlockModel extends AnimatedGeoModel<BonnieBunnieShowtimeActiveTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(BonnieBunnieShowtimeActiveTileEntity animatable) {
		return new ResourceLocation("fnaf_frights", "animations/bonniebunnieshowtimeactive.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(BonnieBunnieShowtimeActiveTileEntity animatable) {
		return new ResourceLocation("fnaf_frights", "geo/bonniebunnieshowtimeactive.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(BonnieBunnieShowtimeActiveTileEntity entity) {
		return new ResourceLocation("fnaf_frights", "textures/blocks/bonnie_the_bunny.png");
	}
}
