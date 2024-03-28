package net.mcreator.fnaffrights.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnaffrights.block.entity.BonnieLeftArmTileEntity;

public class BonnieLeftArmBlockModel extends AnimatedGeoModel<BonnieLeftArmTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(BonnieLeftArmTileEntity animatable) {
		return new ResourceLocation("fnaf_frights", "animations/bonnieleftarm.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(BonnieLeftArmTileEntity animatable) {
		return new ResourceLocation("fnaf_frights", "geo/bonnieleftarm.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(BonnieLeftArmTileEntity entity) {
		return new ResourceLocation("fnaf_frights", "textures/blocks/unwithered_bonnie.png");
	}
}
