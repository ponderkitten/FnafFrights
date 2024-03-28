package net.mcreator.fnaffrights.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnaffrights.block.entity.Endo02ChicaHeadTileEntity;

public class Endo02ChicaHeadBlockModel extends AnimatedGeoModel<Endo02ChicaHeadTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(Endo02ChicaHeadTileEntity animatable) {
		return new ResourceLocation("fnaf_frights", "animations/endo02chica.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(Endo02ChicaHeadTileEntity animatable) {
		return new ResourceLocation("fnaf_frights", "geo/endo02chica.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(Endo02ChicaHeadTileEntity entity) {
		return new ResourceLocation("fnaf_frights", "textures/blocks/unwithered_chica.png");
	}
}
