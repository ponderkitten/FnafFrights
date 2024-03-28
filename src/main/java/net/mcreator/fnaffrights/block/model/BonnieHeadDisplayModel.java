package net.mcreator.fnaffrights.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnaffrights.block.display.BonnieHeadDisplayItem;

public class BonnieHeadDisplayModel extends AnimatedGeoModel<BonnieHeadDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(BonnieHeadDisplayItem animatable) {
		return new ResourceLocation("fnaf_frights", "animations/bonniehead.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(BonnieHeadDisplayItem animatable) {
		return new ResourceLocation("fnaf_frights", "geo/bonniehead.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(BonnieHeadDisplayItem entity) {
		return new ResourceLocation("fnaf_frights", "textures/blocks/unwithered_bonnie.png");
	}
}
