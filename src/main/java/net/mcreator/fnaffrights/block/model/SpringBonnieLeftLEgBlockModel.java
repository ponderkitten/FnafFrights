package net.mcreator.fnaffrights.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnaffrights.block.entity.SpringBonnieLeftLEgTileEntity;

public class SpringBonnieLeftLEgBlockModel extends AnimatedGeoModel<SpringBonnieLeftLEgTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(SpringBonnieLeftLEgTileEntity animatable) {
		return new ResourceLocation("fnaf_frights", "animations/springbonniesleftleg.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(SpringBonnieLeftLEgTileEntity animatable) {
		return new ResourceLocation("fnaf_frights", "geo/springbonniesleftleg.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(SpringBonnieLeftLEgTileEntity entity) {
		return new ResourceLocation("fnaf_frights", "textures/blocks/springbonnie.png");
	}
}
