package net.mcreator.fnaffrights.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnaffrights.block.entity.ClassicChicaShowtimeActiveTileEntity;

public class ClassicChicaShowtimeActiveBlockModel extends AnimatedGeoModel<ClassicChicaShowtimeActiveTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(ClassicChicaShowtimeActiveTileEntity animatable) {
		return new ResourceLocation("fnaf_frights", "animations/classicchicashowtimeactive.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(ClassicChicaShowtimeActiveTileEntity animatable) {
		return new ResourceLocation("fnaf_frights", "geo/classicchicashowtimeactive.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(ClassicChicaShowtimeActiveTileEntity entity) {
		return new ResourceLocation("fnaf_frights", "textures/blocks/chica.png");
	}
}
