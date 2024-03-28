package net.mcreator.fnaffrights.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnaffrights.block.entity.FoxyPirateTorsoTileEntity;

public class FoxyPirateTorsoBlockModel extends AnimatedGeoModel<FoxyPirateTorsoTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(FoxyPirateTorsoTileEntity animatable) {
		return new ResourceLocation("fnaf_frights", "animations/foxypiratetorso.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(FoxyPirateTorsoTileEntity animatable) {
		return new ResourceLocation("fnaf_frights", "geo/foxypiratetorso.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(FoxyPirateTorsoTileEntity entity) {
		return new ResourceLocation("fnaf_frights", "textures/blocks/fixedfoxy.png");
	}
}
