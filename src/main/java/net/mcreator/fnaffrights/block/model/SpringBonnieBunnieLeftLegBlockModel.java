package net.mcreator.fnaffrights.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnaffrights.block.entity.SpringBonnieBunnieLeftLegTileEntity;

public class SpringBonnieBunnieLeftLegBlockModel extends AnimatedGeoModel<SpringBonnieBunnieLeftLegTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(SpringBonnieBunnieLeftLegTileEntity animatable) {
		return new ResourceLocation("fnaf_frights", "animations/bonniebunnieleftleg.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(SpringBonnieBunnieLeftLegTileEntity animatable) {
		return new ResourceLocation("fnaf_frights", "geo/bonniebunnieleftleg.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(SpringBonnieBunnieLeftLegTileEntity entity) {
		return new ResourceLocation("fnaf_frights", "textures/blocks/spring_bonnie_fnaf1.png");
	}
}
