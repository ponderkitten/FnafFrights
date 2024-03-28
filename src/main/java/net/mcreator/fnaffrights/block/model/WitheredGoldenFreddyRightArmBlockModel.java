package net.mcreator.fnaffrights.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnaffrights.block.entity.WitheredGoldenFreddyRightArmTileEntity;

public class WitheredGoldenFreddyRightArmBlockModel extends AnimatedGeoModel<WitheredGoldenFreddyRightArmTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(WitheredGoldenFreddyRightArmTileEntity animatable) {
		return new ResourceLocation("fnaf_frights", "animations/freddyrightarm.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(WitheredGoldenFreddyRightArmTileEntity animatable) {
		return new ResourceLocation("fnaf_frights", "geo/freddyrightarm.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(WitheredGoldenFreddyRightArmTileEntity entity) {
		return new ResourceLocation("fnaf_frights", "textures/blocks/witheredgoldenfreddytexture.png");
	}
}
