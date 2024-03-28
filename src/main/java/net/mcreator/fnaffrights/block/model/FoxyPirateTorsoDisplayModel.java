package net.mcreator.fnaffrights.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnaffrights.block.display.FoxyPirateTorsoDisplayItem;

public class FoxyPirateTorsoDisplayModel extends AnimatedGeoModel<FoxyPirateTorsoDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(FoxyPirateTorsoDisplayItem animatable) {
		return new ResourceLocation("fnaf_frights", "animations/foxypiratetorso.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(FoxyPirateTorsoDisplayItem animatable) {
		return new ResourceLocation("fnaf_frights", "geo/foxypiratetorso.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(FoxyPirateTorsoDisplayItem entity) {
		return new ResourceLocation("fnaf_frights", "textures/blocks/fixedfoxy.png");
	}
}
