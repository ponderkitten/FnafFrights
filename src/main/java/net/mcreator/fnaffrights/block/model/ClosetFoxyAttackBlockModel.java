package net.mcreator.fnaffrights.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnaffrights.block.entity.ClosetFoxyAttackTileEntity;

public class ClosetFoxyAttackBlockModel extends AnimatedGeoModel<ClosetFoxyAttackTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(ClosetFoxyAttackTileEntity animatable) {
		return new ResourceLocation("fnaf_frights", "animations/closetedfox2.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(ClosetFoxyAttackTileEntity animatable) {
		return new ResourceLocation("fnaf_frights", "geo/closetedfox2.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(ClosetFoxyAttackTileEntity entity) {
		return new ResourceLocation("fnaf_frights", "textures/blocks/closetedfoxy.png");
	}
}
