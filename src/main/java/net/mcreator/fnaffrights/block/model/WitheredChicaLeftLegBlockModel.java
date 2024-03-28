package net.mcreator.fnaffrights.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnaffrights.block.entity.WitheredChicaLeftLegTileEntity;

public class WitheredChicaLeftLegBlockModel extends AnimatedGeoModel<WitheredChicaLeftLegTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(WitheredChicaLeftLegTileEntity animatable) {
		return new ResourceLocation("fnaf_frights", "animations/witheredchicaleftleg.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(WitheredChicaLeftLegTileEntity animatable) {
		return new ResourceLocation("fnaf_frights", "geo/witheredchicaleftleg.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(WitheredChicaLeftLegTileEntity entity) {
		return new ResourceLocation("fnaf_frights", "textures/blocks/witheredchicatexture.png");
	}
}
