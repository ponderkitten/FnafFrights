package net.mcreator.fnaffrights.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnaffrights.block.display.DinerChicaShowtimeDisplayItem;

public class DinerChicaShowtimeDisplayModel extends AnimatedGeoModel<DinerChicaShowtimeDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(DinerChicaShowtimeDisplayItem animatable) {
		return new ResourceLocation("fnaf_frights", "animations/showtimedinerchica.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(DinerChicaShowtimeDisplayItem animatable) {
		return new ResourceLocation("fnaf_frights", "geo/showtimedinerchica.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(DinerChicaShowtimeDisplayItem entity) {
		return new ResourceLocation("fnaf_frights", "textures/blocks/dinerchica.png");
	}
}
