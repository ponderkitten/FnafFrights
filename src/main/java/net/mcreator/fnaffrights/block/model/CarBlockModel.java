package net.mcreator.fnaffrights.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnaffrights.block.entity.CarTileEntity;

public class CarBlockModel extends AnimatedGeoModel<CarTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(CarTileEntity animatable) {
		return new ResourceLocation("fnaf_frights", "animations/off_roader_body.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(CarTileEntity animatable) {
		return new ResourceLocation("fnaf_frights", "geo/off_roader_body.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(CarTileEntity entity) {
		return new ResourceLocation("fnaf_frights", "textures/blocks/truck.png");
	}
}
