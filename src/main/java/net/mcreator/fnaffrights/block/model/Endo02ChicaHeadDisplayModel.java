package net.mcreator.fnaffrights.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnaffrights.block.display.Endo02ChicaHeadDisplayItem;

public class Endo02ChicaHeadDisplayModel extends AnimatedGeoModel<Endo02ChicaHeadDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(Endo02ChicaHeadDisplayItem animatable) {
		return new ResourceLocation("fnaf_frights", "animations/endo02chica.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(Endo02ChicaHeadDisplayItem animatable) {
		return new ResourceLocation("fnaf_frights", "geo/endo02chica.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(Endo02ChicaHeadDisplayItem entity) {
		return new ResourceLocation("fnaf_frights", "textures/blocks/unwithered_chica.png");
	}
}
