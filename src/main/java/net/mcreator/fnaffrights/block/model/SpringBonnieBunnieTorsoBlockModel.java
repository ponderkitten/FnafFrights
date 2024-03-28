package net.mcreator.fnaffrights.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnaffrights.block.entity.SpringBonnieBunnieTorsoTileEntity;

public class SpringBonnieBunnieTorsoBlockModel extends AnimatedGeoModel<SpringBonnieBunnieTorsoTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(SpringBonnieBunnieTorsoTileEntity animatable) {
		return new ResourceLocation("fnaf_frights", "animations/bonniebunnietorso.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(SpringBonnieBunnieTorsoTileEntity animatable) {
		return new ResourceLocation("fnaf_frights", "geo/bonniebunnietorso.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(SpringBonnieBunnieTorsoTileEntity entity) {
		return new ResourceLocation("fnaf_frights", "textures/blocks/spring_bonnie_fnaf1.png");
	}
}
