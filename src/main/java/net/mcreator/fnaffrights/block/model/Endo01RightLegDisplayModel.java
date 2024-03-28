package net.mcreator.fnaffrights.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnaffrights.block.display.Endo01RightLegDisplayItem;

public class Endo01RightLegDisplayModel extends AnimatedGeoModel<Endo01RightLegDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(Endo01RightLegDisplayItem animatable) {
		return new ResourceLocation("fnaf_frights", "animations/endo01rightleg.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(Endo01RightLegDisplayItem animatable) {
		return new ResourceLocation("fnaf_frights", "geo/endo01rightleg.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(Endo01RightLegDisplayItem entity) {
		return new ResourceLocation("fnaf_frights", "textures/blocks/endo01.png");
	}
}
