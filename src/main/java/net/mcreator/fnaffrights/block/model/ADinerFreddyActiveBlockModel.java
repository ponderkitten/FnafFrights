package net.mcreator.fnaffrights.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnaffrights.block.entity.ADinerFreddyActiveTileEntity;

public class ADinerFreddyActiveBlockModel extends AnimatedGeoModel<ADinerFreddyActiveTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(ADinerFreddyActiveTileEntity animatable) {
		return new ResourceLocation("fnaf_frights", "animations/ashowtimedinerfreddyactive.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(ADinerFreddyActiveTileEntity animatable) {
		return new ResourceLocation("fnaf_frights", "geo/ashowtimedinerfreddyactive.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(ADinerFreddyActiveTileEntity entity) {
		return new ResourceLocation("fnaf_frights", "textures/blocks/dinerfreddy.png");
	}
}
