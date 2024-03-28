package net.mcreator.fnaffrights.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnaffrights.block.entity.ChicaRightArmTileEntity;

public class ChicaRightArmBlockModel extends AnimatedGeoModel<ChicaRightArmTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(ChicaRightArmTileEntity animatable) {
		return new ResourceLocation("fnaf_frights", "animations/chicarightarm.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(ChicaRightArmTileEntity animatable) {
		return new ResourceLocation("fnaf_frights", "geo/chicarightarm.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(ChicaRightArmTileEntity entity) {
		return new ResourceLocation("fnaf_frights", "textures/blocks/unwithered_chica.png");
	}
}
