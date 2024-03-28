package net.mcreator.fnaffrights.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnaffrights.block.display.OffsetSpringBonnieActiveDisplayItem;

public class OffsetSpringBonnieActiveDisplayModel extends AnimatedGeoModel<OffsetSpringBonnieActiveDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(OffsetSpringBonnieActiveDisplayItem animatable) {
		return new ResourceLocation("fnaf_frights", "animations/ospringbonnieshowtimeactive.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(OffsetSpringBonnieActiveDisplayItem animatable) {
		return new ResourceLocation("fnaf_frights", "geo/ospringbonnieshowtimeactive.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(OffsetSpringBonnieActiveDisplayItem entity) {
		return new ResourceLocation("fnaf_frights", "textures/blocks/springbonnie.png");
	}
}
