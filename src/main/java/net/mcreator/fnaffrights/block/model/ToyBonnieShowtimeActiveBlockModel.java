package net.mcreator.fnaffrights.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnaffrights.block.entity.ToyBonnieShowtimeActiveTileEntity;

public class ToyBonnieShowtimeActiveBlockModel extends AnimatedGeoModel<ToyBonnieShowtimeActiveTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(ToyBonnieShowtimeActiveTileEntity animatable) {
		return new ResourceLocation("fnaf_frights", "animations/toybonnieshowtimea.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(ToyBonnieShowtimeActiveTileEntity animatable) {
		return new ResourceLocation("fnaf_frights", "geo/toybonnieshowtimea.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(ToyBonnieShowtimeActiveTileEntity entity) {
		return new ResourceLocation("fnaf_frights", "textures/blocks/toy_bonnie.png");
	}
}
