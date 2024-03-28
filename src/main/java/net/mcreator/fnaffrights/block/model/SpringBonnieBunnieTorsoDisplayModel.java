package net.mcreator.fnaffrights.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnaffrights.block.display.SpringBonnieBunnieTorsoDisplayItem;

public class SpringBonnieBunnieTorsoDisplayModel extends AnimatedGeoModel<SpringBonnieBunnieTorsoDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(SpringBonnieBunnieTorsoDisplayItem animatable) {
		return new ResourceLocation("fnaf_frights", "animations/bonniebunnietorso.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(SpringBonnieBunnieTorsoDisplayItem animatable) {
		return new ResourceLocation("fnaf_frights", "geo/bonniebunnietorso.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(SpringBonnieBunnieTorsoDisplayItem entity) {
		return new ResourceLocation("fnaf_frights", "textures/blocks/spring_bonnie_fnaf1.png");
	}
}
