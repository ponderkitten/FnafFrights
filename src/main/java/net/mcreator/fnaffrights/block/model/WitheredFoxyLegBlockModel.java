package net.mcreator.fnaffrights.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnaffrights.block.entity.WitheredFoxyLegTileEntity;

public class WitheredFoxyLegBlockModel extends AnimatedGeoModel<WitheredFoxyLegTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(WitheredFoxyLegTileEntity animatable) {
		return new ResourceLocation("fnaf_frights", "animations/foxy_leg.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(WitheredFoxyLegTileEntity animatable) {
		return new ResourceLocation("fnaf_frights", "geo/foxy_leg.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(WitheredFoxyLegTileEntity entity) {
		return new ResourceLocation("fnaf_frights", "textures/blocks/witheredfoxytexture.png");
	}
}
