package net.mcreator.fnaffrights.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnaffrights.block.entity.FoxyRightArmTileEntity;

public class FoxyRightArmBlockModel extends AnimatedGeoModel<FoxyRightArmTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(FoxyRightArmTileEntity animatable) {
		return new ResourceLocation("fnaf_frights", "animations/foxyrightarm.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(FoxyRightArmTileEntity animatable) {
		return new ResourceLocation("fnaf_frights", "geo/foxyrightarm.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(FoxyRightArmTileEntity entity) {
		return new ResourceLocation("fnaf_frights", "textures/blocks/foxy_left_arm.png");
	}
}
