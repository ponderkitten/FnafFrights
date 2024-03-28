package net.mcreator.fnaffrights.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnaffrights.block.entity.FoxyPirateLeftLegTileEntity;

public class FoxyPirateLeftLegBlockModel extends AnimatedGeoModel<FoxyPirateLeftLegTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(FoxyPirateLeftLegTileEntity animatable) {
		return new ResourceLocation("fnaf_frights", "animations/foxypirateleftleg.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(FoxyPirateLeftLegTileEntity animatable) {
		return new ResourceLocation("fnaf_frights", "geo/foxypirateleftleg.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(FoxyPirateLeftLegTileEntity entity) {
		return new ResourceLocation("fnaf_frights", "textures/blocks/fixedfoxy.png");
	}
}
