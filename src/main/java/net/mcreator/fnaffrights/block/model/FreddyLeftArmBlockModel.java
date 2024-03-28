package net.mcreator.fnaffrights.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnaffrights.block.entity.FreddyLeftArmTileEntity;

public class FreddyLeftArmBlockModel extends AnimatedGeoModel<FreddyLeftArmTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(FreddyLeftArmTileEntity animatable) {
		return new ResourceLocation("fnaf_frights", "animations/freddyleftarm.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(FreddyLeftArmTileEntity animatable) {
		return new ResourceLocation("fnaf_frights", "geo/freddyleftarm.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(FreddyLeftArmTileEntity entity) {
		return new ResourceLocation("fnaf_frights", "textures/blocks/unwithered_freddy.png");
	}
}
