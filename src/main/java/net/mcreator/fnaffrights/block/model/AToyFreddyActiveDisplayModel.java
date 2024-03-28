package net.mcreator.fnaffrights.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnaffrights.block.display.AToyFreddyActiveDisplayItem;

public class AToyFreddyActiveDisplayModel extends AnimatedGeoModel<AToyFreddyActiveDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(AToyFreddyActiveDisplayItem animatable) {
		return new ResourceLocation("fnaf_frights", "animations/atoyfreddyshowtimeactive.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(AToyFreddyActiveDisplayItem animatable) {
		return new ResourceLocation("fnaf_frights", "geo/atoyfreddyshowtimeactive.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(AToyFreddyActiveDisplayItem entity) {
		return new ResourceLocation("fnaf_frights", "textures/blocks/toy_freddy.png");
	}
}
