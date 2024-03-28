package net.mcreator.fnaffrights.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnaffrights.block.display.SpringBonnieBunnieRightLegDisplayItem;

public class SpringBonnieBunnieRightLegDisplayModel extends AnimatedGeoModel<SpringBonnieBunnieRightLegDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(SpringBonnieBunnieRightLegDisplayItem animatable) {
		return new ResourceLocation("fnaf_frights", "animations/bonniebunnierightleg.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(SpringBonnieBunnieRightLegDisplayItem animatable) {
		return new ResourceLocation("fnaf_frights", "geo/bonniebunnierightleg.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(SpringBonnieBunnieRightLegDisplayItem entity) {
		return new ResourceLocation("fnaf_frights", "textures/blocks/spring_bonnie_fnaf1.png");
	}
}
