package net.mcreator.fnaffrights.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnaffrights.block.entity.ToyFreddyLeftArmTileEntity;

public class ToyFreddyLeftArmBlockModel extends AnimatedGeoModel<ToyFreddyLeftArmTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(ToyFreddyLeftArmTileEntity animatable) {
		return new ResourceLocation("fnaf_frights", "animations/toyfreddyleftarm.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(ToyFreddyLeftArmTileEntity animatable) {
		return new ResourceLocation("fnaf_frights", "geo/toyfreddyleftarm.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(ToyFreddyLeftArmTileEntity entity) {
		return new ResourceLocation("fnaf_frights", "textures/blocks/toy_freddy.png");
	}
}
