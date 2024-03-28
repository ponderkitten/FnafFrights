package net.mcreator.fnaffrights.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnaffrights.block.entity.ToyChicaRightLegTileEntity;

public class ToyChicaRightLegBlockModel extends AnimatedGeoModel<ToyChicaRightLegTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(ToyChicaRightLegTileEntity animatable) {
		return new ResourceLocation("fnaf_frights", "animations/toychicarightleg.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(ToyChicaRightLegTileEntity animatable) {
		return new ResourceLocation("fnaf_frights", "geo/toychicarightleg.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(ToyChicaRightLegTileEntity entity) {
		return new ResourceLocation("fnaf_frights", "textures/blocks/toy_chica.png");
	}
}
