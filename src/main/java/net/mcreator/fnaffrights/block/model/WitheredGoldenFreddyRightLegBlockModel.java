package net.mcreator.fnaffrights.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnaffrights.block.entity.WitheredGoldenFreddyRightLegTileEntity;

public class WitheredGoldenFreddyRightLegBlockModel extends AnimatedGeoModel<WitheredGoldenFreddyRightLegTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(WitheredGoldenFreddyRightLegTileEntity animatable) {
		return new ResourceLocation("fnaf_frights", "animations/freddyrightleg.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(WitheredGoldenFreddyRightLegTileEntity animatable) {
		return new ResourceLocation("fnaf_frights", "geo/freddyrightleg.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(WitheredGoldenFreddyRightLegTileEntity entity) {
		return new ResourceLocation("fnaf_frights", "textures/blocks/witheredgoldenfreddytexture.png");
	}
}
