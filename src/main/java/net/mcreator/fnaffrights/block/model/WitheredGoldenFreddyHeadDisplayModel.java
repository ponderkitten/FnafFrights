package net.mcreator.fnaffrights.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnaffrights.block.display.WitheredGoldenFreddyHeadDisplayItem;

public class WitheredGoldenFreddyHeadDisplayModel extends AnimatedGeoModel<WitheredGoldenFreddyHeadDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(WitheredGoldenFreddyHeadDisplayItem animatable) {
		return new ResourceLocation("fnaf_frights", "animations/freddyhead.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(WitheredGoldenFreddyHeadDisplayItem animatable) {
		return new ResourceLocation("fnaf_frights", "geo/freddyhead.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(WitheredGoldenFreddyHeadDisplayItem entity) {
		return new ResourceLocation("fnaf_frights", "textures/blocks/witheredgoldenfreddytexture.png");
	}
}
