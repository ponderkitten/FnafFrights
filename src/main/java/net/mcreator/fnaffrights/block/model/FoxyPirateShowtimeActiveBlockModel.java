package net.mcreator.fnaffrights.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnaffrights.block.entity.FoxyPirateShowtimeActiveTileEntity;

public class FoxyPirateShowtimeActiveBlockModel extends AnimatedGeoModel<FoxyPirateShowtimeActiveTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(FoxyPirateShowtimeActiveTileEntity animatable) {
		return new ResourceLocation("fnaf_frights", "animations/foxypirateshowtimeactive.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(FoxyPirateShowtimeActiveTileEntity animatable) {
		return new ResourceLocation("fnaf_frights", "geo/foxypirateshowtimeactive.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(FoxyPirateShowtimeActiveTileEntity entity) {
		return new ResourceLocation("fnaf_frights", "textures/blocks/foxy.png");
	}
}
