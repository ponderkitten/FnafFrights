package net.mcreator.fnaffrights.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnaffrights.block.display.WitheredFreddyTorsoDisplayItem;

public class WitheredFreddyTorsoDisplayModel extends AnimatedGeoModel<WitheredFreddyTorsoDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(WitheredFreddyTorsoDisplayItem animatable) {
		return new ResourceLocation("fnaf_frights", "animations/freddytorso.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(WitheredFreddyTorsoDisplayItem animatable) {
		return new ResourceLocation("fnaf_frights", "geo/freddytorso.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(WitheredFreddyTorsoDisplayItem entity) {
		return new ResourceLocation("fnaf_frights", "textures/blocks/witheredfreddytexture.png");
	}
}
