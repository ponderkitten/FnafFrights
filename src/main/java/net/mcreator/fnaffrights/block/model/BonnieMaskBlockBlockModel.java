package net.mcreator.fnaffrights.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnaffrights.block.entity.BonnieMaskBlockTileEntity;

public class BonnieMaskBlockBlockModel extends AnimatedGeoModel<BonnieMaskBlockTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(BonnieMaskBlockTileEntity animatable) {
		return new ResourceLocation("fnaf_frights", "animations/bonniemask.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(BonnieMaskBlockTileEntity animatable) {
		return new ResourceLocation("fnaf_frights", "geo/bonniemask.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(BonnieMaskBlockTileEntity entity) {
		return new ResourceLocation("fnaf_frights", "textures/blocks/unwithered_bonnie.png");
	}
}
