package net.mcreator.fnaffrights.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnaffrights.block.display.Endo01RightArmDisplayItem;

public class Endo01RightArmDisplayModel extends AnimatedGeoModel<Endo01RightArmDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(Endo01RightArmDisplayItem animatable) {
		return new ResourceLocation("fnaf_frights", "animations/endo01rightarm.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(Endo01RightArmDisplayItem animatable) {
		return new ResourceLocation("fnaf_frights", "geo/endo01rightarm.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(Endo01RightArmDisplayItem entity) {
		return new ResourceLocation("fnaf_frights", "textures/blocks/endo01.png");
	}
}
