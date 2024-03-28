package net.mcreator.fnaffrights.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnaffrights.block.entity.AGltichBonnieShowtimeTileEntity;

public class AGltichBonnieShowtimeBlockModel extends AnimatedGeoModel<AGltichBonnieShowtimeTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(AGltichBonnieShowtimeTileEntity animatable) {
		return new ResourceLocation("fnaf_frights", "animations/aspringbonnieshowtime.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(AGltichBonnieShowtimeTileEntity animatable) {
		return new ResourceLocation("fnaf_frights", "geo/aspringbonnieshowtime.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(AGltichBonnieShowtimeTileEntity entity) {
		return new ResourceLocation("fnaf_frights", "textures/blocks/springbonniewithvestandwhiskers.png");
	}
}
