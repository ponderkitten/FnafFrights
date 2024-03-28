package net.mcreator.fnaffrights.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnaffrights.block.entity.FreddyBoxTileEntity;

public class FreddyBoxBlockModel extends AnimatedGeoModel<FreddyBoxTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(FreddyBoxTileEntity animatable) {
		return new ResourceLocation("fnaf_frights", "animations/freddybox.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(FreddyBoxTileEntity animatable) {
		return new ResourceLocation("fnaf_frights", "geo/freddybox.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(FreddyBoxTileEntity entity) {
		return new ResourceLocation("fnaf_frights", "textures/blocks/freddybox.png");
	}
}
