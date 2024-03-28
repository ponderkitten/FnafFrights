package net.mcreator.fnaffrights.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnaffrights.block.display.ChristmasChicaDisplayItem;

public class ChristmasChicaDisplayModel extends AnimatedGeoModel<ChristmasChicaDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(ChristmasChicaDisplayItem animatable) {
		return new ResourceLocation("fnaf_frights", "animations/christmaschicashowtime.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(ChristmasChicaDisplayItem animatable) {
		return new ResourceLocation("fnaf_frights", "geo/christmaschicashowtime.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(ChristmasChicaDisplayItem entity) {
		return new ResourceLocation("fnaf_frights", "textures/blocks/christmaschica.png");
	}
}
