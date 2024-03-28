package net.mcreator.fnaffrights.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnaffrights.block.entity.FredBearRightArmTileEntity;

public class FredBearRightArmBlockModel extends AnimatedGeoModel<FredBearRightArmTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(FredBearRightArmTileEntity animatable) {
		return new ResourceLocation("fnaf_frights", "animations/fredbearrightarm.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(FredBearRightArmTileEntity animatable) {
		return new ResourceLocation("fnaf_frights", "geo/fredbearrightarm.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(FredBearRightArmTileEntity entity) {
		return new ResourceLocation("fnaf_frights", "textures/blocks/fredbear4.png");
	}
}
