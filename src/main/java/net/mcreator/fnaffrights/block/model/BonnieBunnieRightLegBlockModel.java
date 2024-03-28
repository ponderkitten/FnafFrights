package net.mcreator.fnaffrights.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnaffrights.block.entity.BonnieBunnieRightLegTileEntity;

public class BonnieBunnieRightLegBlockModel extends AnimatedGeoModel<BonnieBunnieRightLegTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(BonnieBunnieRightLegTileEntity animatable) {
		return new ResourceLocation("fnaf_frights", "animations/bonniebunnierightleg.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(BonnieBunnieRightLegTileEntity animatable) {
		return new ResourceLocation("fnaf_frights", "geo/bonniebunnierightleg.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(BonnieBunnieRightLegTileEntity entity) {
		return new ResourceLocation("fnaf_frights", "textures/blocks/bonnie_the_bunny.png");
	}
}
