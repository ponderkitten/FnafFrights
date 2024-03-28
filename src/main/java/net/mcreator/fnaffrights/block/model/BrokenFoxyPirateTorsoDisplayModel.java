package net.mcreator.fnaffrights.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnaffrights.block.display.BrokenFoxyPirateTorsoDisplayItem;

public class BrokenFoxyPirateTorsoDisplayModel extends AnimatedGeoModel<BrokenFoxyPirateTorsoDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(BrokenFoxyPirateTorsoDisplayItem animatable) {
		return new ResourceLocation("fnaf_frights", "animations/foxypiratetorso.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(BrokenFoxyPirateTorsoDisplayItem animatable) {
		return new ResourceLocation("fnaf_frights", "geo/foxypiratetorso.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(BrokenFoxyPirateTorsoDisplayItem entity) {
		return new ResourceLocation("fnaf_frights", "textures/blocks/foxy.png");
	}
}
