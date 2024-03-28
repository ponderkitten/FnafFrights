package net.mcreator.fnaffrights.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnaffrights.block.entity.ChicaChickenTorsoTileEntity;

public class ChicaChickenTorsoBlockModel extends AnimatedGeoModel<ChicaChickenTorsoTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(ChicaChickenTorsoTileEntity animatable) {
		return new ResourceLocation("fnaf_frights", "animations/chicachickentorso.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(ChicaChickenTorsoTileEntity animatable) {
		return new ResourceLocation("fnaf_frights", "geo/chicachickentorso.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(ChicaChickenTorsoTileEntity entity) {
		return new ResourceLocation("fnaf_frights", "textures/blocks/chica.png");
	}
}
