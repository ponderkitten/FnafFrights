package net.mcreator.fnaffrights.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnaffrights.block.entity.Endo02LeftLegTileEntity;

public class Endo02LeftLegBlockModel extends AnimatedGeoModel<Endo02LeftLegTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(Endo02LeftLegTileEntity animatable) {
		return new ResourceLocation("fnaf_frights", "animations/freddyleftleg.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(Endo02LeftLegTileEntity animatable) {
		return new ResourceLocation("fnaf_frights", "geo/freddyleftleg.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(Endo02LeftLegTileEntity entity) {
		return new ResourceLocation("fnaf_frights", "textures/blocks/endo02.png");
	}
}
