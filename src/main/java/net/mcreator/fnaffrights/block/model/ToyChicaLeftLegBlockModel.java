package net.mcreator.fnaffrights.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnaffrights.block.entity.ToyChicaLeftLegTileEntity;

public class ToyChicaLeftLegBlockModel extends AnimatedGeoModel<ToyChicaLeftLegTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(ToyChicaLeftLegTileEntity animatable) {
		return new ResourceLocation("fnaf_frights", "animations/toychicaleftleg.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(ToyChicaLeftLegTileEntity animatable) {
		return new ResourceLocation("fnaf_frights", "geo/toychicaleftleg.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(ToyChicaLeftLegTileEntity entity) {
		return new ResourceLocation("fnaf_frights", "textures/blocks/toy_chica.png");
	}
}
