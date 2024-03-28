package net.mcreator.fnaffrights.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnaffrights.block.entity.WitheredFreddyTorsoTileEntity;

public class WitheredFreddyTorsoBlockModel extends AnimatedGeoModel<WitheredFreddyTorsoTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(WitheredFreddyTorsoTileEntity animatable) {
		return new ResourceLocation("fnaf_frights", "animations/freddytorso.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(WitheredFreddyTorsoTileEntity animatable) {
		return new ResourceLocation("fnaf_frights", "geo/freddytorso.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(WitheredFreddyTorsoTileEntity entity) {
		return new ResourceLocation("fnaf_frights", "textures/blocks/witheredfreddytexture.png");
	}
}
