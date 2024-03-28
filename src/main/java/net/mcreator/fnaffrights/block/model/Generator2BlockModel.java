package net.mcreator.fnaffrights.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnaffrights.block.entity.Generator2TileEntity;

public class Generator2BlockModel extends AnimatedGeoModel<Generator2TileEntity> {
	@Override
	public ResourceLocation getAnimationResource(Generator2TileEntity animatable) {
		return new ResourceLocation("fnaf_frights", "animations/generator2.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(Generator2TileEntity animatable) {
		return new ResourceLocation("fnaf_frights", "geo/generator2.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(Generator2TileEntity entity) {
		return new ResourceLocation("fnaf_frights", "textures/blocks/genlowfuel.png");
	}
}
