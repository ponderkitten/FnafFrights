package net.mcreator.fnaffrights.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnaffrights.block.entity.ChicaLeftArmTileEntity;

public class ChicaLeftArmBlockModel extends AnimatedGeoModel<ChicaLeftArmTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(ChicaLeftArmTileEntity animatable) {
		return new ResourceLocation("fnaf_frights", "animations/chicaleftarm.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(ChicaLeftArmTileEntity animatable) {
		return new ResourceLocation("fnaf_frights", "geo/chicaleftarm.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(ChicaLeftArmTileEntity entity) {
		return new ResourceLocation("fnaf_frights", "textures/blocks/unwithered_chica.png");
	}
}
