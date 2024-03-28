package net.mcreator.fnaffrights.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnaffrights.block.display.WitheredFoxyRightArmDisplayItem;

public class WitheredFoxyRightArmDisplayModel extends AnimatedGeoModel<WitheredFoxyRightArmDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(WitheredFoxyRightArmDisplayItem animatable) {
		return new ResourceLocation("fnaf_frights", "animations/foxyrightarm.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(WitheredFoxyRightArmDisplayItem animatable) {
		return new ResourceLocation("fnaf_frights", "geo/foxyrightarm.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(WitheredFoxyRightArmDisplayItem entity) {
		return new ResourceLocation("fnaf_frights", "textures/blocks/witheredfoxyhook.png");
	}
}
