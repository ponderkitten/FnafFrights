package net.mcreator.fnaffrights.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnaffrights.block.entity.Generator7TileEntity;

public class Generator7BlockModel extends AnimatedGeoModel<Generator7TileEntity> {
	@Override
	public ResourceLocation getAnimationResource(Generator7TileEntity animatable) {
		return new ResourceLocation("fnaf_frights", "animations/generator7.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(Generator7TileEntity animatable) {
		return new ResourceLocation("fnaf_frights", "geo/generator7.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(Generator7TileEntity entity) {
		return new ResourceLocation("fnaf_frights", "textures/blocks/genhighfuel.png");
	}
}
