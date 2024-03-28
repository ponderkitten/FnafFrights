package net.mcreator.fnaffrights.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnaffrights.block.display.BlloonBoyStatueDisplayItem;

public class BlloonBoyStatueDisplayModel extends AnimatedGeoModel<BlloonBoyStatueDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(BlloonBoyStatueDisplayItem animatable) {
		return new ResourceLocation("fnaf_frights", "animations/balloonboy.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(BlloonBoyStatueDisplayItem animatable) {
		return new ResourceLocation("fnaf_frights", "geo/balloonboy.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(BlloonBoyStatueDisplayItem entity) {
		return new ResourceLocation("fnaf_frights", "textures/blocks/balloonboytexture.png");
	}
}
