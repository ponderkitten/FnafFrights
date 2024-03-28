package net.mcreator.fnaffrights.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnaffrights.block.entity.WitheredFreddyHeadTileEntity;

public class WitheredFreddyHeadBlockModel extends AnimatedGeoModel<WitheredFreddyHeadTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(WitheredFreddyHeadTileEntity animatable) {
		return new ResourceLocation("fnaf_frights", "animations/freddyhead.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(WitheredFreddyHeadTileEntity animatable) {
		return new ResourceLocation("fnaf_frights", "geo/freddyhead.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(WitheredFreddyHeadTileEntity entity) {
		return new ResourceLocation("fnaf_frights", "textures/blocks/witheredfreddytexture.png");
	}
}
