package net.mcreator.fnaffrights.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnaffrights.block.display.BloodchicaAnimatedblockDisplayItem;

public class BloodchicaAnimatedblockDisplayModel extends AnimatedGeoModel<BloodchicaAnimatedblockDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(BloodchicaAnimatedblockDisplayItem animatable) {
		return new ResourceLocation("fnaf_frights", "animations/bloodchica.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(BloodchicaAnimatedblockDisplayItem animatable) {
		return new ResourceLocation("fnaf_frights", "geo/bloodchica.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(BloodchicaAnimatedblockDisplayItem entity) {
		return new ResourceLocation("fnaf_frights", "textures/blocks/bloodchica.png");
	}
}
