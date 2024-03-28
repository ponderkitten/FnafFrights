package net.mcreator.fnaffrights.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnaffrights.block.entity.YellowBearRightLegTileEntity;

public class YellowBearRightLegBlockModel extends AnimatedGeoModel<YellowBearRightLegTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(YellowBearRightLegTileEntity animatable) {
		return new ResourceLocation("fnaf_frights", "animations/freddyfazbearrightleg.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(YellowBearRightLegTileEntity animatable) {
		return new ResourceLocation("fnaf_frights", "geo/freddyfazbearrightleg.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(YellowBearRightLegTileEntity entity) {
		return new ResourceLocation("fnaf_frights", "textures/blocks/golden_freddy_normal_eyes.png");
	}
}
