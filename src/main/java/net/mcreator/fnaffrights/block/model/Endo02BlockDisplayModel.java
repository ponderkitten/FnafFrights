package net.mcreator.fnaffrights.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnaffrights.block.display.Endo02BlockDisplayItem;

public class Endo02BlockDisplayModel extends AnimatedGeoModel<Endo02BlockDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(Endo02BlockDisplayItem animatable) {
		return new ResourceLocation("fnaf_frights", "animations/witheredfreddyblock.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(Endo02BlockDisplayItem animatable) {
		return new ResourceLocation("fnaf_frights", "geo/witheredfreddyblock.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(Endo02BlockDisplayItem entity) {
		return new ResourceLocation("fnaf_frights", "textures/blocks/endo02.png");
	}
}
