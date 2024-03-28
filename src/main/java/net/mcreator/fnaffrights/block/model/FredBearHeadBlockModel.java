package net.mcreator.fnaffrights.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnaffrights.block.entity.FredBearHeadTileEntity;

public class FredBearHeadBlockModel extends AnimatedGeoModel<FredBearHeadTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(FredBearHeadTileEntity animatable) {
		return new ResourceLocation("fnaf_frights", "animations/fredbearhead.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(FredBearHeadTileEntity animatable) {
		return new ResourceLocation("fnaf_frights", "geo/fredbearhead.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(FredBearHeadTileEntity entity) {
		return new ResourceLocation("fnaf_frights", "textures/blocks/fredbear4.png");
	}
}
