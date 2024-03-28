package net.mcreator.fnaffrights.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnaffrights.block.entity.AFoxyActiveTileEntity;

public class AFoxyActiveBlockModel extends AnimatedGeoModel<AFoxyActiveTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(AFoxyActiveTileEntity animatable) {
		return new ResourceLocation("fnaf_frights", "animations/afoxyshowtimeactive.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(AFoxyActiveTileEntity animatable) {
		return new ResourceLocation("fnaf_frights", "geo/afoxyshowtimeactive.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(AFoxyActiveTileEntity entity) {
		return new ResourceLocation("fnaf_frights", "textures/blocks/unwithered_foxy.png");
	}
}
