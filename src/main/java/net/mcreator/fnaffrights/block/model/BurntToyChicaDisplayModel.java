package net.mcreator.fnaffrights.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnaffrights.block.display.BurntToyChicaDisplayItem;

public class BurntToyChicaDisplayModel extends AnimatedGeoModel<BurntToyChicaDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(BurntToyChicaDisplayItem animatable) {
		return new ResourceLocation("fnaf_frights", "animations/burnttoychica.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(BurntToyChicaDisplayItem animatable) {
		return new ResourceLocation("fnaf_frights", "geo/burnttoychica.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(BurntToyChicaDisplayItem entity) {
		return new ResourceLocation("fnaf_frights", "textures/blocks/burnt_toychica.png");
	}
}
