package net.mcreator.fnaffrights.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnaffrights.block.entity.ChristmasFoxyTileEntity;

public class ChristmasFoxyBlockModel extends AnimatedGeoModel<ChristmasFoxyTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(ChristmasFoxyTileEntity animatable) {
		return new ResourceLocation("fnaf_frights", "animations/fixedfoxypirateshowtime.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(ChristmasFoxyTileEntity animatable) {
		return new ResourceLocation("fnaf_frights", "geo/fixedfoxypirateshowtime.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(ChristmasFoxyTileEntity entity) {
		return new ResourceLocation("fnaf_frights", "textures/blocks/christmasfoxy.png");
	}
}
