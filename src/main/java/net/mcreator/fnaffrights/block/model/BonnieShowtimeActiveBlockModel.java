package net.mcreator.fnaffrights.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnaffrights.block.entity.BonnieShowtimeActiveTileEntity;

public class BonnieShowtimeActiveBlockModel extends AnimatedGeoModel<BonnieShowtimeActiveTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(BonnieShowtimeActiveTileEntity animatable) {
		return new ResourceLocation("fnaf_frights", "animations/bonnieshowtimeactive.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(BonnieShowtimeActiveTileEntity animatable) {
		return new ResourceLocation("fnaf_frights", "geo/bonnieshowtimeactive.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(BonnieShowtimeActiveTileEntity entity) {
		return new ResourceLocation("fnaf_frights", "textures/blocks/unwithered_bonnie.png");
	}
}
