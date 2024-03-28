package net.mcreator.fnaffrights.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnaffrights.block.entity.WitheredGoldenFreddyTorsoTileEntity;

public class WitheredGoldenFreddyTorsoBlockModel extends AnimatedGeoModel<WitheredGoldenFreddyTorsoTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(WitheredGoldenFreddyTorsoTileEntity animatable) {
		return new ResourceLocation("fnaf_frights", "animations/freddytorso.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(WitheredGoldenFreddyTorsoTileEntity animatable) {
		return new ResourceLocation("fnaf_frights", "geo/freddytorso.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(WitheredGoldenFreddyTorsoTileEntity entity) {
		return new ResourceLocation("fnaf_frights", "textures/blocks/witheredgoldenfreddytexture.png");
	}
}
