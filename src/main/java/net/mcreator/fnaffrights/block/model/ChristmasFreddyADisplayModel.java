package net.mcreator.fnaffrights.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnaffrights.block.display.ChristmasFreddyADisplayItem;

public class ChristmasFreddyADisplayModel extends AnimatedGeoModel<ChristmasFreddyADisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(ChristmasFreddyADisplayItem animatable) {
		return new ResourceLocation("fnaf_frights", "animations/christmasfreddyactive.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(ChristmasFreddyADisplayItem animatable) {
		return new ResourceLocation("fnaf_frights", "geo/christmasfreddyactive.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(ChristmasFreddyADisplayItem entity) {
		return new ResourceLocation("fnaf_frights", "textures/blocks/suit_combine.png");
	}
}
