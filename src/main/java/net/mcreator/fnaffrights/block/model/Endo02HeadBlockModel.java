package net.mcreator.fnaffrights.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnaffrights.block.entity.Endo02HeadTileEntity;

public class Endo02HeadBlockModel extends AnimatedGeoModel<Endo02HeadTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(Endo02HeadTileEntity animatable) {
		return new ResourceLocation("fnaf_frights", "animations/freddyhead.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(Endo02HeadTileEntity animatable) {
		return new ResourceLocation("fnaf_frights", "geo/freddyhead.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(Endo02HeadTileEntity entity) {
		return new ResourceLocation("fnaf_frights", "textures/blocks/endo02.png");
	}
}
