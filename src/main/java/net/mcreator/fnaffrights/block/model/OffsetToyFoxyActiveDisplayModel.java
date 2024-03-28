package net.mcreator.fnaffrights.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnaffrights.block.display.OffsetToyFoxyActiveDisplayItem;

public class OffsetToyFoxyActiveDisplayModel extends AnimatedGeoModel<OffsetToyFoxyActiveDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(OffsetToyFoxyActiveDisplayItem animatable) {
		return new ResourceLocation("fnaf_frights", "animations/otoyfoxyshowtimeactive.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(OffsetToyFoxyActiveDisplayItem animatable) {
		return new ResourceLocation("fnaf_frights", "geo/otoyfoxyshowtimeactive.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(OffsetToyFoxyActiveDisplayItem entity) {
		return new ResourceLocation("fnaf_frights", "textures/blocks/toy_foxy.png");
	}
}
