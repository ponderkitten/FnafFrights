package net.mcreator.fnaffrights.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnaffrights.block.entity.ABonnieActiveTileEntity;

public class ABonnieActiveBlockModel extends AnimatedGeoModel<ABonnieActiveTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(ABonnieActiveTileEntity animatable) {
		return new ResourceLocation("fnaf_frights", "animations/abonnieshowtimeactive.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(ABonnieActiveTileEntity animatable) {
		return new ResourceLocation("fnaf_frights", "geo/abonnieshowtimeactive.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(ABonnieActiveTileEntity entity) {
		return new ResourceLocation("fnaf_frights", "textures/blocks/unwithered_bonnie.png");
	}
}
