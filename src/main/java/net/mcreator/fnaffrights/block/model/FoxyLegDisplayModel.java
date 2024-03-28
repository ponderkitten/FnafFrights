package net.mcreator.fnaffrights.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnaffrights.block.display.FoxyLegDisplayItem;

public class FoxyLegDisplayModel extends AnimatedGeoModel<FoxyLegDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(FoxyLegDisplayItem animatable) {
		return new ResourceLocation("fnaf_frights", "animations/foxy_leg.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(FoxyLegDisplayItem animatable) {
		return new ResourceLocation("fnaf_frights", "geo/foxy_leg.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(FoxyLegDisplayItem entity) {
		return new ResourceLocation("fnaf_frights", "textures/blocks/unwithered_foxy.png");
	}
}
