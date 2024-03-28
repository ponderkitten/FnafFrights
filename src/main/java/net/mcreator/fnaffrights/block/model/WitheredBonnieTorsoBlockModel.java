package net.mcreator.fnaffrights.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnaffrights.block.entity.WitheredBonnieTorsoTileEntity;

public class WitheredBonnieTorsoBlockModel extends AnimatedGeoModel<WitheredBonnieTorsoTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(WitheredBonnieTorsoTileEntity animatable) {
		return new ResourceLocation("fnaf_frights", "animations/witheredbonnietorso.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(WitheredBonnieTorsoTileEntity animatable) {
		return new ResourceLocation("fnaf_frights", "geo/witheredbonnietorso.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(WitheredBonnieTorsoTileEntity entity) {
		return new ResourceLocation("fnaf_frights", "textures/blocks/witheredbonnietexture.png");
	}
}
