package net.mcreator.fnaffrights.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnaffrights.block.display.BonnieShowtimeActiveDisplayItem;

public class BonnieShowtimeActiveDisplayModel extends AnimatedGeoModel<BonnieShowtimeActiveDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(BonnieShowtimeActiveDisplayItem animatable) {
		return new ResourceLocation("fnaf_frights", "animations/bonnieshowtimeactive.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(BonnieShowtimeActiveDisplayItem animatable) {
		return new ResourceLocation("fnaf_frights", "geo/bonnieshowtimeactive.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(BonnieShowtimeActiveDisplayItem entity) {
		return new ResourceLocation("fnaf_frights", "textures/blocks/unwithered_bonnie.png");
	}
}
