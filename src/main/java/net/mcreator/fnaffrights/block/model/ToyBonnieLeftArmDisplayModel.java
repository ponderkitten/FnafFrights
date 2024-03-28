package net.mcreator.fnaffrights.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnaffrights.block.display.ToyBonnieLeftArmDisplayItem;

public class ToyBonnieLeftArmDisplayModel extends AnimatedGeoModel<ToyBonnieLeftArmDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(ToyBonnieLeftArmDisplayItem animatable) {
		return new ResourceLocation("fnaf_frights", "animations/toybonnieleftarm.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(ToyBonnieLeftArmDisplayItem animatable) {
		return new ResourceLocation("fnaf_frights", "geo/toybonnieleftarm.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(ToyBonnieLeftArmDisplayItem entity) {
		return new ResourceLocation("fnaf_frights", "textures/blocks/toy_bonnie.png");
	}
}
