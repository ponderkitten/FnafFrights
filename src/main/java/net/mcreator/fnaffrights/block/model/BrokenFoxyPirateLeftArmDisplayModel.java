package net.mcreator.fnaffrights.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnaffrights.block.display.BrokenFoxyPirateLeftArmDisplayItem;

public class BrokenFoxyPirateLeftArmDisplayModel extends AnimatedGeoModel<BrokenFoxyPirateLeftArmDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(BrokenFoxyPirateLeftArmDisplayItem animatable) {
		return new ResourceLocation("fnaf_frights", "animations/foxypirateleftarm.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(BrokenFoxyPirateLeftArmDisplayItem animatable) {
		return new ResourceLocation("fnaf_frights", "geo/foxypirateleftarm.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(BrokenFoxyPirateLeftArmDisplayItem entity) {
		return new ResourceLocation("fnaf_frights", "textures/blocks/foxy.png");
	}
}
