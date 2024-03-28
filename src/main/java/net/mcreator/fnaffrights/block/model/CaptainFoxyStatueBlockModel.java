package net.mcreator.fnaffrights.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnaffrights.block.entity.CaptainFoxyStatueTileEntity;

public class CaptainFoxyStatueBlockModel extends AnimatedGeoModel<CaptainFoxyStatueTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(CaptainFoxyStatueTileEntity animatable) {
		return new ResourceLocation("fnaf_frights", "animations/captainfoxy.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(CaptainFoxyStatueTileEntity animatable) {
		return new ResourceLocation("fnaf_frights", "geo/captainfoxy.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(CaptainFoxyStatueTileEntity entity) {
		return new ResourceLocation("fnaf_frights", "textures/blocks/dinerfoxy.png");
	}
}
