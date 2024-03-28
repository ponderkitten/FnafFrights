package net.mcreator.fnaffrights.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnaffrights.block.display.WitheredFreddyLeftLegDisplayItem;

public class WitheredFreddyLeftLegDisplayModel extends AnimatedGeoModel<WitheredFreddyLeftLegDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(WitheredFreddyLeftLegDisplayItem animatable) {
		return new ResourceLocation("fnaf_frights", "animations/freddyleftleg.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(WitheredFreddyLeftLegDisplayItem animatable) {
		return new ResourceLocation("fnaf_frights", "geo/freddyleftleg.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(WitheredFreddyLeftLegDisplayItem entity) {
		return new ResourceLocation("fnaf_frights", "textures/blocks/witheredfreddytexture.png");
	}
}
