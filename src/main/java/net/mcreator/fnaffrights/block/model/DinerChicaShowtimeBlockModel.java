package net.mcreator.fnaffrights.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnaffrights.block.entity.DinerChicaShowtimeTileEntity;

public class DinerChicaShowtimeBlockModel extends AnimatedGeoModel<DinerChicaShowtimeTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(DinerChicaShowtimeTileEntity animatable) {
		return new ResourceLocation("fnaf_frights", "animations/showtimedinerchica.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(DinerChicaShowtimeTileEntity animatable) {
		return new ResourceLocation("fnaf_frights", "geo/showtimedinerchica.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(DinerChicaShowtimeTileEntity entity) {
		return new ResourceLocation("fnaf_frights", "textures/blocks/dinerchica.png");
	}
}
