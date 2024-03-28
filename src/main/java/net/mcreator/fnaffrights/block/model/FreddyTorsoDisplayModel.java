package net.mcreator.fnaffrights.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnaffrights.block.display.FreddyTorsoDisplayItem;

public class FreddyTorsoDisplayModel extends AnimatedGeoModel<FreddyTorsoDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(FreddyTorsoDisplayItem animatable) {
		return new ResourceLocation("fnaf_frights", "animations/freddytorso.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(FreddyTorsoDisplayItem animatable) {
		return new ResourceLocation("fnaf_frights", "geo/freddytorso.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(FreddyTorsoDisplayItem entity) {
		return new ResourceLocation("fnaf_frights", "textures/blocks/unwithered_freddy.png");
	}
}
