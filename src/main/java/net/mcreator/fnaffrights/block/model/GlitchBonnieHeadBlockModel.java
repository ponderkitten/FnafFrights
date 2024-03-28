package net.mcreator.fnaffrights.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnaffrights.block.entity.GlitchBonnieHeadTileEntity;

public class GlitchBonnieHeadBlockModel extends AnimatedGeoModel<GlitchBonnieHeadTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(GlitchBonnieHeadTileEntity animatable) {
		return new ResourceLocation("fnaf_frights", "animations/springbonniehead.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(GlitchBonnieHeadTileEntity animatable) {
		return new ResourceLocation("fnaf_frights", "geo/springbonniehead.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(GlitchBonnieHeadTileEntity entity) {
		return new ResourceLocation("fnaf_frights", "textures/blocks/springbonniewithvestandwhiskers.png");
	}
}
