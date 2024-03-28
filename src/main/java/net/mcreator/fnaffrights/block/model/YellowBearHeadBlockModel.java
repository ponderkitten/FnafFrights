package net.mcreator.fnaffrights.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnaffrights.block.entity.YellowBearHeadTileEntity;

public class YellowBearHeadBlockModel extends AnimatedGeoModel<YellowBearHeadTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(YellowBearHeadTileEntity animatable) {
		return new ResourceLocation("fnaf_frights", "animations/freddyfazbearhead.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(YellowBearHeadTileEntity animatable) {
		return new ResourceLocation("fnaf_frights", "geo/freddyfazbearhead.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(YellowBearHeadTileEntity entity) {
		return new ResourceLocation("fnaf_frights", "textures/blocks/golden_freddy_normal_eyes.png");
	}
}
