package net.mcreator.fnaffrights.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnaffrights.block.display.PizzeriaSignDisplayItem;

public class PizzeriaSignDisplayModel extends AnimatedGeoModel<PizzeriaSignDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(PizzeriaSignDisplayItem animatable) {
		return new ResourceLocation("fnaf_frights", "animations/pizzeriasign.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(PizzeriaSignDisplayItem animatable) {
		return new ResourceLocation("fnaf_frights", "geo/pizzeriasign.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(PizzeriaSignDisplayItem entity) {
		return new ResourceLocation("fnaf_frights", "textures/blocks/movie_sign.png");
	}
}
