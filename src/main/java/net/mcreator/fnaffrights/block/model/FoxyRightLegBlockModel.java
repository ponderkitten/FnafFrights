package net.mcreator.fnaffrights.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnaffrights.block.entity.FoxyRightLegTileEntity;

public class FoxyRightLegBlockModel extends AnimatedGeoModel<FoxyRightLegTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(FoxyRightLegTileEntity animatable) {
		return new ResourceLocation("fnaf_frights", "animations/foxyrleg.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(FoxyRightLegTileEntity animatable) {
		return new ResourceLocation("fnaf_frights", "geo/foxyrleg.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(FoxyRightLegTileEntity entity) {
		return new ResourceLocation("fnaf_frights", "textures/blocks/unwithered_foxy.png");
	}
}
