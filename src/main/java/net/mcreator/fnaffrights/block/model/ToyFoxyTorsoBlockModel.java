package net.mcreator.fnaffrights.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnaffrights.block.entity.ToyFoxyTorsoTileEntity;

public class ToyFoxyTorsoBlockModel extends AnimatedGeoModel<ToyFoxyTorsoTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(ToyFoxyTorsoTileEntity animatable) {
		return new ResourceLocation("fnaf_frights", "animations/toyfoxytorso.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(ToyFoxyTorsoTileEntity animatable) {
		return new ResourceLocation("fnaf_frights", "geo/toyfoxytorso.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(ToyFoxyTorsoTileEntity entity) {
		return new ResourceLocation("fnaf_frights", "textures/blocks/toy_foxy.png");
	}
}
