package net.mcreator.fnaffrights.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnaffrights.block.display.ClassicChicaShowtimeActiveDisplayItem;

public class ClassicChicaShowtimeActiveDisplayModel extends AnimatedGeoModel<ClassicChicaShowtimeActiveDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(ClassicChicaShowtimeActiveDisplayItem animatable) {
		return new ResourceLocation("fnaf_frights", "animations/classicchicashowtimeactive.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(ClassicChicaShowtimeActiveDisplayItem animatable) {
		return new ResourceLocation("fnaf_frights", "geo/classicchicashowtimeactive.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(ClassicChicaShowtimeActiveDisplayItem entity) {
		return new ResourceLocation("fnaf_frights", "textures/blocks/chica.png");
	}
}
