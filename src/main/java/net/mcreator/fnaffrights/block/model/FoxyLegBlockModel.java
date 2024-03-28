package net.mcreator.fnaffrights.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnaffrights.block.entity.FoxyLegTileEntity;

public class FoxyLegBlockModel extends AnimatedGeoModel<FoxyLegTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(FoxyLegTileEntity animatable) {
		return new ResourceLocation("fnaf_frights", "animations/foxy_leg.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(FoxyLegTileEntity animatable) {
		return new ResourceLocation("fnaf_frights", "geo/foxy_leg.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(FoxyLegTileEntity entity) {
		return new ResourceLocation("fnaf_frights", "textures/blocks/unwithered_foxy.png");
	}
}
