package net.mcreator.fnaffrights.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnaffrights.block.entity.FoxyArcadeTileEntity;

public class FoxyArcadeBlockModel extends AnimatedGeoModel<FoxyArcadeTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(FoxyArcadeTileEntity animatable) {
		return new ResourceLocation("fnaf_frights", "animations/foxyarcade.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(FoxyArcadeTileEntity animatable) {
		return new ResourceLocation("fnaf_frights", "geo/foxyarcade.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(FoxyArcadeTileEntity entity) {
		return new ResourceLocation("fnaf_frights", "textures/blocks/foxyarcade.png");
	}
}
