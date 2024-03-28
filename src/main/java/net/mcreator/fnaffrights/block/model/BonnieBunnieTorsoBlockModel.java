package net.mcreator.fnaffrights.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnaffrights.block.entity.BonnieBunnieTorsoTileEntity;

public class BonnieBunnieTorsoBlockModel extends AnimatedGeoModel<BonnieBunnieTorsoTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(BonnieBunnieTorsoTileEntity animatable) {
		return new ResourceLocation("fnaf_frights", "animations/bonniebunnietorso.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(BonnieBunnieTorsoTileEntity animatable) {
		return new ResourceLocation("fnaf_frights", "geo/bonniebunnietorso.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(BonnieBunnieTorsoTileEntity entity) {
		return new ResourceLocation("fnaf_frights", "textures/blocks/bonnie_the_bunny.png");
	}
}
