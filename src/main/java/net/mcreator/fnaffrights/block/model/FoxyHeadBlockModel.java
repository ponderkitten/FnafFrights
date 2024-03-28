package net.mcreator.fnaffrights.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnaffrights.block.entity.FoxyHeadTileEntity;

public class FoxyHeadBlockModel extends AnimatedGeoModel<FoxyHeadTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(FoxyHeadTileEntity animatable) {
		return new ResourceLocation("fnaf_frights", "animations/foxy_head.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(FoxyHeadTileEntity animatable) {
		return new ResourceLocation("fnaf_frights", "geo/foxy_head.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(FoxyHeadTileEntity entity) {
		return new ResourceLocation("fnaf_frights", "textures/blocks/unwithered_foxy.png");
	}
}
