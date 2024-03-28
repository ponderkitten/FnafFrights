package net.mcreator.fnaffrights.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnaffrights.block.display.WitheredChicaRightLegDisplayItem;

public class WitheredChicaRightLegDisplayModel extends AnimatedGeoModel<WitheredChicaRightLegDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(WitheredChicaRightLegDisplayItem animatable) {
		return new ResourceLocation("fnaf_frights", "animations/witheredchicarightleg.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(WitheredChicaRightLegDisplayItem animatable) {
		return new ResourceLocation("fnaf_frights", "geo/witheredchicarightleg.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(WitheredChicaRightLegDisplayItem entity) {
		return new ResourceLocation("fnaf_frights", "textures/blocks/witheredchicatexture.png");
	}
}
