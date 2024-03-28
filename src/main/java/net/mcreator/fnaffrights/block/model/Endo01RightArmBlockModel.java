package net.mcreator.fnaffrights.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnaffrights.block.entity.Endo01RightArmTileEntity;

public class Endo01RightArmBlockModel extends AnimatedGeoModel<Endo01RightArmTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(Endo01RightArmTileEntity animatable) {
		return new ResourceLocation("fnaf_frights", "animations/endo01rightarm.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(Endo01RightArmTileEntity animatable) {
		return new ResourceLocation("fnaf_frights", "geo/endo01rightarm.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(Endo01RightArmTileEntity entity) {
		return new ResourceLocation("fnaf_frights", "textures/blocks/endo01.png");
	}
}
