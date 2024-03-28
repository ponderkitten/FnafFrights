package net.mcreator.fnaffrights.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnaffrights.block.display.GlitchtrapShowtimeActiveDisplayItem;

public class GlitchtrapShowtimeActiveDisplayModel extends AnimatedGeoModel<GlitchtrapShowtimeActiveDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(GlitchtrapShowtimeActiveDisplayItem animatable) {
		return new ResourceLocation("fnaf_frights", "animations/springbonnieshowtimeactive.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(GlitchtrapShowtimeActiveDisplayItem animatable) {
		return new ResourceLocation("fnaf_frights", "geo/springbonnieshowtimeactive.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(GlitchtrapShowtimeActiveDisplayItem entity) {
		return new ResourceLocation("fnaf_frights", "textures/blocks/springbonniewithvestandwhiskers.png");
	}
}
