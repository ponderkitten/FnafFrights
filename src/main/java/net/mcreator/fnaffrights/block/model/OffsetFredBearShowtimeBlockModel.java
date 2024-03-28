package net.mcreator.fnaffrights.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnaffrights.block.entity.OffsetFredBearShowtimeTileEntity;

public class OffsetFredBearShowtimeBlockModel extends AnimatedGeoModel<OffsetFredBearShowtimeTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(OffsetFredBearShowtimeTileEntity animatable) {
		return new ResourceLocation("fnaf_frights", "animations/ofredbearshowtime.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(OffsetFredBearShowtimeTileEntity animatable) {
		return new ResourceLocation("fnaf_frights", "geo/ofredbearshowtime.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(OffsetFredBearShowtimeTileEntity entity) {
		return new ResourceLocation("fnaf_frights", "textures/blocks/fredbear4.png");
	}
}
