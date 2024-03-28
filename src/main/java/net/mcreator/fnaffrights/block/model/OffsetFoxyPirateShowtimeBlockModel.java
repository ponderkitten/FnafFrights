package net.mcreator.fnaffrights.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnaffrights.block.entity.OffsetFoxyPirateShowtimeTileEntity;

public class OffsetFoxyPirateShowtimeBlockModel extends AnimatedGeoModel<OffsetFoxyPirateShowtimeTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(OffsetFoxyPirateShowtimeTileEntity animatable) {
		return new ResourceLocation("fnaf_frights", "animations/ofoxypirateshowtime.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(OffsetFoxyPirateShowtimeTileEntity animatable) {
		return new ResourceLocation("fnaf_frights", "geo/ofoxypirateshowtime.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(OffsetFoxyPirateShowtimeTileEntity entity) {
		return new ResourceLocation("fnaf_frights", "textures/blocks/foxy.png");
	}
}
