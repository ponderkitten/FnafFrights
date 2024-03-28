package net.mcreator.fnaffrights.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnaffrights.block.entity.SpringtrapShowtimeActiveTileEntity;

public class SpringtrapShowtimeActiveBlockModel extends AnimatedGeoModel<SpringtrapShowtimeActiveTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(SpringtrapShowtimeActiveTileEntity animatable) {
		return new ResourceLocation("fnaf_frights", "animations/springtrapshowtimeactive.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(SpringtrapShowtimeActiveTileEntity animatable) {
		return new ResourceLocation("fnaf_frights", "geo/springtrapshowtimeactive.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(SpringtrapShowtimeActiveTileEntity entity) {
		return new ResourceLocation("fnaf_frights", "textures/blocks/springtrapsuffer.png");
	}
}
