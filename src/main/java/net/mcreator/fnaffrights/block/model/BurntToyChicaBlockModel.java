package net.mcreator.fnaffrights.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnaffrights.block.entity.BurntToyChicaTileEntity;

public class BurntToyChicaBlockModel extends AnimatedGeoModel<BurntToyChicaTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(BurntToyChicaTileEntity animatable) {
		return new ResourceLocation("fnaf_frights", "animations/burnttoychica.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(BurntToyChicaTileEntity animatable) {
		return new ResourceLocation("fnaf_frights", "geo/burnttoychica.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(BurntToyChicaTileEntity entity) {
		return new ResourceLocation("fnaf_frights", "textures/blocks/burnt_toychica.png");
	}
}
