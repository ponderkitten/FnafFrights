package net.mcreator.fnaffrights.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnaffrights.block.display.SpringBonnieLeftArmDisplayItem;

public class SpringBonnieLeftArmDisplayModel extends AnimatedGeoModel<SpringBonnieLeftArmDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(SpringBonnieLeftArmDisplayItem animatable) {
		return new ResourceLocation("fnaf_frights", "animations/springbonniesleftarm.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(SpringBonnieLeftArmDisplayItem animatable) {
		return new ResourceLocation("fnaf_frights", "geo/springbonniesleftarm.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(SpringBonnieLeftArmDisplayItem entity) {
		return new ResourceLocation("fnaf_frights", "textures/blocks/springbonnie.png");
	}
}
