package net.mcreator.fnaffrights.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnaffrights.block.display.ClosetFoxyDisplayItem;

public class ClosetFoxyDisplayModel extends AnimatedGeoModel<ClosetFoxyDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(ClosetFoxyDisplayItem animatable) {
		return new ResourceLocation("fnaf_frights", "animations/closetedfox.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(ClosetFoxyDisplayItem animatable) {
		return new ResourceLocation("fnaf_frights", "geo/closetedfox.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(ClosetFoxyDisplayItem entity) {
		return new ResourceLocation("fnaf_frights", "textures/blocks/closetedfoxy.png");
	}
}
