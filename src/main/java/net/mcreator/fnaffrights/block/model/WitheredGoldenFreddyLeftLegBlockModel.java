package net.mcreator.fnaffrights.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnaffrights.block.entity.WitheredGoldenFreddyLeftLegTileEntity;

public class WitheredGoldenFreddyLeftLegBlockModel extends AnimatedGeoModel<WitheredGoldenFreddyLeftLegTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(WitheredGoldenFreddyLeftLegTileEntity animatable) {
		return new ResourceLocation("fnaf_frights", "animations/freddyleftleg.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(WitheredGoldenFreddyLeftLegTileEntity animatable) {
		return new ResourceLocation("fnaf_frights", "geo/freddyleftleg.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(WitheredGoldenFreddyLeftLegTileEntity entity) {
		return new ResourceLocation("fnaf_frights", "textures/blocks/witheredgoldenfreddytexture.png");
	}
}
