package net.mcreator.fnaffrights.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnaffrights.block.entity.SpringtrapShowtimeTileEntity;

public class SpringtrapShowtimeBlockModel extends AnimatedGeoModel<SpringtrapShowtimeTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(SpringtrapShowtimeTileEntity animatable) {
		return new ResourceLocation("fnaf_frights", "animations/springtrapshowtime.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(SpringtrapShowtimeTileEntity animatable) {
		return new ResourceLocation("fnaf_frights", "geo/springtrapshowtime.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(SpringtrapShowtimeTileEntity entity) {
		return new ResourceLocation("fnaf_frights", "textures/blocks/springtrapsuffer.png");
	}
}
