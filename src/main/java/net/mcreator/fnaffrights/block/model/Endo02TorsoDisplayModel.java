package net.mcreator.fnaffrights.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnaffrights.block.display.Endo02TorsoDisplayItem;

public class Endo02TorsoDisplayModel extends AnimatedGeoModel<Endo02TorsoDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(Endo02TorsoDisplayItem animatable) {
		return new ResourceLocation("fnaf_frights", "animations/freddytorso.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(Endo02TorsoDisplayItem animatable) {
		return new ResourceLocation("fnaf_frights", "geo/freddytorso.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(Endo02TorsoDisplayItem entity) {
		return new ResourceLocation("fnaf_frights", "textures/blocks/endo02.png");
	}
}
