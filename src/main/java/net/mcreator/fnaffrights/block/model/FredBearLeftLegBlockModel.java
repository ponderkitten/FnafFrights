package net.mcreator.fnaffrights.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnaffrights.block.entity.FredBearLeftLegTileEntity;

public class FredBearLeftLegBlockModel extends AnimatedGeoModel<FredBearLeftLegTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(FredBearLeftLegTileEntity animatable) {
		return new ResourceLocation("fnaf_frights", "animations/fredbearleftleg.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(FredBearLeftLegTileEntity animatable) {
		return new ResourceLocation("fnaf_frights", "geo/fredbearleftleg.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(FredBearLeftLegTileEntity entity) {
		return new ResourceLocation("fnaf_frights", "textures/blocks/fredbear4.png");
	}
}
