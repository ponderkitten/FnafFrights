package net.mcreator.fnaffrights.item.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnaffrights.item.PresentItem;

public class PresentItemModel extends AnimatedGeoModel<PresentItem> {
	@Override
	public ResourceLocation getAnimationResource(PresentItem animatable) {
		return new ResourceLocation("fnaf_frights", "animations/present.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(PresentItem animatable) {
		return new ResourceLocation("fnaf_frights", "geo/present.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(PresentItem animatable) {
		return new ResourceLocation("fnaf_frights", "textures/items/present.png");
	}
}
