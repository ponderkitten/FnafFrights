package net.mcreator.fnaffrights.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnaffrights.block.entity.WitheredFoxyHeadTileEntity;

public class WitheredFoxyHeadBlockModel extends AnimatedGeoModel<WitheredFoxyHeadTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(WitheredFoxyHeadTileEntity animatable) {
		return new ResourceLocation("fnaf_frights", "animations/foxy_head.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(WitheredFoxyHeadTileEntity animatable) {
		return new ResourceLocation("fnaf_frights", "geo/foxy_head.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(WitheredFoxyHeadTileEntity entity) {
		return new ResourceLocation("fnaf_frights", "textures/blocks/witheredfoxytexture.png");
	}
}
