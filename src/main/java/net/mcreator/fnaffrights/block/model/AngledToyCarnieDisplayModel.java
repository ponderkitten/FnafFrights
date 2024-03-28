package net.mcreator.fnaffrights.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnaffrights.block.display.AngledToyCarnieDisplayItem;

public class AngledToyCarnieDisplayModel extends AnimatedGeoModel<AngledToyCarnieDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(AngledToyCarnieDisplayItem animatable) {
		return new ResourceLocation("fnaf_frights", "animations/atoycarnieshowtime.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(AngledToyCarnieDisplayItem animatable) {
		return new ResourceLocation("fnaf_frights", "geo/atoycarnieshowtime.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(AngledToyCarnieDisplayItem entity) {
		return new ResourceLocation("fnaf_frights", "textures/blocks/legallydistinctcarnie.png");
	}
}
