package net.mcreator.fnaffrights.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnaffrights.block.entity.AChicaActiveTileEntity;

public class AChicaActiveBlockModel extends AnimatedGeoModel<AChicaActiveTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(AChicaActiveTileEntity animatable) {
		return new ResourceLocation("fnaf_frights", "animations/achicashowtimeactive.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(AChicaActiveTileEntity animatable) {
		return new ResourceLocation("fnaf_frights", "geo/achicashowtimeactive.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(AChicaActiveTileEntity entity) {
		return new ResourceLocation("fnaf_frights", "textures/blocks/unwithered_chica.png");
	}
}
