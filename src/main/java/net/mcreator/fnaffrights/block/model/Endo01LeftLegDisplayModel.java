package net.mcreator.fnaffrights.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnaffrights.block.display.Endo01LeftLegDisplayItem;

public class Endo01LeftLegDisplayModel extends AnimatedGeoModel<Endo01LeftLegDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(Endo01LeftLegDisplayItem animatable) {
		return new ResourceLocation("fnaf_frights", "animations/endo01leftleg.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(Endo01LeftLegDisplayItem animatable) {
		return new ResourceLocation("fnaf_frights", "geo/endo01leftleg.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(Endo01LeftLegDisplayItem entity) {
		return new ResourceLocation("fnaf_frights", "textures/blocks/endo01.png");
	}
}
