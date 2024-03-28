package net.mcreator.fnaffrights.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnaffrights.block.entity.FredBearRightLegTileEntity;

public class FredBearRightLegBlockModel extends AnimatedGeoModel<FredBearRightLegTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(FredBearRightLegTileEntity animatable) {
		return new ResourceLocation("fnaf_frights", "animations/fredbearrightleg.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(FredBearRightLegTileEntity animatable) {
		return new ResourceLocation("fnaf_frights", "geo/fredbearrightleg.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(FredBearRightLegTileEntity entity) {
		return new ResourceLocation("fnaf_frights", "textures/blocks/fredbear4.png");
	}
}
