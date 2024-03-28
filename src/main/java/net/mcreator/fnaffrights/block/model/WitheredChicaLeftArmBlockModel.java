package net.mcreator.fnaffrights.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnaffrights.block.entity.WitheredChicaLeftArmTileEntity;

public class WitheredChicaLeftArmBlockModel extends AnimatedGeoModel<WitheredChicaLeftArmTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(WitheredChicaLeftArmTileEntity animatable) {
		return new ResourceLocation("fnaf_frights", "animations/witheredchicaleftarm.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(WitheredChicaLeftArmTileEntity animatable) {
		return new ResourceLocation("fnaf_frights", "geo/witheredchicaleftarm.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(WitheredChicaLeftArmTileEntity entity) {
		return new ResourceLocation("fnaf_frights", "textures/blocks/witheredchicatexture.png");
	}
}
