package net.mcreator.fnaffrights.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnaffrights.block.entity.ASpringBonnieActiveTileEntity;

public class ASpringBonnieActiveBlockModel extends AnimatedGeoModel<ASpringBonnieActiveTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(ASpringBonnieActiveTileEntity animatable) {
		return new ResourceLocation("fnaf_frights", "animations/aspringbonnieshowtimeactive.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(ASpringBonnieActiveTileEntity animatable) {
		return new ResourceLocation("fnaf_frights", "geo/aspringbonnieshowtimeactive.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(ASpringBonnieActiveTileEntity entity) {
		return new ResourceLocation("fnaf_frights", "textures/blocks/springbonnie.png");
	}
}
