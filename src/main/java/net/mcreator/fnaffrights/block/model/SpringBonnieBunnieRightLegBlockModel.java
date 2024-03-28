package net.mcreator.fnaffrights.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnaffrights.block.entity.SpringBonnieBunnieRightLegTileEntity;

public class SpringBonnieBunnieRightLegBlockModel extends AnimatedGeoModel<SpringBonnieBunnieRightLegTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(SpringBonnieBunnieRightLegTileEntity animatable) {
		return new ResourceLocation("fnaf_frights", "animations/bonniebunnierightleg.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(SpringBonnieBunnieRightLegTileEntity animatable) {
		return new ResourceLocation("fnaf_frights", "geo/bonniebunnierightleg.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(SpringBonnieBunnieRightLegTileEntity entity) {
		return new ResourceLocation("fnaf_frights", "textures/blocks/spring_bonnie_fnaf1.png");
	}
}
