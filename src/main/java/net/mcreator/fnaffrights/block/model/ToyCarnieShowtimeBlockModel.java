package net.mcreator.fnaffrights.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnaffrights.block.entity.ToyCarnieShowtimeTileEntity;

public class ToyCarnieShowtimeBlockModel extends AnimatedGeoModel<ToyCarnieShowtimeTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(ToyCarnieShowtimeTileEntity animatable) {
		return new ResourceLocation("fnaf_frights", "animations/toycarnieshowtime.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(ToyCarnieShowtimeTileEntity animatable) {
		return new ResourceLocation("fnaf_frights", "geo/toycarnieshowtime.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(ToyCarnieShowtimeTileEntity entity) {
		return new ResourceLocation("fnaf_frights", "textures/blocks/legallydistinctcarnie.png");
	}
}
