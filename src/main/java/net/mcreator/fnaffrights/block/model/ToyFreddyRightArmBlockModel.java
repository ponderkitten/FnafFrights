package net.mcreator.fnaffrights.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnaffrights.block.entity.ToyFreddyRightArmTileEntity;

public class ToyFreddyRightArmBlockModel extends AnimatedGeoModel<ToyFreddyRightArmTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(ToyFreddyRightArmTileEntity animatable) {
		return new ResourceLocation("fnaf_frights", "animations/toyfreddyrightarm.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(ToyFreddyRightArmTileEntity animatable) {
		return new ResourceLocation("fnaf_frights", "geo/toyfreddyrightarm.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(ToyFreddyRightArmTileEntity entity) {
		return new ResourceLocation("fnaf_frights", "textures/blocks/toy_freddy.png");
	}
}
