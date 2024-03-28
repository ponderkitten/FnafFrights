package net.mcreator.fnaffrights.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnaffrights.block.entity.AFoxyPirateShowtimeTileEntity;

public class AFoxyPirateShowtimeBlockModel extends AnimatedGeoModel<AFoxyPirateShowtimeTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(AFoxyPirateShowtimeTileEntity animatable) {
		return new ResourceLocation("fnaf_frights", "animations/afoxypirateshowtime.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(AFoxyPirateShowtimeTileEntity animatable) {
		return new ResourceLocation("fnaf_frights", "geo/afoxypirateshowtime.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(AFoxyPirateShowtimeTileEntity entity) {
		return new ResourceLocation("fnaf_frights", "textures/blocks/foxy.png");
	}
}
