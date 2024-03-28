package net.mcreator.fnaffrights.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnaffrights.block.display.OffsetFreddyFazbearActiveDisplayItem;

public class OffsetFreddyFazbearActiveDisplayModel extends AnimatedGeoModel<OffsetFreddyFazbearActiveDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(OffsetFreddyFazbearActiveDisplayItem animatable) {
		return new ResourceLocation("fnaf_frights", "animations/ofreddyfazbearshowtimeactive.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(OffsetFreddyFazbearActiveDisplayItem animatable) {
		return new ResourceLocation("fnaf_frights", "geo/ofreddyfazbearshowtimeactive.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(OffsetFreddyFazbearActiveDisplayItem entity) {
		return new ResourceLocation("fnaf_frights", "textures/blocks/freddyfazbeartexture.png");
	}
}
