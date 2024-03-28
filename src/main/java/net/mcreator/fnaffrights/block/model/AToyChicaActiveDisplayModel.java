package net.mcreator.fnaffrights.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnaffrights.block.display.AToyChicaActiveDisplayItem;

public class AToyChicaActiveDisplayModel extends AnimatedGeoModel<AToyChicaActiveDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(AToyChicaActiveDisplayItem animatable) {
		return new ResourceLocation("fnaf_frights", "animations/atoychicashowtimeactive.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(AToyChicaActiveDisplayItem animatable) {
		return new ResourceLocation("fnaf_frights", "geo/atoychicashowtimeactive.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(AToyChicaActiveDisplayItem entity) {
		return new ResourceLocation("fnaf_frights", "textures/blocks/toy_chica.png");
	}
}
