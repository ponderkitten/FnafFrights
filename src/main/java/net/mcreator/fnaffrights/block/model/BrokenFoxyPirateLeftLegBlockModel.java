package net.mcreator.fnaffrights.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnaffrights.block.entity.BrokenFoxyPirateLeftLegTileEntity;

public class BrokenFoxyPirateLeftLegBlockModel extends AnimatedGeoModel<BrokenFoxyPirateLeftLegTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(BrokenFoxyPirateLeftLegTileEntity animatable) {
		return new ResourceLocation("fnaf_frights", "animations/foxypirateleftleg.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(BrokenFoxyPirateLeftLegTileEntity animatable) {
		return new ResourceLocation("fnaf_frights", "geo/foxypirateleftleg.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(BrokenFoxyPirateLeftLegTileEntity entity) {
		return new ResourceLocation("fnaf_frights", "textures/blocks/foxy.png");
	}
}
