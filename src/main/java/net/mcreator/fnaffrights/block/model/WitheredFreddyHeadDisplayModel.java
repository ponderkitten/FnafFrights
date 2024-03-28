package net.mcreator.fnaffrights.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnaffrights.block.display.WitheredFreddyHeadDisplayItem;

public class WitheredFreddyHeadDisplayModel extends AnimatedGeoModel<WitheredFreddyHeadDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(WitheredFreddyHeadDisplayItem animatable) {
		return new ResourceLocation("fnaf_frights", "animations/freddyhead.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(WitheredFreddyHeadDisplayItem animatable) {
		return new ResourceLocation("fnaf_frights", "geo/freddyhead.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(WitheredFreddyHeadDisplayItem entity) {
		return new ResourceLocation("fnaf_frights", "textures/blocks/witheredfreddytexture.png");
	}
}
