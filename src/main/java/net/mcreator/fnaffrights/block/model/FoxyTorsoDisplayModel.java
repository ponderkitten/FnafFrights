package net.mcreator.fnaffrights.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnaffrights.block.display.FoxyTorsoDisplayItem;

public class FoxyTorsoDisplayModel extends AnimatedGeoModel<FoxyTorsoDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(FoxyTorsoDisplayItem animatable) {
		return new ResourceLocation("fnaf_frights", "animations/foxy_torso.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(FoxyTorsoDisplayItem animatable) {
		return new ResourceLocation("fnaf_frights", "geo/foxy_torso.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(FoxyTorsoDisplayItem entity) {
		return new ResourceLocation("fnaf_frights", "textures/blocks/unwithered_foxy.png");
	}
}
