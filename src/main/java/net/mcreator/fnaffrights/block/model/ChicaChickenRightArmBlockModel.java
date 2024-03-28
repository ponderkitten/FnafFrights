package net.mcreator.fnaffrights.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnaffrights.block.entity.ChicaChickenRightArmTileEntity;

public class ChicaChickenRightArmBlockModel extends AnimatedGeoModel<ChicaChickenRightArmTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(ChicaChickenRightArmTileEntity animatable) {
		return new ResourceLocation("fnaf_frights", "animations/chicachickenrightarm.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(ChicaChickenRightArmTileEntity animatable) {
		return new ResourceLocation("fnaf_frights", "geo/chicachickenrightarm.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(ChicaChickenRightArmTileEntity entity) {
		return new ResourceLocation("fnaf_frights", "textures/blocks/chica.png");
	}
}
