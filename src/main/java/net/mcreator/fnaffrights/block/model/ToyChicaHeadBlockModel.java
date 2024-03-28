package net.mcreator.fnaffrights.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnaffrights.block.entity.ToyChicaHeadTileEntity;

public class ToyChicaHeadBlockModel extends AnimatedGeoModel<ToyChicaHeadTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(ToyChicaHeadTileEntity animatable) {
		return new ResourceLocation("fnaf_frights", "animations/toychicahead.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(ToyChicaHeadTileEntity animatable) {
		return new ResourceLocation("fnaf_frights", "geo/toychicahead.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(ToyChicaHeadTileEntity entity) {
		return new ResourceLocation("fnaf_frights", "textures/blocks/toy_chica.png");
	}
}
