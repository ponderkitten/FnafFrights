package net.mcreator.fnaffrights.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnaffrights.block.display.SpringBonnieRightLegDisplayItem;

public class SpringBonnieRightLegDisplayModel extends AnimatedGeoModel<SpringBonnieRightLegDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(SpringBonnieRightLegDisplayItem animatable) {
		return new ResourceLocation("fnaf_frights", "animations/springbonniesrightleg.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(SpringBonnieRightLegDisplayItem animatable) {
		return new ResourceLocation("fnaf_frights", "geo/springbonniesrightleg.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(SpringBonnieRightLegDisplayItem entity) {
		return new ResourceLocation("fnaf_frights", "textures/blocks/springbonnie.png");
	}
}
