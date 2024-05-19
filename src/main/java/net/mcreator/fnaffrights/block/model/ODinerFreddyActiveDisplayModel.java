package net.mcreator.fnaffrights.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnaffrights.block.display.ODinerFreddyActiveDisplayItem;

public class ODinerFreddyActiveDisplayModel extends AnimatedGeoModel<ODinerFreddyActiveDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(ODinerFreddyActiveDisplayItem animatable) {
		return new ResourceLocation("fnaf_frights", "animations/oshowtimedinerfreddyactive.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(ODinerFreddyActiveDisplayItem animatable) {
		return new ResourceLocation("fnaf_frights", "geo/oshowtimedinerfreddyactive.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(ODinerFreddyActiveDisplayItem entity) {
		return new ResourceLocation("fnaf_frights", "textures/blocks/dinerfreddy.png");
	}
}
