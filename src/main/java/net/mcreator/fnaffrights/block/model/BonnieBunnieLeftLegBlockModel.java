package net.mcreator.fnaffrights.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnaffrights.block.entity.BonnieBunnieLeftLegTileEntity;

public class BonnieBunnieLeftLegBlockModel extends AnimatedGeoModel<BonnieBunnieLeftLegTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(BonnieBunnieLeftLegTileEntity animatable) {
		return new ResourceLocation("fnaf_frights", "animations/bonniebunnieleftleg.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(BonnieBunnieLeftLegTileEntity animatable) {
		return new ResourceLocation("fnaf_frights", "geo/bonniebunnieleftleg.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(BonnieBunnieLeftLegTileEntity entity) {
		return new ResourceLocation("fnaf_frights", "textures/blocks/bonnie_the_bunny.png");
	}
}
