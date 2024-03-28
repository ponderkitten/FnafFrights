package net.mcreator.fnaffrights.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnaffrights.block.entity.WitheredFreddyLeftArmTileEntity;

public class WitheredFreddyLeftArmBlockModel extends AnimatedGeoModel<WitheredFreddyLeftArmTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(WitheredFreddyLeftArmTileEntity animatable) {
		return new ResourceLocation("fnaf_frights", "animations/freddyleftarm.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(WitheredFreddyLeftArmTileEntity animatable) {
		return new ResourceLocation("fnaf_frights", "geo/freddyleftarm.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(WitheredFreddyLeftArmTileEntity entity) {
		return new ResourceLocation("fnaf_frights", "textures/blocks/witheredfreddytexture.png");
	}
}
