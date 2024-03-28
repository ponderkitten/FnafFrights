package net.mcreator.fnaffrights.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnaffrights.block.entity.BonnieRightArmTileEntity;

public class BonnieRightArmBlockModel extends AnimatedGeoModel<BonnieRightArmTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(BonnieRightArmTileEntity animatable) {
		return new ResourceLocation("fnaf_frights", "animations/bonnierightarm.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(BonnieRightArmTileEntity animatable) {
		return new ResourceLocation("fnaf_frights", "geo/bonnierightarm.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(BonnieRightArmTileEntity entity) {
		return new ResourceLocation("fnaf_frights", "textures/blocks/unwithered_bonnie.png");
	}
}
