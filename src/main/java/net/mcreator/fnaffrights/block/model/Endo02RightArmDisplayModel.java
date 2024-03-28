package net.mcreator.fnaffrights.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnaffrights.block.display.Endo02RightArmDisplayItem;

public class Endo02RightArmDisplayModel extends AnimatedGeoModel<Endo02RightArmDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(Endo02RightArmDisplayItem animatable) {
		return new ResourceLocation("fnaf_frights", "animations/freddyrightarm.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(Endo02RightArmDisplayItem animatable) {
		return new ResourceLocation("fnaf_frights", "geo/freddyrightarm.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(Endo02RightArmDisplayItem entity) {
		return new ResourceLocation("fnaf_frights", "textures/blocks/endo02.png");
	}
}
