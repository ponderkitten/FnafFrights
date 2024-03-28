package net.mcreator.fnaffrights.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnaffrights.block.entity.AToyChicaShowtimeTileEntity;

public class AToyChicaShowtimeBlockModel extends AnimatedGeoModel<AToyChicaShowtimeTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(AToyChicaShowtimeTileEntity animatable) {
		return new ResourceLocation("fnaf_frights", "animations/atoychicashowtime.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(AToyChicaShowtimeTileEntity animatable) {
		return new ResourceLocation("fnaf_frights", "geo/atoychicashowtime.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(AToyChicaShowtimeTileEntity entity) {
		return new ResourceLocation("fnaf_frights", "textures/blocks/toy_chica.png");
	}
}
