package net.mcreator.fnaffrights.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnaffrights.block.display.SpringBonnieLeftLEgDisplayItem;

public class SpringBonnieLeftLEgDisplayModel extends AnimatedGeoModel<SpringBonnieLeftLEgDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(SpringBonnieLeftLEgDisplayItem animatable) {
		return new ResourceLocation("fnaf_frights", "animations/springbonniesleftleg.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(SpringBonnieLeftLEgDisplayItem animatable) {
		return new ResourceLocation("fnaf_frights", "geo/springbonniesleftleg.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(SpringBonnieLeftLEgDisplayItem entity) {
		return new ResourceLocation("fnaf_frights", "textures/blocks/springbonnie.png");
	}
}
