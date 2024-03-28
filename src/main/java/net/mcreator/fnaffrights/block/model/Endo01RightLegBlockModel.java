package net.mcreator.fnaffrights.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnaffrights.block.entity.Endo01RightLegTileEntity;

public class Endo01RightLegBlockModel extends AnimatedGeoModel<Endo01RightLegTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(Endo01RightLegTileEntity animatable) {
		return new ResourceLocation("fnaf_frights", "animations/endo01rightleg.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(Endo01RightLegTileEntity animatable) {
		return new ResourceLocation("fnaf_frights", "geo/endo01rightleg.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(Endo01RightLegTileEntity entity) {
		return new ResourceLocation("fnaf_frights", "textures/blocks/endo01.png");
	}
}
