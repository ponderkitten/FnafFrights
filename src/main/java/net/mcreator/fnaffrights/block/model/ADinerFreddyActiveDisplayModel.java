package net.mcreator.fnaffrights.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnaffrights.block.display.ADinerFreddyActiveDisplayItem;

public class ADinerFreddyActiveDisplayModel extends AnimatedGeoModel<ADinerFreddyActiveDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(ADinerFreddyActiveDisplayItem animatable) {
		return new ResourceLocation("fnaf_frights", "animations/ashowtimedinerfreddyactive.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(ADinerFreddyActiveDisplayItem animatable) {
		return new ResourceLocation("fnaf_frights", "geo/ashowtimedinerfreddyactive.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(ADinerFreddyActiveDisplayItem entity) {
		return new ResourceLocation("fnaf_frights", "textures/blocks/dinerfreddy.png");
	}
}
