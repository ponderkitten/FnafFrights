package net.mcreator.fnaffrights.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnaffrights.block.entity.FreddyFazbearShowtimeActiveTileEntity;

public class FreddyFazbearShowtimeActiveBlockModel extends AnimatedGeoModel<FreddyFazbearShowtimeActiveTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(FreddyFazbearShowtimeActiveTileEntity animatable) {
		return new ResourceLocation("fnaf_frights", "animations/freddyfazbearshowtimeactive.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(FreddyFazbearShowtimeActiveTileEntity animatable) {
		return new ResourceLocation("fnaf_frights", "geo/freddyfazbearshowtimeactive.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(FreddyFazbearShowtimeActiveTileEntity entity) {
		return new ResourceLocation("fnaf_frights", "textures/blocks/freddyfazbeartexture.png");
	}
}
