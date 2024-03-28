package net.mcreator.fnaffrights.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnaffrights.block.display.CaptainFoxyStatueDisplayItem;

public class CaptainFoxyStatueDisplayModel extends AnimatedGeoModel<CaptainFoxyStatueDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(CaptainFoxyStatueDisplayItem animatable) {
		return new ResourceLocation("fnaf_frights", "animations/captainfoxy.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(CaptainFoxyStatueDisplayItem animatable) {
		return new ResourceLocation("fnaf_frights", "geo/captainfoxy.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(CaptainFoxyStatueDisplayItem entity) {
		return new ResourceLocation("fnaf_frights", "textures/blocks/dinerfoxy.png");
	}
}
