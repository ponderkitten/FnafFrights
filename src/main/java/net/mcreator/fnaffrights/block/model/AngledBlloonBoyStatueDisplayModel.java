package net.mcreator.fnaffrights.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnaffrights.block.display.AngledBlloonBoyStatueDisplayItem;

public class AngledBlloonBoyStatueDisplayModel extends AnimatedGeoModel<AngledBlloonBoyStatueDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(AngledBlloonBoyStatueDisplayItem animatable) {
		return new ResourceLocation("fnaf_frights", "animations/aballoonboy.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(AngledBlloonBoyStatueDisplayItem animatable) {
		return new ResourceLocation("fnaf_frights", "geo/aballoonboy.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(AngledBlloonBoyStatueDisplayItem entity) {
		return new ResourceLocation("fnaf_frights", "textures/blocks/balloonboytexture.png");
	}
}
