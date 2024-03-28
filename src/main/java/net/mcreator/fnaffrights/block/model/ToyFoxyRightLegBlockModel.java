package net.mcreator.fnaffrights.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnaffrights.block.entity.ToyFoxyRightLegTileEntity;

public class ToyFoxyRightLegBlockModel extends AnimatedGeoModel<ToyFoxyRightLegTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(ToyFoxyRightLegTileEntity animatable) {
		return new ResourceLocation("fnaf_frights", "animations/toyfoxyrightleg.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(ToyFoxyRightLegTileEntity animatable) {
		return new ResourceLocation("fnaf_frights", "geo/toyfoxyrightleg.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(ToyFoxyRightLegTileEntity entity) {
		return new ResourceLocation("fnaf_frights", "textures/blocks/toy_foxy.png");
	}
}
