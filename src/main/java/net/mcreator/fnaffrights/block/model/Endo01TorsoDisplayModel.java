package net.mcreator.fnaffrights.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnaffrights.block.display.Endo01TorsoDisplayItem;

public class Endo01TorsoDisplayModel extends AnimatedGeoModel<Endo01TorsoDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(Endo01TorsoDisplayItem animatable) {
		return new ResourceLocation("fnaf_frights", "animations/endo01torso.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(Endo01TorsoDisplayItem animatable) {
		return new ResourceLocation("fnaf_frights", "geo/endo01torso.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(Endo01TorsoDisplayItem entity) {
		return new ResourceLocation("fnaf_frights", "textures/blocks/endo01.png");
	}
}
