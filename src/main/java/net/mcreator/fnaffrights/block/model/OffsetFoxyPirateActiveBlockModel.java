package net.mcreator.fnaffrights.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnaffrights.block.entity.OffsetFoxyPirateActiveTileEntity;

public class OffsetFoxyPirateActiveBlockModel extends AnimatedGeoModel<OffsetFoxyPirateActiveTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(OffsetFoxyPirateActiveTileEntity animatable) {
		return new ResourceLocation("fnaf_frights", "animations/ofoxypirateshowtimeactive.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(OffsetFoxyPirateActiveTileEntity animatable) {
		return new ResourceLocation("fnaf_frights", "geo/ofoxypirateshowtimeactive.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(OffsetFoxyPirateActiveTileEntity entity) {
		return new ResourceLocation("fnaf_frights", "textures/blocks/foxy.png");
	}
}
