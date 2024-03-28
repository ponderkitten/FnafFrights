package net.mcreator.fnaffrights.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnaffrights.block.entity.WitheredFreddyRightArmTileEntity;

public class WitheredFreddyRightArmBlockModel extends AnimatedGeoModel<WitheredFreddyRightArmTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(WitheredFreddyRightArmTileEntity animatable) {
		return new ResourceLocation("fnaf_frights", "animations/freddyrightarm.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(WitheredFreddyRightArmTileEntity animatable) {
		return new ResourceLocation("fnaf_frights", "geo/freddyrightarm.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(WitheredFreddyRightArmTileEntity entity) {
		return new ResourceLocation("fnaf_frights", "textures/blocks/witheredfreddytexture.png");
	}
}
