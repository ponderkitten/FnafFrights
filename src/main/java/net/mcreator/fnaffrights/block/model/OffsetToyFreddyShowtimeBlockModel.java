package net.mcreator.fnaffrights.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnaffrights.block.entity.OffsetToyFreddyShowtimeTileEntity;

public class OffsetToyFreddyShowtimeBlockModel extends AnimatedGeoModel<OffsetToyFreddyShowtimeTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(OffsetToyFreddyShowtimeTileEntity animatable) {
		return new ResourceLocation("fnaf_frights", "animations/otoyfreddyshowtime.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(OffsetToyFreddyShowtimeTileEntity animatable) {
		return new ResourceLocation("fnaf_frights", "geo/otoyfreddyshowtime.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(OffsetToyFreddyShowtimeTileEntity entity) {
		return new ResourceLocation("fnaf_frights", "textures/blocks/toy_freddy.png");
	}
}
