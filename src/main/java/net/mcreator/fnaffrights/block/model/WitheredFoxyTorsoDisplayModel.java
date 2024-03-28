package net.mcreator.fnaffrights.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnaffrights.block.display.WitheredFoxyTorsoDisplayItem;

public class WitheredFoxyTorsoDisplayModel extends AnimatedGeoModel<WitheredFoxyTorsoDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(WitheredFoxyTorsoDisplayItem animatable) {
		return new ResourceLocation("fnaf_frights", "animations/foxy_torso.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(WitheredFoxyTorsoDisplayItem animatable) {
		return new ResourceLocation("fnaf_frights", "geo/foxy_torso.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(WitheredFoxyTorsoDisplayItem entity) {
		return new ResourceLocation("fnaf_frights", "textures/blocks/witheredfoxytexture.png");
	}
}
