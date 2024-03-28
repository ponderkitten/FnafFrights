package net.mcreator.fnaffrights.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnaffrights.block.entity.ABonnieBunnyActiveTileEntity;

public class ABonnieBunnyActiveBlockModel extends AnimatedGeoModel<ABonnieBunnyActiveTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(ABonnieBunnyActiveTileEntity animatable) {
		return new ResourceLocation("fnaf_frights", "animations/abonniebunnieshowtimeactive.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(ABonnieBunnyActiveTileEntity animatable) {
		return new ResourceLocation("fnaf_frights", "geo/abonniebunnieshowtimeactive.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(ABonnieBunnyActiveTileEntity entity) {
		return new ResourceLocation("fnaf_frights", "textures/blocks/bonnie_the_bunny.png");
	}
}
