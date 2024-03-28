package net.mcreator.fnaffrights.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnaffrights.block.entity.ToyChicaRightArmTileEntity;

public class ToyChicaRightArmBlockModel extends AnimatedGeoModel<ToyChicaRightArmTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(ToyChicaRightArmTileEntity animatable) {
		return new ResourceLocation("fnaf_frights", "animations/toychicarightarm.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(ToyChicaRightArmTileEntity animatable) {
		return new ResourceLocation("fnaf_frights", "geo/toychicarightarm.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(ToyChicaRightArmTileEntity entity) {
		return new ResourceLocation("fnaf_frights", "textures/blocks/toy_chica.png");
	}
}
