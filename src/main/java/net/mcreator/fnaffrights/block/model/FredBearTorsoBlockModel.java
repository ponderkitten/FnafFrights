package net.mcreator.fnaffrights.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnaffrights.block.entity.FredBearTorsoTileEntity;

public class FredBearTorsoBlockModel extends AnimatedGeoModel<FredBearTorsoTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(FredBearTorsoTileEntity animatable) {
		return new ResourceLocation("fnaf_frights", "animations/fredbeartorso.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(FredBearTorsoTileEntity animatable) {
		return new ResourceLocation("fnaf_frights", "geo/fredbeartorso.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(FredBearTorsoTileEntity entity) {
		return new ResourceLocation("fnaf_frights", "textures/blocks/fredbear4.png");
	}
}
