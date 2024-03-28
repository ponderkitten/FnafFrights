package net.mcreator.fnaffrights.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnaffrights.block.entity.ChicaChickenLeftLegTileEntity;

public class ChicaChickenLeftLegBlockModel extends AnimatedGeoModel<ChicaChickenLeftLegTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(ChicaChickenLeftLegTileEntity animatable) {
		return new ResourceLocation("fnaf_frights", "animations/chicachickenleftleg.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(ChicaChickenLeftLegTileEntity animatable) {
		return new ResourceLocation("fnaf_frights", "geo/chicachickenleftleg.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(ChicaChickenLeftLegTileEntity entity) {
		return new ResourceLocation("fnaf_frights", "textures/blocks/chica.png");
	}
}
