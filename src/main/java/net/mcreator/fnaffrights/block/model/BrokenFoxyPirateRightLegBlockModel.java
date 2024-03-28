package net.mcreator.fnaffrights.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnaffrights.block.entity.BrokenFoxyPirateRightLegTileEntity;

public class BrokenFoxyPirateRightLegBlockModel extends AnimatedGeoModel<BrokenFoxyPirateRightLegTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(BrokenFoxyPirateRightLegTileEntity animatable) {
		return new ResourceLocation("fnaf_frights", "animations/foxypiraterightleg.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(BrokenFoxyPirateRightLegTileEntity animatable) {
		return new ResourceLocation("fnaf_frights", "geo/foxypiraterightleg.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(BrokenFoxyPirateRightLegTileEntity entity) {
		return new ResourceLocation("fnaf_frights", "textures/blocks/foxy.png");
	}
}
