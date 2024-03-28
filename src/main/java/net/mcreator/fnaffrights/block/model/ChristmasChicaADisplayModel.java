package net.mcreator.fnaffrights.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnaffrights.block.display.ChristmasChicaADisplayItem;

public class ChristmasChicaADisplayModel extends AnimatedGeoModel<ChristmasChicaADisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(ChristmasChicaADisplayItem animatable) {
		return new ResourceLocation("fnaf_frights", "animations/christmaschicaactive.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(ChristmasChicaADisplayItem animatable) {
		return new ResourceLocation("fnaf_frights", "geo/christmaschicaactive.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(ChristmasChicaADisplayItem entity) {
		return new ResourceLocation("fnaf_frights", "textures/blocks/christmaschica.png");
	}
}
