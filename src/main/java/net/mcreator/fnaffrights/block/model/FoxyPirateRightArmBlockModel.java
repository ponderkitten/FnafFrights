package net.mcreator.fnaffrights.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnaffrights.block.entity.FoxyPirateRightArmTileEntity;

public class FoxyPirateRightArmBlockModel extends AnimatedGeoModel<FoxyPirateRightArmTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(FoxyPirateRightArmTileEntity animatable) {
		return new ResourceLocation("fnaf_frights", "animations/foxypiraterightarm.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(FoxyPirateRightArmTileEntity animatable) {
		return new ResourceLocation("fnaf_frights", "geo/foxypiraterightarm.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(FoxyPirateRightArmTileEntity entity) {
		return new ResourceLocation("fnaf_frights", "textures/blocks/fixedfoxy.png");
	}
}
