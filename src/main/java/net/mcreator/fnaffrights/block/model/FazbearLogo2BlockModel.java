package net.mcreator.fnaffrights.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnaffrights.block.entity.FazbearLogo2TileEntity;

public class FazbearLogo2BlockModel extends AnimatedGeoModel<FazbearLogo2TileEntity> {
	@Override
	public ResourceLocation getAnimationResource(FazbearLogo2TileEntity animatable) {
		return new ResourceLocation("fnaf_frights", "animations/fazbearlogoblock.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(FazbearLogo2TileEntity animatable) {
		return new ResourceLocation("fnaf_frights", "geo/fazbearlogoblock.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(FazbearLogo2TileEntity entity) {
		return new ResourceLocation("fnaf_frights", "textures/blocks/fazbearlogo2.png");
	}
}
