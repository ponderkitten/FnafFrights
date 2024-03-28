package net.mcreator.fnaffrights.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnaffrights.block.entity.ToyBonnieShowtimeTileEntity;

public class ToyBonnieShowtimeBlockModel extends AnimatedGeoModel<ToyBonnieShowtimeTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(ToyBonnieShowtimeTileEntity animatable) {
		return new ResourceLocation("fnaf_frights", "animations/toybonnieshowtime.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(ToyBonnieShowtimeTileEntity animatable) {
		return new ResourceLocation("fnaf_frights", "geo/toybonnieshowtime.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(ToyBonnieShowtimeTileEntity entity) {
		return new ResourceLocation("fnaf_frights", "textures/blocks/toy_bonnie.png");
	}
}
