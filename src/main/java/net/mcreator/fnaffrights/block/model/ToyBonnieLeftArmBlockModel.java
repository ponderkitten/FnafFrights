package net.mcreator.fnaffrights.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnaffrights.block.entity.ToyBonnieLeftArmTileEntity;

public class ToyBonnieLeftArmBlockModel extends AnimatedGeoModel<ToyBonnieLeftArmTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(ToyBonnieLeftArmTileEntity animatable) {
		return new ResourceLocation("fnaf_frights", "animations/toybonnieleftarm.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(ToyBonnieLeftArmTileEntity animatable) {
		return new ResourceLocation("fnaf_frights", "geo/toybonnieleftarm.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(ToyBonnieLeftArmTileEntity entity) {
		return new ResourceLocation("fnaf_frights", "textures/blocks/toy_bonnie.png");
	}
}
