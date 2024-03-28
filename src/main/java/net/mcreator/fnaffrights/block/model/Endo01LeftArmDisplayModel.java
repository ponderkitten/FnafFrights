package net.mcreator.fnaffrights.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnaffrights.block.display.Endo01LeftArmDisplayItem;

public class Endo01LeftArmDisplayModel extends AnimatedGeoModel<Endo01LeftArmDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(Endo01LeftArmDisplayItem animatable) {
		return new ResourceLocation("fnaf_frights", "animations/endo01leftarm.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(Endo01LeftArmDisplayItem animatable) {
		return new ResourceLocation("fnaf_frights", "geo/endo01leftarm.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(Endo01LeftArmDisplayItem entity) {
		return new ResourceLocation("fnaf_frights", "textures/blocks/endo01.png");
	}
}
