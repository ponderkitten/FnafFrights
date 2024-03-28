package net.mcreator.fnaffrights.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnaffrights.block.display.Endo01HeadDisplayItem;

public class Endo01HeadDisplayModel extends AnimatedGeoModel<Endo01HeadDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(Endo01HeadDisplayItem animatable) {
		return new ResourceLocation("fnaf_frights", "animations/endo01head.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(Endo01HeadDisplayItem animatable) {
		return new ResourceLocation("fnaf_frights", "geo/endo01head.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(Endo01HeadDisplayItem entity) {
		return new ResourceLocation("fnaf_frights", "textures/blocks/endo01.png");
	}
}
