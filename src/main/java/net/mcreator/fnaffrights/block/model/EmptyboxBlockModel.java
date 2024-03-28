package net.mcreator.fnaffrights.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnaffrights.block.entity.EmptyboxTileEntity;

public class EmptyboxBlockModel extends AnimatedGeoModel<EmptyboxTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(EmptyboxTileEntity animatable) {
		return new ResourceLocation("fnaf_frights", "animations/emptybox.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(EmptyboxTileEntity animatable) {
		return new ResourceLocation("fnaf_frights", "geo/emptybox.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(EmptyboxTileEntity entity) {
		return new ResourceLocation("fnaf_frights", "textures/blocks/freddybox.png");
	}
}
