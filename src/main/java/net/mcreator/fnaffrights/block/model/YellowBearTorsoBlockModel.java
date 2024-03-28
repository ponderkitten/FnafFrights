package net.mcreator.fnaffrights.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnaffrights.block.entity.YellowBearTorsoTileEntity;

public class YellowBearTorsoBlockModel extends AnimatedGeoModel<YellowBearTorsoTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(YellowBearTorsoTileEntity animatable) {
		return new ResourceLocation("fnaf_frights", "animations/freddyfazbeartorso.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(YellowBearTorsoTileEntity animatable) {
		return new ResourceLocation("fnaf_frights", "geo/freddyfazbeartorso.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(YellowBearTorsoTileEntity entity) {
		return new ResourceLocation("fnaf_frights", "textures/blocks/golden_freddy_normal_eyes.png");
	}
}
