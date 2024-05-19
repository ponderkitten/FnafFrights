package net.mcreator.fnaffrights.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnaffrights.block.entity.ADinerFoxyActiveTileEntity;

public class ADinerFoxyActiveBlockModel extends AnimatedGeoModel<ADinerFoxyActiveTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(ADinerFoxyActiveTileEntity animatable) {
		return new ResourceLocation("fnaf_frights", "animations/ashowtimedinerfoxyactive.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(ADinerFoxyActiveTileEntity animatable) {
		return new ResourceLocation("fnaf_frights", "geo/ashowtimedinerfoxyactive.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(ADinerFoxyActiveTileEntity entity) {
		return new ResourceLocation("fnaf_frights", "textures/blocks/dinerfoxy.png");
	}
}
