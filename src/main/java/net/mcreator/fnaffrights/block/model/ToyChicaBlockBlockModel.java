package net.mcreator.fnaffrights.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnaffrights.block.entity.ToyChicaBlockTileEntity;

public class ToyChicaBlockBlockModel extends AnimatedGeoModel<ToyChicaBlockTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(ToyChicaBlockTileEntity animatable) {
		return new ResourceLocation("fnaf_frights", "animations/toychicablock.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(ToyChicaBlockTileEntity animatable) {
		return new ResourceLocation("fnaf_frights", "geo/toychicablock.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(ToyChicaBlockTileEntity entity) {
		return new ResourceLocation("fnaf_frights", "textures/blocks/toy_chica.png");
	}
}
