package net.mcreator.fnaffrights.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnaffrights.block.display.AFoxyActiveDisplayItem;

public class AFoxyActiveDisplayModel extends AnimatedGeoModel<AFoxyActiveDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(AFoxyActiveDisplayItem animatable) {
		return new ResourceLocation("fnaf_frights", "animations/afoxyshowtimeactive.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(AFoxyActiveDisplayItem animatable) {
		return new ResourceLocation("fnaf_frights", "geo/afoxyshowtimeactive.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(AFoxyActiveDisplayItem entity) {
		return new ResourceLocation("fnaf_frights", "textures/blocks/unwithered_foxy.png");
	}
}
