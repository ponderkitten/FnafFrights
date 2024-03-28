package net.mcreator.fnaffrights.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnaffrights.block.entity.ToyFoxyLeftArmTileEntity;

public class ToyFoxyLeftArmBlockModel extends AnimatedGeoModel<ToyFoxyLeftArmTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(ToyFoxyLeftArmTileEntity animatable) {
		return new ResourceLocation("fnaf_frights", "animations/toyfoxyleftarm.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(ToyFoxyLeftArmTileEntity animatable) {
		return new ResourceLocation("fnaf_frights", "geo/toyfoxyleftarm.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(ToyFoxyLeftArmTileEntity entity) {
		return new ResourceLocation("fnaf_frights", "textures/blocks/toy_foxy.png");
	}
}
