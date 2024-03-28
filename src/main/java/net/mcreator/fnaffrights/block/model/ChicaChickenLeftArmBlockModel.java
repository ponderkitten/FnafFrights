package net.mcreator.fnaffrights.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnaffrights.block.entity.ChicaChickenLeftArmTileEntity;

public class ChicaChickenLeftArmBlockModel extends AnimatedGeoModel<ChicaChickenLeftArmTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(ChicaChickenLeftArmTileEntity animatable) {
		return new ResourceLocation("fnaf_frights", "animations/chicachickenleftarm.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(ChicaChickenLeftArmTileEntity animatable) {
		return new ResourceLocation("fnaf_frights", "geo/chicachickenleftarm.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(ChicaChickenLeftArmTileEntity entity) {
		return new ResourceLocation("fnaf_frights", "textures/blocks/chica.png");
	}
}
