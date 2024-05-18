package net.mcreator.fnaffrights.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnaffrights.block.entity.DinerFreddyActiveTileEntity;

public class DinerFreddyActiveBlockModel extends AnimatedGeoModel<DinerFreddyActiveTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(DinerFreddyActiveTileEntity animatable) {
		return new ResourceLocation("fnaf_frights", "animations/showtimedinerfreddyactive.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(DinerFreddyActiveTileEntity animatable) {
		return new ResourceLocation("fnaf_frights", "geo/showtimedinerfreddyactive.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(DinerFreddyActiveTileEntity entity) {
		return new ResourceLocation("fnaf_frights", "textures/blocks/dinerfreddy.png");
	}
}
