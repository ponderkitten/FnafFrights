package net.mcreator.fnaffrights.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnaffrights.block.display.Endo02LeftLegDisplayItem;

public class Endo02LeftLegDisplayModel extends AnimatedGeoModel<Endo02LeftLegDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(Endo02LeftLegDisplayItem animatable) {
		return new ResourceLocation("fnaf_frights", "animations/freddyleftleg.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(Endo02LeftLegDisplayItem animatable) {
		return new ResourceLocation("fnaf_frights", "geo/freddyleftleg.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(Endo02LeftLegDisplayItem entity) {
		return new ResourceLocation("fnaf_frights", "textures/blocks/endo02.png");
	}
}
