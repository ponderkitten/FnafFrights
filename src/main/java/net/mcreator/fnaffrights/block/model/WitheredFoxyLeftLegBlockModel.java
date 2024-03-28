package net.mcreator.fnaffrights.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnaffrights.block.entity.WitheredFoxyLeftLegTileEntity;

public class WitheredFoxyLeftLegBlockModel extends AnimatedGeoModel<WitheredFoxyLeftLegTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(WitheredFoxyLeftLegTileEntity animatable) {
		return new ResourceLocation("fnaf_frights", "animations/foxyrleg.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(WitheredFoxyLeftLegTileEntity animatable) {
		return new ResourceLocation("fnaf_frights", "geo/foxyrleg.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(WitheredFoxyLeftLegTileEntity entity) {
		return new ResourceLocation("fnaf_frights", "textures/blocks/witheredfoxytexture.png");
	}
}
