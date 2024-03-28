package net.mcreator.fnaffrights.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnaffrights.block.entity.BlloonBoyStatueTileEntity;

public class BlloonBoyStatueBlockModel extends AnimatedGeoModel<BlloonBoyStatueTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(BlloonBoyStatueTileEntity animatable) {
		return new ResourceLocation("fnaf_frights", "animations/balloonboy.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(BlloonBoyStatueTileEntity animatable) {
		return new ResourceLocation("fnaf_frights", "geo/balloonboy.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(BlloonBoyStatueTileEntity entity) {
		return new ResourceLocation("fnaf_frights", "textures/blocks/balloonboytexture.png");
	}
}
