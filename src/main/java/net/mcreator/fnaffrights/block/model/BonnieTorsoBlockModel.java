package net.mcreator.fnaffrights.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnaffrights.block.entity.BonnieTorsoTileEntity;

public class BonnieTorsoBlockModel extends AnimatedGeoModel<BonnieTorsoTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(BonnieTorsoTileEntity animatable) {
		return new ResourceLocation("fnaf_frights", "animations/witheredbonnietorso.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(BonnieTorsoTileEntity animatable) {
		return new ResourceLocation("fnaf_frights", "geo/witheredbonnietorso.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(BonnieTorsoTileEntity entity) {
		return new ResourceLocation("fnaf_frights", "textures/blocks/unwithered_bonnie.png");
	}
}
