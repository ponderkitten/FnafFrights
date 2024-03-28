package net.mcreator.fnaffrights.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnaffrights.block.entity.WitheredBonnieBlockTileEntity;

public class WitheredBonnieBlockBlockModel extends AnimatedGeoModel<WitheredBonnieBlockTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(WitheredBonnieBlockTileEntity animatable) {
		return new ResourceLocation("fnaf_frights", "animations/witheredbonnieblock.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(WitheredBonnieBlockTileEntity animatable) {
		return new ResourceLocation("fnaf_frights", "geo/witheredbonnieblock.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(WitheredBonnieBlockTileEntity entity) {
		return new ResourceLocation("fnaf_frights", "textures/blocks/witheredbonnietexture.png");
	}
}
