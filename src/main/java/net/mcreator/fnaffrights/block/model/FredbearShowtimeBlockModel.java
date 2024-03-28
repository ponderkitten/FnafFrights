package net.mcreator.fnaffrights.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnaffrights.block.entity.FredbearShowtimeTileEntity;

public class FredbearShowtimeBlockModel extends AnimatedGeoModel<FredbearShowtimeTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(FredbearShowtimeTileEntity animatable) {
		return new ResourceLocation("fnaf_frights", "animations/fredbearshowtime.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(FredbearShowtimeTileEntity animatable) {
		return new ResourceLocation("fnaf_frights", "geo/fredbearshowtime.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(FredbearShowtimeTileEntity entity) {
		return new ResourceLocation("fnaf_frights", "textures/blocks/fredbear4.png");
	}
}
