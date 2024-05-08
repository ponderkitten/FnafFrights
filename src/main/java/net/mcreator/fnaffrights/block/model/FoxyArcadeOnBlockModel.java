package net.mcreator.fnaffrights.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnaffrights.block.entity.FoxyArcadeOnTileEntity;

public class FoxyArcadeOnBlockModel extends AnimatedGeoModel<FoxyArcadeOnTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(FoxyArcadeOnTileEntity animatable) {
		return new ResourceLocation("fnaf_frights", "animations/foxyarcadeon.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(FoxyArcadeOnTileEntity animatable) {
		return new ResourceLocation("fnaf_frights", "geo/foxyarcadeon.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(FoxyArcadeOnTileEntity entity) {
		return new ResourceLocation("fnaf_frights", "textures/blocks/foxyarcadeon.png");
	}
}
