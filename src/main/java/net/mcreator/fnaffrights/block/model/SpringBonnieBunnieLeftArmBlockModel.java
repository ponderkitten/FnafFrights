package net.mcreator.fnaffrights.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnaffrights.block.entity.SpringBonnieBunnieLeftArmTileEntity;

public class SpringBonnieBunnieLeftArmBlockModel extends AnimatedGeoModel<SpringBonnieBunnieLeftArmTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(SpringBonnieBunnieLeftArmTileEntity animatable) {
		return new ResourceLocation("fnaf_frights", "animations/bonniebunnieleftarm.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(SpringBonnieBunnieLeftArmTileEntity animatable) {
		return new ResourceLocation("fnaf_frights", "geo/bonniebunnieleftarm.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(SpringBonnieBunnieLeftArmTileEntity entity) {
		return new ResourceLocation("fnaf_frights", "textures/blocks/spring_bonnie_fnaf1.png");
	}
}
