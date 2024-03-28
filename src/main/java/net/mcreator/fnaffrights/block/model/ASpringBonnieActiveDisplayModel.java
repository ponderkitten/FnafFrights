package net.mcreator.fnaffrights.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnaffrights.block.display.ASpringBonnieActiveDisplayItem;

public class ASpringBonnieActiveDisplayModel extends AnimatedGeoModel<ASpringBonnieActiveDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(ASpringBonnieActiveDisplayItem animatable) {
		return new ResourceLocation("fnaf_frights", "animations/aspringbonnieshowtimeactive.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(ASpringBonnieActiveDisplayItem animatable) {
		return new ResourceLocation("fnaf_frights", "geo/aspringbonnieshowtimeactive.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(ASpringBonnieActiveDisplayItem entity) {
		return new ResourceLocation("fnaf_frights", "textures/blocks/springbonnie.png");
	}
}
