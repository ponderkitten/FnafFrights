package net.mcreator.fnaffrights.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnaffrights.block.entity.Generator6TileEntity;

public class Generator6BlockModel extends AnimatedGeoModel<Generator6TileEntity> {
	@Override
	public ResourceLocation getAnimationResource(Generator6TileEntity animatable) {
		return new ResourceLocation("fnaf_frights", "animations/generator6.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(Generator6TileEntity animatable) {
		return new ResourceLocation("fnaf_frights", "geo/generator6.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(Generator6TileEntity entity) {
		return new ResourceLocation("fnaf_frights", "textures/blocks/genhighfuel.png");
	}
}
