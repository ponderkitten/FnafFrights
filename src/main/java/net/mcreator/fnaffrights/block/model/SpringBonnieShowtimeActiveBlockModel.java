package net.mcreator.fnaffrights.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnaffrights.block.entity.SpringBonnieShowtimeActiveTileEntity;

public class SpringBonnieShowtimeActiveBlockModel extends AnimatedGeoModel<SpringBonnieShowtimeActiveTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(SpringBonnieShowtimeActiveTileEntity animatable) {
		return new ResourceLocation("fnaf_frights", "animations/springbonnieshowtimeactive.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(SpringBonnieShowtimeActiveTileEntity animatable) {
		return new ResourceLocation("fnaf_frights", "geo/springbonnieshowtimeactive.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(SpringBonnieShowtimeActiveTileEntity entity) {
		return new ResourceLocation("fnaf_frights", "textures/blocks/springbonnie.png");
	}
}
