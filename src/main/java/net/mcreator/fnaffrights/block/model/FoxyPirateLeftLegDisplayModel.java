package net.mcreator.fnaffrights.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnaffrights.block.display.FoxyPirateLeftLegDisplayItem;

public class FoxyPirateLeftLegDisplayModel extends AnimatedGeoModel<FoxyPirateLeftLegDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(FoxyPirateLeftLegDisplayItem animatable) {
		return new ResourceLocation("fnaf_frights", "animations/foxypirateleftleg.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(FoxyPirateLeftLegDisplayItem animatable) {
		return new ResourceLocation("fnaf_frights", "geo/foxypirateleftleg.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(FoxyPirateLeftLegDisplayItem entity) {
		return new ResourceLocation("fnaf_frights", "textures/blocks/fixedfoxy.png");
	}
}
