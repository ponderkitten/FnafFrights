package net.mcreator.fnaffrights.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnaffrights.block.entity.BrokenFoxyPirateLeftArmTileEntity;

public class BrokenFoxyPirateLeftArmBlockModel extends AnimatedGeoModel<BrokenFoxyPirateLeftArmTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(BrokenFoxyPirateLeftArmTileEntity animatable) {
		return new ResourceLocation("fnaf_frights", "animations/foxypirateleftarm.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(BrokenFoxyPirateLeftArmTileEntity animatable) {
		return new ResourceLocation("fnaf_frights", "geo/foxypirateleftarm.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(BrokenFoxyPirateLeftArmTileEntity entity) {
		return new ResourceLocation("fnaf_frights", "textures/blocks/foxy.png");
	}
}
