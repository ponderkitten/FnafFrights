package net.mcreator.fnaffrights.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnaffrights.block.entity.FreddyLeftLegTileEntity;

public class FreddyLeftLegBlockModel extends AnimatedGeoModel<FreddyLeftLegTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(FreddyLeftLegTileEntity animatable) {
		return new ResourceLocation("fnaf_frights", "animations/freddyleftleg.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(FreddyLeftLegTileEntity animatable) {
		return new ResourceLocation("fnaf_frights", "geo/freddyleftleg.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(FreddyLeftLegTileEntity entity) {
		return new ResourceLocation("fnaf_frights", "textures/blocks/unwithered_freddy.png");
	}
}
