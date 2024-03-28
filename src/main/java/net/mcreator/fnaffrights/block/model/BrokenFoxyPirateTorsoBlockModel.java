package net.mcreator.fnaffrights.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnaffrights.block.entity.BrokenFoxyPirateTorsoTileEntity;

public class BrokenFoxyPirateTorsoBlockModel extends AnimatedGeoModel<BrokenFoxyPirateTorsoTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(BrokenFoxyPirateTorsoTileEntity animatable) {
		return new ResourceLocation("fnaf_frights", "animations/foxypiratetorso.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(BrokenFoxyPirateTorsoTileEntity animatable) {
		return new ResourceLocation("fnaf_frights", "geo/foxypiratetorso.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(BrokenFoxyPirateTorsoTileEntity entity) {
		return new ResourceLocation("fnaf_frights", "textures/blocks/foxy.png");
	}
}
