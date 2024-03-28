package net.mcreator.fnaffrights.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnaffrights.block.display.WitheredChicaBlockDisplayItem;

public class WitheredChicaBlockDisplayModel extends AnimatedGeoModel<WitheredChicaBlockDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(WitheredChicaBlockDisplayItem animatable) {
		return new ResourceLocation("fnaf_frights", "animations/witheredchicablock.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(WitheredChicaBlockDisplayItem animatable) {
		return new ResourceLocation("fnaf_frights", "geo/witheredchicablock.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(WitheredChicaBlockDisplayItem entity) {
		return new ResourceLocation("fnaf_frights", "textures/blocks/witheredchicatexture.png");
	}
}
