package net.mcreator.fnaffrights.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnaffrights.block.display.ToyBonnieTorsoDisplayItem;

public class ToyBonnieTorsoDisplayModel extends AnimatedGeoModel<ToyBonnieTorsoDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(ToyBonnieTorsoDisplayItem animatable) {
		return new ResourceLocation("fnaf_frights", "animations/toybonnietorso.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(ToyBonnieTorsoDisplayItem animatable) {
		return new ResourceLocation("fnaf_frights", "geo/toybonnietorso.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(ToyBonnieTorsoDisplayItem entity) {
		return new ResourceLocation("fnaf_frights", "textures/blocks/toy_bonnie.png");
	}
}
