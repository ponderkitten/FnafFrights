package net.mcreator.fnaffrights.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnaffrights.block.display.ToyBonnieShowtimeActiveDisplayItem;

public class ToyBonnieShowtimeActiveDisplayModel extends AnimatedGeoModel<ToyBonnieShowtimeActiveDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(ToyBonnieShowtimeActiveDisplayItem animatable) {
		return new ResourceLocation("fnaf_frights", "animations/toybonnieshowtimea.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(ToyBonnieShowtimeActiveDisplayItem animatable) {
		return new ResourceLocation("fnaf_frights", "geo/toybonnieshowtimea.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(ToyBonnieShowtimeActiveDisplayItem entity) {
		return new ResourceLocation("fnaf_frights", "textures/blocks/toy_bonnie.png");
	}
}
