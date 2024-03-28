package net.mcreator.fnaffrights.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnaffrights.block.entity.Generator8TileEntity;

public class Generator8BlockModel extends AnimatedGeoModel<Generator8TileEntity> {
	@Override
	public ResourceLocation getAnimationResource(Generator8TileEntity animatable) {
		return new ResourceLocation("fnaf_frights", "animations/generator8.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(Generator8TileEntity animatable) {
		return new ResourceLocation("fnaf_frights", "geo/generator8.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(Generator8TileEntity entity) {
		return new ResourceLocation("fnaf_frights", "textures/blocks/genhighfuel.png");
	}
}
