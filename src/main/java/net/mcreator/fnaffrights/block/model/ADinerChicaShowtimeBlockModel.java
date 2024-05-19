package net.mcreator.fnaffrights.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnaffrights.block.entity.ADinerChicaShowtimeTileEntity;

public class ADinerChicaShowtimeBlockModel extends AnimatedGeoModel<ADinerChicaShowtimeTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(ADinerChicaShowtimeTileEntity animatable) {
		return new ResourceLocation("fnaf_frights", "animations/ashowtimedinerchica.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(ADinerChicaShowtimeTileEntity animatable) {
		return new ResourceLocation("fnaf_frights", "geo/ashowtimedinerchica.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(ADinerChicaShowtimeTileEntity entity) {
		return new ResourceLocation("fnaf_frights", "textures/blocks/dinerchica.png");
	}
}
