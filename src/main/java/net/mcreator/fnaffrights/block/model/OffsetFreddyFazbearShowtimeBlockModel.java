package net.mcreator.fnaffrights.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnaffrights.block.entity.OffsetFreddyFazbearShowtimeTileEntity;

public class OffsetFreddyFazbearShowtimeBlockModel extends AnimatedGeoModel<OffsetFreddyFazbearShowtimeTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(OffsetFreddyFazbearShowtimeTileEntity animatable) {
		return new ResourceLocation("fnaf_frights", "animations/ofreddyfazbearshowtime.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(OffsetFreddyFazbearShowtimeTileEntity animatable) {
		return new ResourceLocation("fnaf_frights", "geo/ofreddyfazbearshowtime.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(OffsetFreddyFazbearShowtimeTileEntity entity) {
		return new ResourceLocation("fnaf_frights", "textures/blocks/freddyfazbeartexture.png");
	}
}
