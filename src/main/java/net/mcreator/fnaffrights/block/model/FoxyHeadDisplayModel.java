package net.mcreator.fnaffrights.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnaffrights.block.display.FoxyHeadDisplayItem;

public class FoxyHeadDisplayModel extends AnimatedGeoModel<FoxyHeadDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(FoxyHeadDisplayItem animatable) {
		return new ResourceLocation("fnaf_frights", "animations/foxy_head.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(FoxyHeadDisplayItem animatable) {
		return new ResourceLocation("fnaf_frights", "geo/foxy_head.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(FoxyHeadDisplayItem entity) {
		return new ResourceLocation("fnaf_frights", "textures/blocks/unwithered_foxy.png");
	}
}
