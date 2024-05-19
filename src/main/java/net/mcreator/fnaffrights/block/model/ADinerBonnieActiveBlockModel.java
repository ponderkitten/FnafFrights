package net.mcreator.fnaffrights.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnaffrights.block.entity.ADinerBonnieActiveTileEntity;

public class ADinerBonnieActiveBlockModel extends AnimatedGeoModel<ADinerBonnieActiveTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(ADinerBonnieActiveTileEntity animatable) {
		return new ResourceLocation("fnaf_frights", "animations/ashowtimedinerbonnieactive.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(ADinerBonnieActiveTileEntity animatable) {
		return new ResourceLocation("fnaf_frights", "geo/ashowtimedinerbonnieactive.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(ADinerBonnieActiveTileEntity entity) {
		return new ResourceLocation("fnaf_frights", "textures/blocks/dinerbonnie.png");
	}
}
