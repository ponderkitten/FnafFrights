package net.mcreator.fnaffrights.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnaffrights.block.entity.YellowBearLeftLegTileEntity;

public class YellowBearLeftLegBlockModel extends AnimatedGeoModel<YellowBearLeftLegTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(YellowBearLeftLegTileEntity animatable) {
		return new ResourceLocation("fnaf_frights", "animations/freddyfazbearleftleg.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(YellowBearLeftLegTileEntity animatable) {
		return new ResourceLocation("fnaf_frights", "geo/freddyfazbearleftleg.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(YellowBearLeftLegTileEntity entity) {
		return new ResourceLocation("fnaf_frights", "textures/blocks/golden_freddy_normal_eyes.png");
	}
}
