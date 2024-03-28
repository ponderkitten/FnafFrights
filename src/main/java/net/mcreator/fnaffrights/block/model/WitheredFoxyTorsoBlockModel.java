package net.mcreator.fnaffrights.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnaffrights.block.entity.WitheredFoxyTorsoTileEntity;

public class WitheredFoxyTorsoBlockModel extends AnimatedGeoModel<WitheredFoxyTorsoTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(WitheredFoxyTorsoTileEntity animatable) {
		return new ResourceLocation("fnaf_frights", "animations/foxy_torso.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(WitheredFoxyTorsoTileEntity animatable) {
		return new ResourceLocation("fnaf_frights", "geo/foxy_torso.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(WitheredFoxyTorsoTileEntity entity) {
		return new ResourceLocation("fnaf_frights", "textures/blocks/witheredfoxytexture.png");
	}
}
