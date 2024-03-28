package net.mcreator.fnaffrights.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnaffrights.block.entity.ChristmasFreddyATileEntity;

public class ChristmasFreddyABlockModel extends AnimatedGeoModel<ChristmasFreddyATileEntity> {
	@Override
	public ResourceLocation getAnimationResource(ChristmasFreddyATileEntity animatable) {
		return new ResourceLocation("fnaf_frights", "animations/christmasfreddyactive.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(ChristmasFreddyATileEntity animatable) {
		return new ResourceLocation("fnaf_frights", "geo/christmasfreddyactive.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(ChristmasFreddyATileEntity entity) {
		return new ResourceLocation("fnaf_frights", "textures/blocks/suit_combine.png");
	}
}
