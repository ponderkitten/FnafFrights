package net.mcreator.fnaffrights.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnaffrights.block.display.EmptyboxDisplayItem;

public class EmptyboxDisplayModel extends AnimatedGeoModel<EmptyboxDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(EmptyboxDisplayItem animatable) {
		return new ResourceLocation("fnaf_frights", "animations/emptybox.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(EmptyboxDisplayItem animatable) {
		return new ResourceLocation("fnaf_frights", "geo/emptybox.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(EmptyboxDisplayItem entity) {
		return new ResourceLocation("fnaf_frights", "textures/blocks/freddybox.png");
	}
}
