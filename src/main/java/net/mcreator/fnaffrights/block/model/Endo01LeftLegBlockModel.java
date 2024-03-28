package net.mcreator.fnaffrights.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnaffrights.block.entity.Endo01LeftLegTileEntity;

public class Endo01LeftLegBlockModel extends AnimatedGeoModel<Endo01LeftLegTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(Endo01LeftLegTileEntity animatable) {
		return new ResourceLocation("fnaf_frights", "animations/endo01leftleg.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(Endo01LeftLegTileEntity animatable) {
		return new ResourceLocation("fnaf_frights", "geo/endo01leftleg.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(Endo01LeftLegTileEntity entity) {
		return new ResourceLocation("fnaf_frights", "textures/blocks/endo01.png");
	}
}
