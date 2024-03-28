package net.mcreator.fnaffrights.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnaffrights.block.entity.ToyChicaLeftArmTileEntity;

public class ToyChicaLeftArmBlockModel extends AnimatedGeoModel<ToyChicaLeftArmTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(ToyChicaLeftArmTileEntity animatable) {
		return new ResourceLocation("fnaf_frights", "animations/toychicaleftarm.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(ToyChicaLeftArmTileEntity animatable) {
		return new ResourceLocation("fnaf_frights", "geo/toychicaleftarm.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(ToyChicaLeftArmTileEntity entity) {
		return new ResourceLocation("fnaf_frights", "textures/blocks/toy_chica.png");
	}
}
