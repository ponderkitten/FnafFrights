package net.mcreator.fnaffrights.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnaffrights.block.entity.ToyFreddyLeftLegTileEntity;

public class ToyFreddyLeftLegBlockModel extends AnimatedGeoModel<ToyFreddyLeftLegTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(ToyFreddyLeftLegTileEntity animatable) {
		return new ResourceLocation("fnaf_frights", "animations/toyfreddyleftleg.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(ToyFreddyLeftLegTileEntity animatable) {
		return new ResourceLocation("fnaf_frights", "geo/toyfreddyleftleg.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(ToyFreddyLeftLegTileEntity entity) {
		return new ResourceLocation("fnaf_frights", "textures/blocks/toy_freddy.png");
	}
}
