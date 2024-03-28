package net.mcreator.fnaffrights.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnaffrights.block.entity.ChicaHeadTileEntity;

public class ChicaHeadBlockModel extends AnimatedGeoModel<ChicaHeadTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(ChicaHeadTileEntity animatable) {
		return new ResourceLocation("fnaf_frights", "animations/chicahead.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(ChicaHeadTileEntity animatable) {
		return new ResourceLocation("fnaf_frights", "geo/chicahead.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(ChicaHeadTileEntity entity) {
		return new ResourceLocation("fnaf_frights", "textures/blocks/unwithered_chica.png");
	}
}
