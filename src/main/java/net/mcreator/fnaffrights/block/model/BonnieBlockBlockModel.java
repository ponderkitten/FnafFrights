package net.mcreator.fnaffrights.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnaffrights.block.entity.BonnieBlockTileEntity;

public class BonnieBlockBlockModel extends AnimatedGeoModel<BonnieBlockTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(BonnieBlockTileEntity animatable) {
		return new ResourceLocation("fnaf_frights", "animations/classicbonnieblock.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(BonnieBlockTileEntity animatable) {
		return new ResourceLocation("fnaf_frights", "geo/classicbonnieblock.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(BonnieBlockTileEntity entity) {
		return new ResourceLocation("fnaf_frights", "textures/blocks/unwithered_bonnie.png");
	}
}
