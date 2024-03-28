package net.mcreator.fnaffrights.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnaffrights.block.entity.FoxyPirateRightLegTileEntity;

public class FoxyPirateRightLegBlockModel extends AnimatedGeoModel<FoxyPirateRightLegTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(FoxyPirateRightLegTileEntity animatable) {
		return new ResourceLocation("fnaf_frights", "animations/foxypiraterightleg.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(FoxyPirateRightLegTileEntity animatable) {
		return new ResourceLocation("fnaf_frights", "geo/foxypiraterightleg.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(FoxyPirateRightLegTileEntity entity) {
		return new ResourceLocation("fnaf_frights", "textures/blocks/fixedfoxy.png");
	}
}
