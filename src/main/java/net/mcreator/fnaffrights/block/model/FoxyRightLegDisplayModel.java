package net.mcreator.fnaffrights.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnaffrights.block.display.FoxyRightLegDisplayItem;

public class FoxyRightLegDisplayModel extends AnimatedGeoModel<FoxyRightLegDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(FoxyRightLegDisplayItem animatable) {
		return new ResourceLocation("fnaf_frights", "animations/foxyrleg.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(FoxyRightLegDisplayItem animatable) {
		return new ResourceLocation("fnaf_frights", "geo/foxyrleg.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(FoxyRightLegDisplayItem entity) {
		return new ResourceLocation("fnaf_frights", "textures/blocks/unwithered_foxy.png");
	}
}
