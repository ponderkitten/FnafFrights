package net.mcreator.fnaffrights.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnaffrights.block.entity.ToyBonnieLeftLegTileEntity;

public class ToyBonnieLeftLegBlockModel extends AnimatedGeoModel<ToyBonnieLeftLegTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(ToyBonnieLeftLegTileEntity animatable) {
		return new ResourceLocation("fnaf_frights", "animations/toybonnieleftleg.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(ToyBonnieLeftLegTileEntity animatable) {
		return new ResourceLocation("fnaf_frights", "geo/toybonnieleftleg.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(ToyBonnieLeftLegTileEntity entity) {
		return new ResourceLocation("fnaf_frights", "textures/blocks/toy_bonnie.png");
	}
}
