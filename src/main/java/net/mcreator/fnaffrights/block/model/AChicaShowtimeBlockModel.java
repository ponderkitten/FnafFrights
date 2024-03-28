package net.mcreator.fnaffrights.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnaffrights.block.entity.AChicaShowtimeTileEntity;

public class AChicaShowtimeBlockModel extends AnimatedGeoModel<AChicaShowtimeTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(AChicaShowtimeTileEntity animatable) {
		return new ResourceLocation("fnaf_frights", "animations/achicashowtime.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(AChicaShowtimeTileEntity animatable) {
		return new ResourceLocation("fnaf_frights", "geo/achicashowtime.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(AChicaShowtimeTileEntity entity) {
		return new ResourceLocation("fnaf_frights", "textures/blocks/unwithered_chica.png");
	}
}
