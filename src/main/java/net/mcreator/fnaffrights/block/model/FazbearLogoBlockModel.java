package net.mcreator.fnaffrights.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnaffrights.block.entity.FazbearLogoTileEntity;

public class FazbearLogoBlockModel extends AnimatedGeoModel<FazbearLogoTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(FazbearLogoTileEntity animatable) {
		return new ResourceLocation("fnaf_frights", "animations/fazbearlogoblock.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(FazbearLogoTileEntity animatable) {
		return new ResourceLocation("fnaf_frights", "geo/fazbearlogoblock.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(FazbearLogoTileEntity entity) {
		return new ResourceLocation("fnaf_frights", "textures/blocks/fazbearlogo.png");
	}
}
