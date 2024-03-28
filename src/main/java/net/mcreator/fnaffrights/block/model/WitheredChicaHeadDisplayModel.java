package net.mcreator.fnaffrights.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnaffrights.block.display.WitheredChicaHeadDisplayItem;

public class WitheredChicaHeadDisplayModel extends AnimatedGeoModel<WitheredChicaHeadDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(WitheredChicaHeadDisplayItem animatable) {
		return new ResourceLocation("fnaf_frights", "animations/witheredchicahead.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(WitheredChicaHeadDisplayItem animatable) {
		return new ResourceLocation("fnaf_frights", "geo/witheredchicahead.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(WitheredChicaHeadDisplayItem entity) {
		return new ResourceLocation("fnaf_frights", "textures/blocks/witheredchicatexture.png");
	}
}
