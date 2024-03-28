package net.mcreator.fnaffrights.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnaffrights.block.display.BrokenFoxyPirateLeftLegDisplayItem;

public class BrokenFoxyPirateLeftLegDisplayModel extends AnimatedGeoModel<BrokenFoxyPirateLeftLegDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(BrokenFoxyPirateLeftLegDisplayItem animatable) {
		return new ResourceLocation("fnaf_frights", "animations/foxypirateleftleg.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(BrokenFoxyPirateLeftLegDisplayItem animatable) {
		return new ResourceLocation("fnaf_frights", "geo/foxypirateleftleg.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(BrokenFoxyPirateLeftLegDisplayItem entity) {
		return new ResourceLocation("fnaf_frights", "textures/blocks/foxy.png");
	}
}
