package net.mcreator.fnaffrights.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnaffrights.block.entity.ToyBonnieHeadTileEntity;

public class ToyBonnieHeadBlockModel extends AnimatedGeoModel<ToyBonnieHeadTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(ToyBonnieHeadTileEntity animatable) {
		return new ResourceLocation("fnaf_frights", "animations/toybonniehead.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(ToyBonnieHeadTileEntity animatable) {
		return new ResourceLocation("fnaf_frights", "geo/toybonniehead.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(ToyBonnieHeadTileEntity entity) {
		return new ResourceLocation("fnaf_frights", "textures/blocks/toy_bonnie.png");
	}
}
