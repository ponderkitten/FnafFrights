package net.mcreator.fnaffrights.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnaffrights.block.entity.FredbearShowtimeActiveTileEntity;

public class FredbearShowtimeActiveBlockModel extends AnimatedGeoModel<FredbearShowtimeActiveTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(FredbearShowtimeActiveTileEntity animatable) {
		return new ResourceLocation("fnaf_frights", "animations/fredbearshowtimeactive.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(FredbearShowtimeActiveTileEntity animatable) {
		return new ResourceLocation("fnaf_frights", "geo/fredbearshowtimeactive.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(FredbearShowtimeActiveTileEntity entity) {
		return new ResourceLocation("fnaf_frights", "textures/blocks/fredbear4.png");
	}
}
