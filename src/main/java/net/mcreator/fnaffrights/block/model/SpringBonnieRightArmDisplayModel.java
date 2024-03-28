package net.mcreator.fnaffrights.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnaffrights.block.display.SpringBonnieRightArmDisplayItem;

public class SpringBonnieRightArmDisplayModel extends AnimatedGeoModel<SpringBonnieRightArmDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(SpringBonnieRightArmDisplayItem animatable) {
		return new ResourceLocation("fnaf_frights", "animations/springbonniesrightarm.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(SpringBonnieRightArmDisplayItem animatable) {
		return new ResourceLocation("fnaf_frights", "geo/springbonniesrightarm.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(SpringBonnieRightArmDisplayItem entity) {
		return new ResourceLocation("fnaf_frights", "textures/blocks/springbonnie.png");
	}
}
