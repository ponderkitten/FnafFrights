package net.mcreator.fnaffrights.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnaffrights.block.entity.ToyFoxyRightArmTileEntity;

public class ToyFoxyRightArmBlockModel extends AnimatedGeoModel<ToyFoxyRightArmTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(ToyFoxyRightArmTileEntity animatable) {
		return new ResourceLocation("fnaf_frights", "animations/toyfoxyrightarm.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(ToyFoxyRightArmTileEntity animatable) {
		return new ResourceLocation("fnaf_frights", "geo/toyfoxyrightarm.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(ToyFoxyRightArmTileEntity entity) {
		return new ResourceLocation("fnaf_frights", "textures/blocks/toy_foxy.png");
	}
}
