package net.mcreator.fnaffrights.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnaffrights.block.entity.FreddyFazbearShowtimeTileEntity;

public class FreddyFazbearShowtimeBlockModel extends AnimatedGeoModel<FreddyFazbearShowtimeTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(FreddyFazbearShowtimeTileEntity animatable) {
		return new ResourceLocation("fnaf_frights", "animations/freddyfazbearshowtime.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(FreddyFazbearShowtimeTileEntity animatable) {
		return new ResourceLocation("fnaf_frights", "geo/freddyfazbearshowtime.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(FreddyFazbearShowtimeTileEntity entity) {
		return new ResourceLocation("fnaf_frights", "textures/blocks/freddyfazbeartexture.png");
	}
}
