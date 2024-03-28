package net.mcreator.fnaffrights.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnaffrights.block.display.WitheredGoldenFreddyTorsoDisplayItem;

public class WitheredGoldenFreddyTorsoDisplayModel extends AnimatedGeoModel<WitheredGoldenFreddyTorsoDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(WitheredGoldenFreddyTorsoDisplayItem animatable) {
		return new ResourceLocation("fnaf_frights", "animations/freddytorso.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(WitheredGoldenFreddyTorsoDisplayItem animatable) {
		return new ResourceLocation("fnaf_frights", "geo/freddytorso.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(WitheredGoldenFreddyTorsoDisplayItem entity) {
		return new ResourceLocation("fnaf_frights", "textures/blocks/witheredgoldenfreddytexture.png");
	}
}
