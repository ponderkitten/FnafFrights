package net.mcreator.fnaffrights.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnaffrights.block.entity.WitheredBonnieHeadTileEntity;

public class WitheredBonnieHeadBlockModel extends AnimatedGeoModel<WitheredBonnieHeadTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(WitheredBonnieHeadTileEntity animatable) {
		return new ResourceLocation("fnaf_frights", "animations/witheredbonniehead.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(WitheredBonnieHeadTileEntity animatable) {
		return new ResourceLocation("fnaf_frights", "geo/witheredbonniehead.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(WitheredBonnieHeadTileEntity entity) {
		return new ResourceLocation("fnaf_frights", "textures/blocks/witheredbonnietexture.png");
	}
}
