package net.mcreator.fnaffrights.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnaffrights.block.entity.WitheredChicaBlockTileEntity;

public class WitheredChicaBlockBlockModel extends AnimatedGeoModel<WitheredChicaBlockTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(WitheredChicaBlockTileEntity animatable) {
		return new ResourceLocation("fnaf_frights", "animations/witheredchicablock.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(WitheredChicaBlockTileEntity animatable) {
		return new ResourceLocation("fnaf_frights", "geo/witheredchicablock.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(WitheredChicaBlockTileEntity entity) {
		return new ResourceLocation("fnaf_frights", "textures/blocks/witheredchicatexture.png");
	}
}
