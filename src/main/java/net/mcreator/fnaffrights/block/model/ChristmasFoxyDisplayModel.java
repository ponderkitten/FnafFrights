package net.mcreator.fnaffrights.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnaffrights.block.display.ChristmasFoxyDisplayItem;

public class ChristmasFoxyDisplayModel extends AnimatedGeoModel<ChristmasFoxyDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(ChristmasFoxyDisplayItem animatable) {
		return new ResourceLocation("fnaf_frights", "animations/fixedfoxypirateshowtime.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(ChristmasFoxyDisplayItem animatable) {
		return new ResourceLocation("fnaf_frights", "geo/fixedfoxypirateshowtime.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(ChristmasFoxyDisplayItem entity) {
		return new ResourceLocation("fnaf_frights", "textures/blocks/christmasfoxy.png");
	}
}
