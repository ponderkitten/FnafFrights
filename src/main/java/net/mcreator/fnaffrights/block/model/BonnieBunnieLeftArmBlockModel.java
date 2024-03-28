package net.mcreator.fnaffrights.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnaffrights.block.entity.BonnieBunnieLeftArmTileEntity;

public class BonnieBunnieLeftArmBlockModel extends AnimatedGeoModel<BonnieBunnieLeftArmTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(BonnieBunnieLeftArmTileEntity animatable) {
		return new ResourceLocation("fnaf_frights", "animations/bonniebunnieleftarm.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(BonnieBunnieLeftArmTileEntity animatable) {
		return new ResourceLocation("fnaf_frights", "geo/bonniebunnieleftarm.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(BonnieBunnieLeftArmTileEntity entity) {
		return new ResourceLocation("fnaf_frights", "textures/blocks/bonnie_the_bunny.png");
	}
}
