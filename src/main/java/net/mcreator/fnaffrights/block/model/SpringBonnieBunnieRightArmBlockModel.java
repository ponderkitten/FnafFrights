package net.mcreator.fnaffrights.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnaffrights.block.entity.SpringBonnieBunnieRightArmTileEntity;

public class SpringBonnieBunnieRightArmBlockModel extends AnimatedGeoModel<SpringBonnieBunnieRightArmTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(SpringBonnieBunnieRightArmTileEntity animatable) {
		return new ResourceLocation("fnaf_frights", "animations/bonniebunnierightarm.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(SpringBonnieBunnieRightArmTileEntity animatable) {
		return new ResourceLocation("fnaf_frights", "geo/bonniebunnierightarm.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(SpringBonnieBunnieRightArmTileEntity entity) {
		return new ResourceLocation("fnaf_frights", "textures/blocks/spring_bonnie_fnaf1.png");
	}
}
