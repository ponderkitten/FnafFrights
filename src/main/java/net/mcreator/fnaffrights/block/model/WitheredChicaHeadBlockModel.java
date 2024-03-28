package net.mcreator.fnaffrights.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnaffrights.block.entity.WitheredChicaHeadTileEntity;

public class WitheredChicaHeadBlockModel extends AnimatedGeoModel<WitheredChicaHeadTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(WitheredChicaHeadTileEntity animatable) {
		return new ResourceLocation("fnaf_frights", "animations/witheredchicahead.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(WitheredChicaHeadTileEntity animatable) {
		return new ResourceLocation("fnaf_frights", "geo/witheredchicahead.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(WitheredChicaHeadTileEntity entity) {
		return new ResourceLocation("fnaf_frights", "textures/blocks/witheredchicatexture.png");
	}
}
