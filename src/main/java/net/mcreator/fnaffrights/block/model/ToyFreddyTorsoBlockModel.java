package net.mcreator.fnaffrights.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnaffrights.block.entity.ToyFreddyTorsoTileEntity;

public class ToyFreddyTorsoBlockModel extends AnimatedGeoModel<ToyFreddyTorsoTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(ToyFreddyTorsoTileEntity animatable) {
		return new ResourceLocation("fnaf_frights", "animations/toyfreddytorso.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(ToyFreddyTorsoTileEntity animatable) {
		return new ResourceLocation("fnaf_frights", "geo/toyfreddytorso.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(ToyFreddyTorsoTileEntity entity) {
		return new ResourceLocation("fnaf_frights", "textures/blocks/toy_freddy.png");
	}
}
