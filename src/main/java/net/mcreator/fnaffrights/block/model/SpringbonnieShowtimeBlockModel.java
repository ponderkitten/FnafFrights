package net.mcreator.fnaffrights.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnaffrights.block.entity.SpringbonnieShowtimeTileEntity;

public class SpringbonnieShowtimeBlockModel extends AnimatedGeoModel<SpringbonnieShowtimeTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(SpringbonnieShowtimeTileEntity animatable) {
		return new ResourceLocation("fnaf_frights", "animations/springbonnieshowtime.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(SpringbonnieShowtimeTileEntity animatable) {
		return new ResourceLocation("fnaf_frights", "geo/springbonnieshowtime.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(SpringbonnieShowtimeTileEntity entity) {
		return new ResourceLocation("fnaf_frights", "textures/blocks/springbonnie.png");
	}
}
