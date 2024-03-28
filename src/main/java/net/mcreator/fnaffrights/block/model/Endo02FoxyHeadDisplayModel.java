package net.mcreator.fnaffrights.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnaffrights.block.display.Endo02FoxyHeadDisplayItem;

public class Endo02FoxyHeadDisplayModel extends AnimatedGeoModel<Endo02FoxyHeadDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(Endo02FoxyHeadDisplayItem animatable) {
		return new ResourceLocation("fnaf_frights", "animations/endo02foxy.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(Endo02FoxyHeadDisplayItem animatable) {
		return new ResourceLocation("fnaf_frights", "geo/endo02foxy.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(Endo02FoxyHeadDisplayItem entity) {
		return new ResourceLocation("fnaf_frights", "textures/blocks/unwithered_foxy.png");
	}
}
