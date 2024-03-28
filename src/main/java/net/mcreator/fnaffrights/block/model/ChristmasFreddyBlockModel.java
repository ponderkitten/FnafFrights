package net.mcreator.fnaffrights.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnaffrights.block.entity.ChristmasFreddyTileEntity;

public class ChristmasFreddyBlockModel extends AnimatedGeoModel<ChristmasFreddyTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(ChristmasFreddyTileEntity animatable) {
		return new ResourceLocation("fnaf_frights", "animations/christmasfreddy.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(ChristmasFreddyTileEntity animatable) {
		return new ResourceLocation("fnaf_frights", "geo/christmasfreddy.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(ChristmasFreddyTileEntity entity) {
		return new ResourceLocation("fnaf_frights", "textures/blocks/christmasfreddy.png");
	}
}
