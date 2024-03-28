package net.mcreator.fnaffrights.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnaffrights.block.entity.BonnieHeadTileEntity;

public class BonnieHeadBlockModel extends AnimatedGeoModel<BonnieHeadTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(BonnieHeadTileEntity animatable) {
		return new ResourceLocation("fnaf_frights", "animations/bonniehead.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(BonnieHeadTileEntity animatable) {
		return new ResourceLocation("fnaf_frights", "geo/bonniehead.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(BonnieHeadTileEntity entity) {
		return new ResourceLocation("fnaf_frights", "textures/blocks/unwithered_bonnie.png");
	}
}
