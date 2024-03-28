package net.mcreator.fnaffrights.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnaffrights.block.entity.SpringBonnieBunnieShowtimeActiveTileEntity;

public class SpringBonnieBunnieShowtimeActiveBlockModel extends AnimatedGeoModel<SpringBonnieBunnieShowtimeActiveTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(SpringBonnieBunnieShowtimeActiveTileEntity animatable) {
		return new ResourceLocation("fnaf_frights", "animations/bonniebunnieshowtimeactive.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(SpringBonnieBunnieShowtimeActiveTileEntity animatable) {
		return new ResourceLocation("fnaf_frights", "geo/bonniebunnieshowtimeactive.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(SpringBonnieBunnieShowtimeActiveTileEntity entity) {
		return new ResourceLocation("fnaf_frights", "textures/blocks/spring_bonnie_fnaf1.png");
	}
}
