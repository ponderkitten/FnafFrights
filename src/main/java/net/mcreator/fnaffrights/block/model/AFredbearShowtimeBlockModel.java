package net.mcreator.fnaffrights.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnaffrights.block.entity.AFredbearShowtimeTileEntity;

public class AFredbearShowtimeBlockModel extends AnimatedGeoModel<AFredbearShowtimeTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(AFredbearShowtimeTileEntity animatable) {
		return new ResourceLocation("fnaf_frights", "animations/afredbearshowtime.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(AFredbearShowtimeTileEntity animatable) {
		return new ResourceLocation("fnaf_frights", "geo/afredbearshowtime.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(AFredbearShowtimeTileEntity entity) {
		return new ResourceLocation("fnaf_frights", "textures/blocks/fredbear4.png");
	}
}
