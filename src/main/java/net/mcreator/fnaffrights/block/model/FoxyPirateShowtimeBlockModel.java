package net.mcreator.fnaffrights.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnaffrights.block.entity.FoxyPirateShowtimeTileEntity;

public class FoxyPirateShowtimeBlockModel extends AnimatedGeoModel<FoxyPirateShowtimeTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(FoxyPirateShowtimeTileEntity animatable) {
		return new ResourceLocation("fnaf_frights", "animations/foxypirateshowtime.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(FoxyPirateShowtimeTileEntity animatable) {
		return new ResourceLocation("fnaf_frights", "geo/foxypirateshowtime.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(FoxyPirateShowtimeTileEntity entity) {
		return new ResourceLocation("fnaf_frights", "textures/blocks/foxy.png");
	}
}
