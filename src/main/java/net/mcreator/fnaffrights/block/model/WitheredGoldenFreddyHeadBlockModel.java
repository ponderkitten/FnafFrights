package net.mcreator.fnaffrights.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnaffrights.block.entity.WitheredGoldenFreddyHeadTileEntity;

public class WitheredGoldenFreddyHeadBlockModel extends AnimatedGeoModel<WitheredGoldenFreddyHeadTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(WitheredGoldenFreddyHeadTileEntity animatable) {
		return new ResourceLocation("fnaf_frights", "animations/freddyhead.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(WitheredGoldenFreddyHeadTileEntity animatable) {
		return new ResourceLocation("fnaf_frights", "geo/freddyhead.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(WitheredGoldenFreddyHeadTileEntity entity) {
		return new ResourceLocation("fnaf_frights", "textures/blocks/witheredgoldenfreddytexture.png");
	}
}
