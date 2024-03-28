package net.mcreator.fnaffrights.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnaffrights.block.entity.ToyBonnieTorsoTileEntity;

public class ToyBonnieTorsoBlockModel extends AnimatedGeoModel<ToyBonnieTorsoTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(ToyBonnieTorsoTileEntity animatable) {
		return new ResourceLocation("fnaf_frights", "animations/toybonnietorso.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(ToyBonnieTorsoTileEntity animatable) {
		return new ResourceLocation("fnaf_frights", "geo/toybonnietorso.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(ToyBonnieTorsoTileEntity entity) {
		return new ResourceLocation("fnaf_frights", "textures/blocks/toy_bonnie.png");
	}
}
