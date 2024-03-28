package net.mcreator.fnaffrights.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnaffrights.block.display.BonnieLeftArmDisplayItem;

public class BonnieLeftArmDisplayModel extends AnimatedGeoModel<BonnieLeftArmDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(BonnieLeftArmDisplayItem animatable) {
		return new ResourceLocation("fnaf_frights", "animations/bonnieleftarm.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(BonnieLeftArmDisplayItem animatable) {
		return new ResourceLocation("fnaf_frights", "geo/bonnieleftarm.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(BonnieLeftArmDisplayItem entity) {
		return new ResourceLocation("fnaf_frights", "textures/blocks/unwithered_bonnie.png");
	}
}
