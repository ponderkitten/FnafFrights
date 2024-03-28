package net.mcreator.fnaffrights.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnaffrights.block.display.BrokenFoxyPirateRightArmDisplayItem;

public class BrokenFoxyPirateRightArmDisplayModel extends AnimatedGeoModel<BrokenFoxyPirateRightArmDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(BrokenFoxyPirateRightArmDisplayItem animatable) {
		return new ResourceLocation("fnaf_frights", "animations/foxypiraterightarm.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(BrokenFoxyPirateRightArmDisplayItem animatable) {
		return new ResourceLocation("fnaf_frights", "geo/foxypiraterightarm.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(BrokenFoxyPirateRightArmDisplayItem entity) {
		return new ResourceLocation("fnaf_frights", "textures/blocks/foxy.png");
	}
}
