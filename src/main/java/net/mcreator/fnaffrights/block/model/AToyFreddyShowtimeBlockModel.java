package net.mcreator.fnaffrights.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnaffrights.block.entity.AToyFreddyShowtimeTileEntity;

public class AToyFreddyShowtimeBlockModel extends AnimatedGeoModel<AToyFreddyShowtimeTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(AToyFreddyShowtimeTileEntity animatable) {
		return new ResourceLocation("fnaf_frights", "animations/atoyfreddyshowtime.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(AToyFreddyShowtimeTileEntity animatable) {
		return new ResourceLocation("fnaf_frights", "geo/atoyfreddyshowtime.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(AToyFreddyShowtimeTileEntity entity) {
		return new ResourceLocation("fnaf_frights", "textures/blocks/toy_freddy.png");
	}
}
