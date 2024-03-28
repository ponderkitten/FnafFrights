package net.mcreator.fnaffrights.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnaffrights.block.entity.WitheredFreddyRightLegTileEntity;

public class WitheredFreddyRightLegBlockModel extends AnimatedGeoModel<WitheredFreddyRightLegTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(WitheredFreddyRightLegTileEntity animatable) {
		return new ResourceLocation("fnaf_frights", "animations/freddyrightleg.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(WitheredFreddyRightLegTileEntity animatable) {
		return new ResourceLocation("fnaf_frights", "geo/freddyrightleg.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(WitheredFreddyRightLegTileEntity entity) {
		return new ResourceLocation("fnaf_frights", "textures/blocks/witheredfreddytexture.png");
	}
}
