package net.mcreator.fnaffrights.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnaffrights.block.display.WitheredGoldenFreddyLeftLegDisplayItem;

public class WitheredGoldenFreddyLeftLegDisplayModel extends AnimatedGeoModel<WitheredGoldenFreddyLeftLegDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(WitheredGoldenFreddyLeftLegDisplayItem animatable) {
		return new ResourceLocation("fnaf_frights", "animations/freddyleftleg.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(WitheredGoldenFreddyLeftLegDisplayItem animatable) {
		return new ResourceLocation("fnaf_frights", "geo/freddyleftleg.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(WitheredGoldenFreddyLeftLegDisplayItem entity) {
		return new ResourceLocation("fnaf_frights", "textures/blocks/witheredgoldenfreddytexture.png");
	}
}
