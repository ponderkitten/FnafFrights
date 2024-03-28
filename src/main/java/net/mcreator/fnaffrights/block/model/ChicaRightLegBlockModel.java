package net.mcreator.fnaffrights.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnaffrights.block.entity.ChicaRightLegTileEntity;

public class ChicaRightLegBlockModel extends AnimatedGeoModel<ChicaRightLegTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(ChicaRightLegTileEntity animatable) {
		return new ResourceLocation("fnaf_frights", "animations/chicarightleg.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(ChicaRightLegTileEntity animatable) {
		return new ResourceLocation("fnaf_frights", "geo/chicarightleg.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(ChicaRightLegTileEntity entity) {
		return new ResourceLocation("fnaf_frights", "textures/blocks/unwithered_chica.png");
	}
}
