package net.mcreator.fnaffrights.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnaffrights.block.display.WitheredGoldenFreddyRightLegDisplayItem;

public class WitheredGoldenFreddyRightLegDisplayModel extends AnimatedGeoModel<WitheredGoldenFreddyRightLegDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(WitheredGoldenFreddyRightLegDisplayItem animatable) {
		return new ResourceLocation("fnaf_frights", "animations/freddyrightleg.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(WitheredGoldenFreddyRightLegDisplayItem animatable) {
		return new ResourceLocation("fnaf_frights", "geo/freddyrightleg.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(WitheredGoldenFreddyRightLegDisplayItem entity) {
		return new ResourceLocation("fnaf_frights", "textures/blocks/witheredgoldenfreddytexture.png");
	}
}
