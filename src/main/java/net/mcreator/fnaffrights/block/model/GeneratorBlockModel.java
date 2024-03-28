package net.mcreator.fnaffrights.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnaffrights.block.entity.GeneratorTileEntity;

public class GeneratorBlockModel extends AnimatedGeoModel<GeneratorTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(GeneratorTileEntity animatable) {
		return new ResourceLocation("fnaf_frights", "animations/generator.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(GeneratorTileEntity animatable) {
		return new ResourceLocation("fnaf_frights", "geo/generator.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(GeneratorTileEntity entity) {
		return new ResourceLocation("fnaf_frights", "textures/blocks/generator.png");
	}
}
