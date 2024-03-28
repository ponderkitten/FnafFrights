package net.mcreator.fnaffrights.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnaffrights.block.display.ClassicChicaShowtimeDisplayItem;

public class ClassicChicaShowtimeDisplayModel extends AnimatedGeoModel<ClassicChicaShowtimeDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(ClassicChicaShowtimeDisplayItem animatable) {
		return new ResourceLocation("fnaf_frights", "animations/classicchicashowtime.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(ClassicChicaShowtimeDisplayItem animatable) {
		return new ResourceLocation("fnaf_frights", "geo/classicchicashowtime.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(ClassicChicaShowtimeDisplayItem entity) {
		return new ResourceLocation("fnaf_frights", "textures/blocks/chica.png");
	}
}
