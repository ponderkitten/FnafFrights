package net.mcreator.fnaffrights.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnaffrights.block.entity.YellowBearRightArmTileEntity;

public class YellowBearRightArmBlockModel extends AnimatedGeoModel<YellowBearRightArmTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(YellowBearRightArmTileEntity animatable) {
		return new ResourceLocation("fnaf_frights", "animations/freddyfazbearrightarm.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(YellowBearRightArmTileEntity animatable) {
		return new ResourceLocation("fnaf_frights", "geo/freddyfazbearrightarm.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(YellowBearRightArmTileEntity entity) {
		return new ResourceLocation("fnaf_frights", "textures/blocks/golden_freddy_normal_eyes.png");
	}
}
