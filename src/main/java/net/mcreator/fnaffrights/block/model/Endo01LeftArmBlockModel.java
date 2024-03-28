package net.mcreator.fnaffrights.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnaffrights.block.entity.Endo01LeftArmTileEntity;

public class Endo01LeftArmBlockModel extends AnimatedGeoModel<Endo01LeftArmTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(Endo01LeftArmTileEntity animatable) {
		return new ResourceLocation("fnaf_frights", "animations/endo01leftarm.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(Endo01LeftArmTileEntity animatable) {
		return new ResourceLocation("fnaf_frights", "geo/endo01leftarm.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(Endo01LeftArmTileEntity entity) {
		return new ResourceLocation("fnaf_frights", "textures/blocks/endo01.png");
	}
}
