package net.mcreator.fnaffrights.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnaffrights.block.entity.ChicaLeftLegTileEntity;

public class ChicaLeftLegBlockModel extends AnimatedGeoModel<ChicaLeftLegTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(ChicaLeftLegTileEntity animatable) {
		return new ResourceLocation("fnaf_frights", "animations/chicaleftleg.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(ChicaLeftLegTileEntity animatable) {
		return new ResourceLocation("fnaf_frights", "geo/chicaleftleg.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(ChicaLeftLegTileEntity entity) {
		return new ResourceLocation("fnaf_frights", "textures/blocks/unwithered_chica.png");
	}
}
