package net.mcreator.fnaffrights.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnaffrights.block.display.WitheredFoxyLegDisplayItem;

public class WitheredFoxyLegDisplayModel extends AnimatedGeoModel<WitheredFoxyLegDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(WitheredFoxyLegDisplayItem animatable) {
		return new ResourceLocation("fnaf_frights", "animations/foxy_leg.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(WitheredFoxyLegDisplayItem animatable) {
		return new ResourceLocation("fnaf_frights", "geo/foxy_leg.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(WitheredFoxyLegDisplayItem entity) {
		return new ResourceLocation("fnaf_frights", "textures/blocks/witheredfoxytexture.png");
	}
}
