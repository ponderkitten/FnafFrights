package net.mcreator.fnaffrights.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnaffrights.block.entity.AToyChicaActiveTileEntity;

public class AToyChicaActiveBlockModel extends AnimatedGeoModel<AToyChicaActiveTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(AToyChicaActiveTileEntity animatable) {
		return new ResourceLocation("fnaf_frights", "animations/atoychicashowtimeactive.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(AToyChicaActiveTileEntity animatable) {
		return new ResourceLocation("fnaf_frights", "geo/atoychicashowtimeactive.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(AToyChicaActiveTileEntity entity) {
		return new ResourceLocation("fnaf_frights", "textures/blocks/toy_chica.png");
	}
}
