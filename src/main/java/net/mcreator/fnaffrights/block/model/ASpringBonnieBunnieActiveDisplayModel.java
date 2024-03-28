package net.mcreator.fnaffrights.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnaffrights.block.display.ASpringBonnieBunnieActiveDisplayItem;

public class ASpringBonnieBunnieActiveDisplayModel extends AnimatedGeoModel<ASpringBonnieBunnieActiveDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(ASpringBonnieBunnieActiveDisplayItem animatable) {
		return new ResourceLocation("fnaf_frights", "animations/abonniebunnieshowtimeactive.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(ASpringBonnieBunnieActiveDisplayItem animatable) {
		return new ResourceLocation("fnaf_frights", "geo/abonniebunnieshowtimeactive.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(ASpringBonnieBunnieActiveDisplayItem entity) {
		return new ResourceLocation("fnaf_frights", "textures/blocks/spring_bonnie_fnaf1.png");
	}
}
