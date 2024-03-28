package net.mcreator.fnaffrights.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnaffrights.block.entity.ASpringBonnieBunnieActiveTileEntity;

public class ASpringBonnieBunnieActiveBlockModel extends AnimatedGeoModel<ASpringBonnieBunnieActiveTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(ASpringBonnieBunnieActiveTileEntity animatable) {
		return new ResourceLocation("fnaf_frights", "animations/abonniebunnieshowtimeactive.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(ASpringBonnieBunnieActiveTileEntity animatable) {
		return new ResourceLocation("fnaf_frights", "geo/abonniebunnieshowtimeactive.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(ASpringBonnieBunnieActiveTileEntity entity) {
		return new ResourceLocation("fnaf_frights", "textures/blocks/spring_bonnie_fnaf1.png");
	}
}
