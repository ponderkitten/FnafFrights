package net.mcreator.fnaffrights.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnaffrights.block.display.ToyBonnieLeftLegDisplayItem;

public class ToyBonnieLeftLegDisplayModel extends AnimatedGeoModel<ToyBonnieLeftLegDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(ToyBonnieLeftLegDisplayItem animatable) {
		return new ResourceLocation("fnaf_frights", "animations/toybonnieleftleg.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(ToyBonnieLeftLegDisplayItem animatable) {
		return new ResourceLocation("fnaf_frights", "geo/toybonnieleftleg.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(ToyBonnieLeftLegDisplayItem entity) {
		return new ResourceLocation("fnaf_frights", "textures/blocks/toy_bonnie.png");
	}
}
