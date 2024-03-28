package net.mcreator.fnaffrights.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnaffrights.block.entity.WitheredFreddyLeftLegTileEntity;

public class WitheredFreddyLeftLegBlockModel extends AnimatedGeoModel<WitheredFreddyLeftLegTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(WitheredFreddyLeftLegTileEntity animatable) {
		return new ResourceLocation("fnaf_frights", "animations/freddyleftleg.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(WitheredFreddyLeftLegTileEntity animatable) {
		return new ResourceLocation("fnaf_frights", "geo/freddyleftleg.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(WitheredFreddyLeftLegTileEntity entity) {
		return new ResourceLocation("fnaf_frights", "textures/blocks/witheredfreddytexture.png");
	}
}
