package net.mcreator.fnaffrights.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnaffrights.block.entity.ToyBonnieRightArmTileEntity;

public class ToyBonnieRightArmBlockModel extends AnimatedGeoModel<ToyBonnieRightArmTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(ToyBonnieRightArmTileEntity animatable) {
		return new ResourceLocation("fnaf_frights", "animations/toybonnierightarm.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(ToyBonnieRightArmTileEntity animatable) {
		return new ResourceLocation("fnaf_frights", "geo/toybonnierightarm.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(ToyBonnieRightArmTileEntity entity) {
		return new ResourceLocation("fnaf_frights", "textures/blocks/toy_bonnie.png");
	}
}
