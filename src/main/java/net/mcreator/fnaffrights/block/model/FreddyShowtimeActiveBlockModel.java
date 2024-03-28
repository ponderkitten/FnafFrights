package net.mcreator.fnaffrights.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnaffrights.block.entity.FreddyShowtimeActiveTileEntity;

public class FreddyShowtimeActiveBlockModel extends AnimatedGeoModel<FreddyShowtimeActiveTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(FreddyShowtimeActiveTileEntity animatable) {
		return new ResourceLocation("fnaf_frights", "animations/freddyshowtimeactive.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(FreddyShowtimeActiveTileEntity animatable) {
		return new ResourceLocation("fnaf_frights", "geo/freddyshowtimeactive.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(FreddyShowtimeActiveTileEntity entity) {
		return new ResourceLocation("fnaf_frights", "textures/blocks/unwithered_freddy.png");
	}
}
