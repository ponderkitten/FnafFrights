package net.mcreator.fnaffrights.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnaffrights.block.display.AFreddyFazbearActiveDisplayItem;

public class AFreddyFazbearActiveDisplayModel extends AnimatedGeoModel<AFreddyFazbearActiveDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(AFreddyFazbearActiveDisplayItem animatable) {
		return new ResourceLocation("fnaf_frights", "animations/afreddyfazbearshowtimeactive.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(AFreddyFazbearActiveDisplayItem animatable) {
		return new ResourceLocation("fnaf_frights", "geo/afreddyfazbearshowtimeactive.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(AFreddyFazbearActiveDisplayItem entity) {
		return new ResourceLocation("fnaf_frights", "textures/blocks/freddyfazbeartexture.png");
	}
}
