package net.mcreator.fnaffrights.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnaffrights.block.entity.Generator4TileEntity;

public class Generator4BlockModel extends AnimatedGeoModel<Generator4TileEntity> {
	@Override
	public ResourceLocation getAnimationResource(Generator4TileEntity animatable) {
		return new ResourceLocation("fnaf_frights", "animations/generator4.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(Generator4TileEntity animatable) {
		return new ResourceLocation("fnaf_frights", "geo/generator4.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(Generator4TileEntity entity) {
		return new ResourceLocation("fnaf_frights", "textures/blocks/genmedfuel.png");
	}
}
