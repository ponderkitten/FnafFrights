package net.mcreator.fnaffrights.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnaffrights.block.entity.ADinerChicaActiveTileEntity;

public class ADinerChicaActiveBlockModel extends AnimatedGeoModel<ADinerChicaActiveTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(ADinerChicaActiveTileEntity animatable) {
		return new ResourceLocation("fnaf_frights", "animations/ashowtimedinerchicaactive.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(ADinerChicaActiveTileEntity animatable) {
		return new ResourceLocation("fnaf_frights", "geo/ashowtimedinerchicaactive.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(ADinerChicaActiveTileEntity entity) {
		return new ResourceLocation("fnaf_frights", "textures/blocks/dinerchica.png");
	}
}
