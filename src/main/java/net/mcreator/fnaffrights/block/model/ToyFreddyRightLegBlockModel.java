package net.mcreator.fnaffrights.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnaffrights.block.entity.ToyFreddyRightLegTileEntity;

public class ToyFreddyRightLegBlockModel extends AnimatedGeoModel<ToyFreddyRightLegTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(ToyFreddyRightLegTileEntity animatable) {
		return new ResourceLocation("fnaf_frights", "animations/toyfreddyrightleg.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(ToyFreddyRightLegTileEntity animatable) {
		return new ResourceLocation("fnaf_frights", "geo/toyfreddyrightleg.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(ToyFreddyRightLegTileEntity entity) {
		return new ResourceLocation("fnaf_frights", "textures/blocks/toy_freddy.png");
	}
}
