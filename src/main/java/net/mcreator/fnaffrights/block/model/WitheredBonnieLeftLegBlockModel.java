package net.mcreator.fnaffrights.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnaffrights.block.entity.WitheredBonnieLeftLegTileEntity;

public class WitheredBonnieLeftLegBlockModel extends AnimatedGeoModel<WitheredBonnieLeftLegTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(WitheredBonnieLeftLegTileEntity animatable) {
		return new ResourceLocation("fnaf_frights", "animations/witheredbonnieleftleg.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(WitheredBonnieLeftLegTileEntity animatable) {
		return new ResourceLocation("fnaf_frights", "geo/witheredbonnieleftleg.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(WitheredBonnieLeftLegTileEntity entity) {
		return new ResourceLocation("fnaf_frights", "textures/blocks/witheredbonnietexture.png");
	}
}
