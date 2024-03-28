package net.mcreator.fnaffrights.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnaffrights.block.display.SpringBonnieTorsoDisplayItem;

public class SpringBonnieTorsoDisplayModel extends AnimatedGeoModel<SpringBonnieTorsoDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(SpringBonnieTorsoDisplayItem animatable) {
		return new ResourceLocation("fnaf_frights", "animations/springbonnietorso.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(SpringBonnieTorsoDisplayItem animatable) {
		return new ResourceLocation("fnaf_frights", "geo/springbonnietorso.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(SpringBonnieTorsoDisplayItem entity) {
		return new ResourceLocation("fnaf_frights", "textures/blocks/springbonnie.png");
	}
}
