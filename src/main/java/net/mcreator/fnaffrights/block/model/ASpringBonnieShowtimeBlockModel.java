package net.mcreator.fnaffrights.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnaffrights.block.entity.ASpringBonnieShowtimeTileEntity;

public class ASpringBonnieShowtimeBlockModel extends AnimatedGeoModel<ASpringBonnieShowtimeTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(ASpringBonnieShowtimeTileEntity animatable) {
		return new ResourceLocation("fnaf_frights", "animations/aspringbonnieshowtime.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(ASpringBonnieShowtimeTileEntity animatable) {
		return new ResourceLocation("fnaf_frights", "geo/aspringbonnieshowtime.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(ASpringBonnieShowtimeTileEntity entity) {
		return new ResourceLocation("fnaf_frights", "textures/blocks/springbonnie.png");
	}
}
