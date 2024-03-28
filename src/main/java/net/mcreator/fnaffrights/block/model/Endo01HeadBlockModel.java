package net.mcreator.fnaffrights.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnaffrights.block.entity.Endo01HeadTileEntity;

public class Endo01HeadBlockModel extends AnimatedGeoModel<Endo01HeadTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(Endo01HeadTileEntity animatable) {
		return new ResourceLocation("fnaf_frights", "animations/endo01head.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(Endo01HeadTileEntity animatable) {
		return new ResourceLocation("fnaf_frights", "geo/endo01head.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(Endo01HeadTileEntity entity) {
		return new ResourceLocation("fnaf_frights", "textures/blocks/endo01.png");
	}
}
