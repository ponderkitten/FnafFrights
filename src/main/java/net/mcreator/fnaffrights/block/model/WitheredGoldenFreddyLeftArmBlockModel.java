package net.mcreator.fnaffrights.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnaffrights.block.entity.WitheredGoldenFreddyLeftArmTileEntity;

public class WitheredGoldenFreddyLeftArmBlockModel extends AnimatedGeoModel<WitheredGoldenFreddyLeftArmTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(WitheredGoldenFreddyLeftArmTileEntity animatable) {
		return new ResourceLocation("fnaf_frights", "animations/freddyleftarm.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(WitheredGoldenFreddyLeftArmTileEntity animatable) {
		return new ResourceLocation("fnaf_frights", "geo/freddyleftarm.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(WitheredGoldenFreddyLeftArmTileEntity entity) {
		return new ResourceLocation("fnaf_frights", "textures/blocks/witheredgoldenfreddytexture.png");
	}
}
