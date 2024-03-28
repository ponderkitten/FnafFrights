package net.mcreator.fnaffrights.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnaffrights.block.entity.ChicaBlockTileEntity;

public class ChicaBlockBlockModel extends AnimatedGeoModel<ChicaBlockTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(ChicaBlockTileEntity animatable) {
		return new ResourceLocation("fnaf_frights", "animations/classicchicablock.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(ChicaBlockTileEntity animatable) {
		return new ResourceLocation("fnaf_frights", "geo/classicchicablock.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(ChicaBlockTileEntity entity) {
		return new ResourceLocation("fnaf_frights", "textures/blocks/unwithered_chica.png");
	}
}
