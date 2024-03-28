package net.mcreator.fnaffrights.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnaffrights.block.display.ToyBonnieRightLegDisplayItem;

public class ToyBonnieRightLegDisplayModel extends AnimatedGeoModel<ToyBonnieRightLegDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(ToyBonnieRightLegDisplayItem animatable) {
		return new ResourceLocation("fnaf_frights", "animations/toybonnierightleg.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(ToyBonnieRightLegDisplayItem animatable) {
		return new ResourceLocation("fnaf_frights", "geo/toybonnierightleg.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(ToyBonnieRightLegDisplayItem entity) {
		return new ResourceLocation("fnaf_frights", "textures/blocks/toy_bonnie.png");
	}
}
