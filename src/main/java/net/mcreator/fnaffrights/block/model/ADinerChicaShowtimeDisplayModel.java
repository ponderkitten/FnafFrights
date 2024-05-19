package net.mcreator.fnaffrights.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnaffrights.block.display.ADinerChicaShowtimeDisplayItem;

public class ADinerChicaShowtimeDisplayModel extends AnimatedGeoModel<ADinerChicaShowtimeDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(ADinerChicaShowtimeDisplayItem animatable) {
		return new ResourceLocation("fnaf_frights", "animations/ashowtimedinerchica.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(ADinerChicaShowtimeDisplayItem animatable) {
		return new ResourceLocation("fnaf_frights", "geo/ashowtimedinerchica.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(ADinerChicaShowtimeDisplayItem entity) {
		return new ResourceLocation("fnaf_frights", "textures/blocks/dinerchica.png");
	}
}
