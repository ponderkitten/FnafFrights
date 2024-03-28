package net.mcreator.fnaffrights.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnaffrights.block.entity.AngledBlloonBoyStatueTileEntity;

public class AngledBlloonBoyStatueBlockModel extends AnimatedGeoModel<AngledBlloonBoyStatueTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(AngledBlloonBoyStatueTileEntity animatable) {
		return new ResourceLocation("fnaf_frights", "animations/aballoonboy.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(AngledBlloonBoyStatueTileEntity animatable) {
		return new ResourceLocation("fnaf_frights", "geo/aballoonboy.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(AngledBlloonBoyStatueTileEntity entity) {
		return new ResourceLocation("fnaf_frights", "textures/blocks/balloonboytexture.png");
	}
}
