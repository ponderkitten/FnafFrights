package net.mcreator.fnaffrights.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnaffrights.block.entity.OffsetSpringBonnieActiveTileEntity;

public class OffsetSpringBonnieActiveBlockModel extends AnimatedGeoModel<OffsetSpringBonnieActiveTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(OffsetSpringBonnieActiveTileEntity animatable) {
		return new ResourceLocation("fnaf_frights", "animations/ospringbonnieshowtimeactive.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(OffsetSpringBonnieActiveTileEntity animatable) {
		return new ResourceLocation("fnaf_frights", "geo/ospringbonnieshowtimeactive.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(OffsetSpringBonnieActiveTileEntity entity) {
		return new ResourceLocation("fnaf_frights", "textures/blocks/springbonnie.png");
	}
}
