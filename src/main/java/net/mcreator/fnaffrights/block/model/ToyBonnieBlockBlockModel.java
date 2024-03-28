package net.mcreator.fnaffrights.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnaffrights.block.entity.ToyBonnieBlockTileEntity;

public class ToyBonnieBlockBlockModel extends AnimatedGeoModel<ToyBonnieBlockTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(ToyBonnieBlockTileEntity animatable) {
		return new ResourceLocation("fnaf_frights", "animations/toybonnieblock.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(ToyBonnieBlockTileEntity animatable) {
		return new ResourceLocation("fnaf_frights", "geo/toybonnieblock.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(ToyBonnieBlockTileEntity entity) {
		return new ResourceLocation("fnaf_frights", "textures/blocks/toy_bonnie.png");
	}
}
