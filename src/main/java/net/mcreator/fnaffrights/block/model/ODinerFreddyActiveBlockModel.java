package net.mcreator.fnaffrights.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnaffrights.block.entity.ODinerFreddyActiveTileEntity;

public class ODinerFreddyActiveBlockModel extends AnimatedGeoModel<ODinerFreddyActiveTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(ODinerFreddyActiveTileEntity animatable) {
		return new ResourceLocation("fnaf_frights", "animations/oshowtimedinerfreddyactive.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(ODinerFreddyActiveTileEntity animatable) {
		return new ResourceLocation("fnaf_frights", "geo/oshowtimedinerfreddyactive.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(ODinerFreddyActiveTileEntity entity) {
		return new ResourceLocation("fnaf_frights", "textures/blocks/dinerfreddy.png");
	}
}
