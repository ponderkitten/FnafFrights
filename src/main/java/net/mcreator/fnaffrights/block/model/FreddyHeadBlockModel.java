package net.mcreator.fnaffrights.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnaffrights.block.entity.FreddyHeadTileEntity;

public class FreddyHeadBlockModel extends AnimatedGeoModel<FreddyHeadTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(FreddyHeadTileEntity animatable) {
		return new ResourceLocation("fnaf_frights", "animations/freddyhead.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(FreddyHeadTileEntity animatable) {
		return new ResourceLocation("fnaf_frights", "geo/freddyhead.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(FreddyHeadTileEntity entity) {
		return new ResourceLocation("fnaf_frights", "textures/blocks/unwithered_freddy.png");
	}
}
