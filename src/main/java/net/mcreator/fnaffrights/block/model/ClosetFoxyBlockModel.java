package net.mcreator.fnaffrights.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnaffrights.block.entity.ClosetFoxyTileEntity;

public class ClosetFoxyBlockModel extends AnimatedGeoModel<ClosetFoxyTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(ClosetFoxyTileEntity animatable) {
		return new ResourceLocation("fnaf_frights", "animations/closetedfox.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(ClosetFoxyTileEntity animatable) {
		return new ResourceLocation("fnaf_frights", "geo/closetedfox.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(ClosetFoxyTileEntity entity) {
		return new ResourceLocation("fnaf_frights", "textures/blocks/closetedfoxy.png");
	}
}
