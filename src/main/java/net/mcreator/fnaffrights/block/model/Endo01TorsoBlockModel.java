package net.mcreator.fnaffrights.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnaffrights.block.entity.Endo01TorsoTileEntity;

public class Endo01TorsoBlockModel extends AnimatedGeoModel<Endo01TorsoTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(Endo01TorsoTileEntity animatable) {
		return new ResourceLocation("fnaf_frights", "animations/endo01torso.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(Endo01TorsoTileEntity animatable) {
		return new ResourceLocation("fnaf_frights", "geo/endo01torso.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(Endo01TorsoTileEntity entity) {
		return new ResourceLocation("fnaf_frights", "textures/blocks/endo01.png");
	}
}
