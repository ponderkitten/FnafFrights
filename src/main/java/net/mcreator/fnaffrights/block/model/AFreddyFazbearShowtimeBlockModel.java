package net.mcreator.fnaffrights.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnaffrights.block.entity.AFreddyFazbearShowtimeTileEntity;

public class AFreddyFazbearShowtimeBlockModel extends AnimatedGeoModel<AFreddyFazbearShowtimeTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(AFreddyFazbearShowtimeTileEntity animatable) {
		return new ResourceLocation("fnaf_frights", "animations/afreddyfazbearshowtime.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(AFreddyFazbearShowtimeTileEntity animatable) {
		return new ResourceLocation("fnaf_frights", "geo/afreddyfazbearshowtime.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(AFreddyFazbearShowtimeTileEntity entity) {
		return new ResourceLocation("fnaf_frights", "textures/blocks/freddyfazbeartexture.png");
	}
}
