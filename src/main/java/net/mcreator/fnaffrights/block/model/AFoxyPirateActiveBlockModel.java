package net.mcreator.fnaffrights.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnaffrights.block.entity.AFoxyPirateActiveTileEntity;

public class AFoxyPirateActiveBlockModel extends AnimatedGeoModel<AFoxyPirateActiveTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(AFoxyPirateActiveTileEntity animatable) {
		return new ResourceLocation("fnaf_frights", "animations/afoxypirateshowtimeactive.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(AFoxyPirateActiveTileEntity animatable) {
		return new ResourceLocation("fnaf_frights", "geo/afoxypirateshowtimeactive.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(AFoxyPirateActiveTileEntity entity) {
		return new ResourceLocation("fnaf_frights", "textures/blocks/foxy.png");
	}
}
