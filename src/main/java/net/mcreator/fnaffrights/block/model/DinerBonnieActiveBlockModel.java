package net.mcreator.fnaffrights.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnaffrights.block.entity.DinerBonnieActiveTileEntity;

public class DinerBonnieActiveBlockModel extends AnimatedGeoModel<DinerBonnieActiveTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(DinerBonnieActiveTileEntity animatable) {
		return new ResourceLocation("fnaf_frights", "animations/showtimedinerbonnieactive.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(DinerBonnieActiveTileEntity animatable) {
		return new ResourceLocation("fnaf_frights", "geo/showtimedinerbonnieactive.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(DinerBonnieActiveTileEntity entity) {
		return new ResourceLocation("fnaf_frights", "textures/blocks/dinerbonnie.png");
	}
}
