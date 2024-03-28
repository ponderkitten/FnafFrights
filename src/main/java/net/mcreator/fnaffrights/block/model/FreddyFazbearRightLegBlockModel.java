package net.mcreator.fnaffrights.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnaffrights.block.entity.FreddyFazbearRightLegTileEntity;

public class FreddyFazbearRightLegBlockModel extends AnimatedGeoModel<FreddyFazbearRightLegTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(FreddyFazbearRightLegTileEntity animatable) {
		return new ResourceLocation("fnaf_frights", "animations/freddyfazbearrightleg.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(FreddyFazbearRightLegTileEntity animatable) {
		return new ResourceLocation("fnaf_frights", "geo/freddyfazbearrightleg.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(FreddyFazbearRightLegTileEntity entity) {
		return new ResourceLocation("fnaf_frights", "textures/blocks/freddyfazbeartexture.png");
	}
}
