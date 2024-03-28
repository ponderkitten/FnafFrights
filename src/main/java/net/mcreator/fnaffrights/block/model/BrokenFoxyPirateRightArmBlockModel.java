package net.mcreator.fnaffrights.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnaffrights.block.entity.BrokenFoxyPirateRightArmTileEntity;

public class BrokenFoxyPirateRightArmBlockModel extends AnimatedGeoModel<BrokenFoxyPirateRightArmTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(BrokenFoxyPirateRightArmTileEntity animatable) {
		return new ResourceLocation("fnaf_frights", "animations/foxypiraterightarm.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(BrokenFoxyPirateRightArmTileEntity animatable) {
		return new ResourceLocation("fnaf_frights", "geo/foxypiraterightarm.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(BrokenFoxyPirateRightArmTileEntity entity) {
		return new ResourceLocation("fnaf_frights", "textures/blocks/foxy.png");
	}
}
