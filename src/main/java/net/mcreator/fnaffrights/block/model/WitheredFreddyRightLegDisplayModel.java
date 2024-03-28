package net.mcreator.fnaffrights.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnaffrights.block.display.WitheredFreddyRightLegDisplayItem;

public class WitheredFreddyRightLegDisplayModel extends AnimatedGeoModel<WitheredFreddyRightLegDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(WitheredFreddyRightLegDisplayItem animatable) {
		return new ResourceLocation("fnaf_frights", "animations/freddyrightleg.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(WitheredFreddyRightLegDisplayItem animatable) {
		return new ResourceLocation("fnaf_frights", "geo/freddyrightleg.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(WitheredFreddyRightLegDisplayItem entity) {
		return new ResourceLocation("fnaf_frights", "textures/blocks/witheredfreddytexture.png");
	}
}
