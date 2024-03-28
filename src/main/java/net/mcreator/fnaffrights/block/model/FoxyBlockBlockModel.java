package net.mcreator.fnaffrights.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnaffrights.block.entity.FoxyBlockTileEntity;

public class FoxyBlockBlockModel extends AnimatedGeoModel<FoxyBlockTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(FoxyBlockTileEntity animatable) {
		return new ResourceLocation("fnaf_frights", "animations/witheredfoxyblock.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(FoxyBlockTileEntity animatable) {
		return new ResourceLocation("fnaf_frights", "geo/witheredfoxyblock.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(FoxyBlockTileEntity entity) {
		return new ResourceLocation("fnaf_frights", "textures/blocks/unwithered_foxy.png");
	}
}
