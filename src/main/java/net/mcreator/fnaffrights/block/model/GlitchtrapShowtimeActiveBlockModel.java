package net.mcreator.fnaffrights.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnaffrights.block.entity.GlitchtrapShowtimeActiveTileEntity;

public class GlitchtrapShowtimeActiveBlockModel extends AnimatedGeoModel<GlitchtrapShowtimeActiveTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(GlitchtrapShowtimeActiveTileEntity animatable) {
		return new ResourceLocation("fnaf_frights", "animations/springbonnieshowtimeactive.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(GlitchtrapShowtimeActiveTileEntity animatable) {
		return new ResourceLocation("fnaf_frights", "geo/springbonnieshowtimeactive.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(GlitchtrapShowtimeActiveTileEntity entity) {
		return new ResourceLocation("fnaf_frights", "textures/blocks/springbonniewithvestandwhiskers.png");
	}
}
