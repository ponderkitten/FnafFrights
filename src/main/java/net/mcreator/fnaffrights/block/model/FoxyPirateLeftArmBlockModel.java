package net.mcreator.fnaffrights.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnaffrights.block.entity.FoxyPirateLeftArmTileEntity;

public class FoxyPirateLeftArmBlockModel extends AnimatedGeoModel<FoxyPirateLeftArmTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(FoxyPirateLeftArmTileEntity animatable) {
		return new ResourceLocation("fnaf_frights", "animations/foxypirateleftarm.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(FoxyPirateLeftArmTileEntity animatable) {
		return new ResourceLocation("fnaf_frights", "geo/foxypirateleftarm.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(FoxyPirateLeftArmTileEntity entity) {
		return new ResourceLocation("fnaf_frights", "textures/blocks/fixedfoxy.png");
	}
}
