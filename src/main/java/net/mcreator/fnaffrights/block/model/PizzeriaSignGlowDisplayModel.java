package net.mcreator.fnaffrights.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnaffrights.block.display.PizzeriaSignGlowDisplayItem;

public class PizzeriaSignGlowDisplayModel extends AnimatedGeoModel<PizzeriaSignGlowDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(PizzeriaSignGlowDisplayItem animatable) {
		return new ResourceLocation("fnaf_frights", "animations/pizzeriasign.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(PizzeriaSignGlowDisplayItem animatable) {
		return new ResourceLocation("fnaf_frights", "geo/pizzeriasign.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(PizzeriaSignGlowDisplayItem entity) {
		return new ResourceLocation("fnaf_frights", "textures/blocks/movie_sign_glow.png");
	}
}
