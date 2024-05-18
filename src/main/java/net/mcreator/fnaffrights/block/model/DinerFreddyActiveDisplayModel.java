package net.mcreator.fnaffrights.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnaffrights.block.display.DinerFreddyActiveDisplayItem;

public class DinerFreddyActiveDisplayModel extends AnimatedGeoModel<DinerFreddyActiveDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(DinerFreddyActiveDisplayItem animatable) {
		return new ResourceLocation("fnaf_frights", "animations/showtimedinerfreddyactive.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(DinerFreddyActiveDisplayItem animatable) {
		return new ResourceLocation("fnaf_frights", "geo/showtimedinerfreddyactive.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(DinerFreddyActiveDisplayItem entity) {
		return new ResourceLocation("fnaf_frights", "textures/blocks/dinerfreddy.png");
	}
}
