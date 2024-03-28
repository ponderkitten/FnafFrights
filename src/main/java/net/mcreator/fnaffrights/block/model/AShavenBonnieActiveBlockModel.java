package net.mcreator.fnaffrights.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnaffrights.block.entity.AShavenBonnieActiveTileEntity;

public class AShavenBonnieActiveBlockModel extends AnimatedGeoModel<AShavenBonnieActiveTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(AShavenBonnieActiveTileEntity animatable) {
		return new ResourceLocation("fnaf_frights", "animations/abonnieshowtimeactive.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(AShavenBonnieActiveTileEntity animatable) {
		return new ResourceLocation("fnaf_frights", "geo/abonnieshowtimeactive.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(AShavenBonnieActiveTileEntity entity) {
		return new ResourceLocation("fnaf_frights", "textures/blocks/unbonnie.png");
	}
}
