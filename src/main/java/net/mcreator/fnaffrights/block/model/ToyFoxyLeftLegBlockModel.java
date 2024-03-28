package net.mcreator.fnaffrights.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnaffrights.block.entity.ToyFoxyLeftLegTileEntity;

public class ToyFoxyLeftLegBlockModel extends AnimatedGeoModel<ToyFoxyLeftLegTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(ToyFoxyLeftLegTileEntity animatable) {
		return new ResourceLocation("fnaf_frights", "animations/toyfoxyleftleg.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(ToyFoxyLeftLegTileEntity animatable) {
		return new ResourceLocation("fnaf_frights", "geo/toyfoxyleftleg.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(ToyFoxyLeftLegTileEntity entity) {
		return new ResourceLocation("fnaf_frights", "textures/blocks/toy_foxy.png");
	}
}
