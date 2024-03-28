package net.mcreator.fnaffrights.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnaffrights.block.entity.OffsetSpringBonnieShowtimeTileEntity;

public class OffsetSpringBonnieShowtimeBlockModel extends AnimatedGeoModel<OffsetSpringBonnieShowtimeTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(OffsetSpringBonnieShowtimeTileEntity animatable) {
		return new ResourceLocation("fnaf_frights", "animations/ospringbonnieshowtime.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(OffsetSpringBonnieShowtimeTileEntity animatable) {
		return new ResourceLocation("fnaf_frights", "geo/ospringbonnieshowtime.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(OffsetSpringBonnieShowtimeTileEntity entity) {
		return new ResourceLocation("fnaf_frights", "textures/blocks/springbonnie.png");
	}
}
