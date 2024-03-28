package net.mcreator.fnaffrights.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnaffrights.block.entity.FreddyRightLegTileEntity;

public class FreddyRightLegBlockModel extends AnimatedGeoModel<FreddyRightLegTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(FreddyRightLegTileEntity animatable) {
		return new ResourceLocation("fnaf_frights", "animations/freddyrightleg.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(FreddyRightLegTileEntity animatable) {
		return new ResourceLocation("fnaf_frights", "geo/freddyrightleg.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(FreddyRightLegTileEntity entity) {
		return new ResourceLocation("fnaf_frights", "textures/blocks/unwithered_freddy.png");
	}
}
