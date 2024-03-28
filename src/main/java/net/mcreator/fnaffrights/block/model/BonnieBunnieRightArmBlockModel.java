package net.mcreator.fnaffrights.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnaffrights.block.entity.BonnieBunnieRightArmTileEntity;

public class BonnieBunnieRightArmBlockModel extends AnimatedGeoModel<BonnieBunnieRightArmTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(BonnieBunnieRightArmTileEntity animatable) {
		return new ResourceLocation("fnaf_frights", "animations/bonniebunnierightarm.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(BonnieBunnieRightArmTileEntity animatable) {
		return new ResourceLocation("fnaf_frights", "geo/bonniebunnierightarm.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(BonnieBunnieRightArmTileEntity entity) {
		return new ResourceLocation("fnaf_frights", "textures/blocks/bonnie_the_bunny.png");
	}
}
