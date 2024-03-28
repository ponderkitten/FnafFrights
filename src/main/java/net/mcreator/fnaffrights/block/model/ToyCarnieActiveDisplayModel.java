package net.mcreator.fnaffrights.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnaffrights.block.display.ToyCarnieActiveDisplayItem;

public class ToyCarnieActiveDisplayModel extends AnimatedGeoModel<ToyCarnieActiveDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(ToyCarnieActiveDisplayItem animatable) {
		return new ResourceLocation("fnaf_frights", "animations/toyfreddyshowtimeactive.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(ToyCarnieActiveDisplayItem animatable) {
		return new ResourceLocation("fnaf_frights", "geo/toyfreddyshowtimeactive.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(ToyCarnieActiveDisplayItem entity) {
		return new ResourceLocation("fnaf_frights", "textures/blocks/legallydistinctcarnie.png");
	}
}
