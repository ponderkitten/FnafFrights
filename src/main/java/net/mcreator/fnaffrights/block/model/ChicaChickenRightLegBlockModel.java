package net.mcreator.fnaffrights.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnaffrights.block.entity.ChicaChickenRightLegTileEntity;

public class ChicaChickenRightLegBlockModel extends AnimatedGeoModel<ChicaChickenRightLegTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(ChicaChickenRightLegTileEntity animatable) {
		return new ResourceLocation("fnaf_frights", "animations/chicachickenrightleg.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(ChicaChickenRightLegTileEntity animatable) {
		return new ResourceLocation("fnaf_frights", "geo/chicachickenrightleg.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(ChicaChickenRightLegTileEntity entity) {
		return new ResourceLocation("fnaf_frights", "textures/blocks/chica.png");
	}
}
