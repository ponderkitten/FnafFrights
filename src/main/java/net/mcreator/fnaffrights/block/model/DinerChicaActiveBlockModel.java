package net.mcreator.fnaffrights.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnaffrights.block.entity.DinerChicaActiveTileEntity;

public class DinerChicaActiveBlockModel extends AnimatedGeoModel<DinerChicaActiveTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(DinerChicaActiveTileEntity animatable) {
		return new ResourceLocation("fnaf_frights", "animations/showtimedinerchicaactive.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(DinerChicaActiveTileEntity animatable) {
		return new ResourceLocation("fnaf_frights", "geo/showtimedinerchicaactive.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(DinerChicaActiveTileEntity entity) {
		return new ResourceLocation("fnaf_frights", "textures/blocks/dinerchica.png");
	}
}
