package net.mcreator.fnaffrights.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnaffrights.block.display.FoxyRightArmDisplayItem;

public class FoxyRightArmDisplayModel extends AnimatedGeoModel<FoxyRightArmDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(FoxyRightArmDisplayItem animatable) {
		return new ResourceLocation("fnaf_frights", "animations/foxyrightarm.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(FoxyRightArmDisplayItem animatable) {
		return new ResourceLocation("fnaf_frights", "geo/foxyrightarm.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(FoxyRightArmDisplayItem entity) {
		return new ResourceLocation("fnaf_frights", "textures/blocks/foxy_left_arm.png");
	}
}
