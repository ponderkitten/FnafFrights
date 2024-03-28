package net.mcreator.fnaffrights.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnaffrights.block.entity.FreddyShowtimeTileEntity;

public class FreddyShowtimeBlockModel extends AnimatedGeoModel<FreddyShowtimeTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(FreddyShowtimeTileEntity animatable) {
		return new ResourceLocation("fnaf_frights", "animations/freddyshowtime.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(FreddyShowtimeTileEntity animatable) {
		return new ResourceLocation("fnaf_frights", "geo/freddyshowtime.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(FreddyShowtimeTileEntity entity) {
		return new ResourceLocation("fnaf_frights", "textures/blocks/unwithered_freddy.png");
	}
}
