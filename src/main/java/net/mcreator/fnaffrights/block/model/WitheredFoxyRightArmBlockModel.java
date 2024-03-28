package net.mcreator.fnaffrights.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnaffrights.block.entity.WitheredFoxyRightArmTileEntity;

public class WitheredFoxyRightArmBlockModel extends AnimatedGeoModel<WitheredFoxyRightArmTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(WitheredFoxyRightArmTileEntity animatable) {
		return new ResourceLocation("fnaf_frights", "animations/foxyrightarm.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(WitheredFoxyRightArmTileEntity animatable) {
		return new ResourceLocation("fnaf_frights", "geo/foxyrightarm.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(WitheredFoxyRightArmTileEntity entity) {
		return new ResourceLocation("fnaf_frights", "textures/blocks/witheredfoxyhook.png");
	}
}
