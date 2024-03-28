package net.mcreator.fnaffrights.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnaffrights.block.display.FoxyBlockDisplayItem;

public class FoxyBlockDisplayModel extends AnimatedGeoModel<FoxyBlockDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(FoxyBlockDisplayItem animatable) {
		return new ResourceLocation("fnaf_frights", "animations/witheredfoxyblock.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(FoxyBlockDisplayItem animatable) {
		return new ResourceLocation("fnaf_frights", "geo/witheredfoxyblock.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(FoxyBlockDisplayItem entity) {
		return new ResourceLocation("fnaf_frights", "textures/blocks/unwithered_foxy.png");
	}
}
