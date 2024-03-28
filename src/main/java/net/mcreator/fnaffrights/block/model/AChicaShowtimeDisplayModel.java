package net.mcreator.fnaffrights.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnaffrights.block.display.AChicaShowtimeDisplayItem;

public class AChicaShowtimeDisplayModel extends AnimatedGeoModel<AChicaShowtimeDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(AChicaShowtimeDisplayItem animatable) {
		return new ResourceLocation("fnaf_frights", "animations/achicashowtime.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(AChicaShowtimeDisplayItem animatable) {
		return new ResourceLocation("fnaf_frights", "geo/achicashowtime.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(AChicaShowtimeDisplayItem entity) {
		return new ResourceLocation("fnaf_frights", "textures/blocks/unwithered_chica.png");
	}
}
