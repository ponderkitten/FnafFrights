package net.mcreator.fnaffrights.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnaffrights.block.entity.WitheredChicaRightLegTileEntity;

public class WitheredChicaRightLegBlockModel extends AnimatedGeoModel<WitheredChicaRightLegTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(WitheredChicaRightLegTileEntity animatable) {
		return new ResourceLocation("fnaf_frights", "animations/witheredchicarightleg.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(WitheredChicaRightLegTileEntity animatable) {
		return new ResourceLocation("fnaf_frights", "geo/witheredchicarightleg.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(WitheredChicaRightLegTileEntity entity) {
		return new ResourceLocation("fnaf_frights", "textures/blocks/witheredchicatexture.png");
	}
}
