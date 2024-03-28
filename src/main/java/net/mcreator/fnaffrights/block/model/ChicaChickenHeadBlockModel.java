package net.mcreator.fnaffrights.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnaffrights.block.entity.ChicaChickenHeadTileEntity;

public class ChicaChickenHeadBlockModel extends AnimatedGeoModel<ChicaChickenHeadTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(ChicaChickenHeadTileEntity animatable) {
		return new ResourceLocation("fnaf_frights", "animations/chicachickenhead.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(ChicaChickenHeadTileEntity animatable) {
		return new ResourceLocation("fnaf_frights", "geo/chicachickenhead.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(ChicaChickenHeadTileEntity entity) {
		return new ResourceLocation("fnaf_frights", "textures/blocks/chica.png");
	}
}
