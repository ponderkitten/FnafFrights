package net.mcreator.fnaffrights.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnaffrights.block.display.WitheredChicaRightArmDisplayItem;

public class WitheredChicaRightArmDisplayModel extends AnimatedGeoModel<WitheredChicaRightArmDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(WitheredChicaRightArmDisplayItem animatable) {
		return new ResourceLocation("fnaf_frights", "animations/witheredchicarightarm.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(WitheredChicaRightArmDisplayItem animatable) {
		return new ResourceLocation("fnaf_frights", "geo/witheredchicarightarm.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(WitheredChicaRightArmDisplayItem entity) {
		return new ResourceLocation("fnaf_frights", "textures/blocks/witheredchicatexture.png");
	}
}
