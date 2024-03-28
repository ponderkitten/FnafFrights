package net.mcreator.fnaffrights.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnaffrights.block.display.BonnieMaskBlockDisplayItem;

public class BonnieMaskBlockDisplayModel extends AnimatedGeoModel<BonnieMaskBlockDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(BonnieMaskBlockDisplayItem animatable) {
		return new ResourceLocation("fnaf_frights", "animations/bonniemask.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(BonnieMaskBlockDisplayItem animatable) {
		return new ResourceLocation("fnaf_frights", "geo/bonniemask.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(BonnieMaskBlockDisplayItem entity) {
		return new ResourceLocation("fnaf_frights", "textures/blocks/unwithered_bonnie.png");
	}
}
