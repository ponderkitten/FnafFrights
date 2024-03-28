package net.mcreator.fnaffrights.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnaffrights.block.display.BonnieRightArmDisplayItem;

public class BonnieRightArmDisplayModel extends AnimatedGeoModel<BonnieRightArmDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(BonnieRightArmDisplayItem animatable) {
		return new ResourceLocation("fnaf_frights", "animations/bonnierightarm.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(BonnieRightArmDisplayItem animatable) {
		return new ResourceLocation("fnaf_frights", "geo/bonnierightarm.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(BonnieRightArmDisplayItem entity) {
		return new ResourceLocation("fnaf_frights", "textures/blocks/unwithered_bonnie.png");
	}
}
