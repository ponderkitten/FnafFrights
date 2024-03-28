package net.mcreator.fnaffrights.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnaffrights.block.entity.GlitchtrapShowtimeTileEntity;

public class GlitchtrapShowtimeBlockModel extends AnimatedGeoModel<GlitchtrapShowtimeTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(GlitchtrapShowtimeTileEntity animatable) {
		return new ResourceLocation("fnaf_frights", "animations/springbonnieshowtime.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(GlitchtrapShowtimeTileEntity animatable) {
		return new ResourceLocation("fnaf_frights", "geo/springbonnieshowtime.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(GlitchtrapShowtimeTileEntity entity) {
		return new ResourceLocation("fnaf_frights", "textures/blocks/springbonniewithvestandwhiskers.png");
	}
}
