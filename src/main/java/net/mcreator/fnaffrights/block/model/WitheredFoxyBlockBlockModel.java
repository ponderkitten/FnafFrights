package net.mcreator.fnaffrights.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnaffrights.block.entity.WitheredFoxyBlockTileEntity;

public class WitheredFoxyBlockBlockModel extends AnimatedGeoModel<WitheredFoxyBlockTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(WitheredFoxyBlockTileEntity animatable) {
		return new ResourceLocation("fnaf_frights", "animations/witheredfoxyblock.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(WitheredFoxyBlockTileEntity animatable) {
		return new ResourceLocation("fnaf_frights", "geo/witheredfoxyblock.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(WitheredFoxyBlockTileEntity entity) {
		return new ResourceLocation("fnaf_frights", "textures/blocks/witheredfoxytexture.png");
	}
}
