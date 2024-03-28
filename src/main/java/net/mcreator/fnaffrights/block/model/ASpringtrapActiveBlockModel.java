package net.mcreator.fnaffrights.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnaffrights.block.entity.ASpringtrapActiveTileEntity;

public class ASpringtrapActiveBlockModel extends AnimatedGeoModel<ASpringtrapActiveTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(ASpringtrapActiveTileEntity animatable) {
		return new ResourceLocation("fnaf_frights", "animations/aspringtrapshowtimeactive.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(ASpringtrapActiveTileEntity animatable) {
		return new ResourceLocation("fnaf_frights", "geo/aspringtrapshowtimeactive.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(ASpringtrapActiveTileEntity entity) {
		return new ResourceLocation("fnaf_frights", "textures/blocks/springtrapsuffer.png");
	}
}
