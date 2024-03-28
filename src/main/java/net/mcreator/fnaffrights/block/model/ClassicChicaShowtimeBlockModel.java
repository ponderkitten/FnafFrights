package net.mcreator.fnaffrights.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnaffrights.block.entity.ClassicChicaShowtimeTileEntity;

public class ClassicChicaShowtimeBlockModel extends AnimatedGeoModel<ClassicChicaShowtimeTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(ClassicChicaShowtimeTileEntity animatable) {
		return new ResourceLocation("fnaf_frights", "animations/classicchicashowtime.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(ClassicChicaShowtimeTileEntity animatable) {
		return new ResourceLocation("fnaf_frights", "geo/classicchicashowtime.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(ClassicChicaShowtimeTileEntity entity) {
		return new ResourceLocation("fnaf_frights", "textures/blocks/chica.png");
	}
}
