package net.mcreator.fnaffrights.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnaffrights.block.display.ToyFreddyTorsoDisplayItem;

public class ToyFreddyTorsoDisplayModel extends AnimatedGeoModel<ToyFreddyTorsoDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(ToyFreddyTorsoDisplayItem animatable) {
		return new ResourceLocation("fnaf_frights", "animations/toyfreddytorso.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(ToyFreddyTorsoDisplayItem animatable) {
		return new ResourceLocation("fnaf_frights", "geo/toyfreddytorso.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(ToyFreddyTorsoDisplayItem entity) {
		return new ResourceLocation("fnaf_frights", "textures/blocks/toy_freddy.png");
	}
}
