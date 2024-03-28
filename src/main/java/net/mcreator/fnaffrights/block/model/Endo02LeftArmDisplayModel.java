package net.mcreator.fnaffrights.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnaffrights.block.display.Endo02LeftArmDisplayItem;

public class Endo02LeftArmDisplayModel extends AnimatedGeoModel<Endo02LeftArmDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(Endo02LeftArmDisplayItem animatable) {
		return new ResourceLocation("fnaf_frights", "animations/freddyleftarm.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(Endo02LeftArmDisplayItem animatable) {
		return new ResourceLocation("fnaf_frights", "geo/freddyleftarm.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(Endo02LeftArmDisplayItem entity) {
		return new ResourceLocation("fnaf_frights", "textures/blocks/endo02.png");
	}
}
