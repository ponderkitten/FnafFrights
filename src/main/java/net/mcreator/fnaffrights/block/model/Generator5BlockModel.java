package net.mcreator.fnaffrights.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnaffrights.block.entity.Generator5TileEntity;

public class Generator5BlockModel extends AnimatedGeoModel<Generator5TileEntity> {
	@Override
	public ResourceLocation getAnimationResource(Generator5TileEntity animatable) {
		return new ResourceLocation("fnaf_frights", "animations/generator5.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(Generator5TileEntity animatable) {
		return new ResourceLocation("fnaf_frights", "geo/generator5.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(Generator5TileEntity entity) {
		return new ResourceLocation("fnaf_frights", "textures/blocks/genhighfuel.png");
	}
}
