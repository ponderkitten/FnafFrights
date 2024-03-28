package net.mcreator.fnaffrights.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnaffrights.block.entity.FreddyFazbearheadTileEntity;

public class FreddyFazbearheadBlockModel extends AnimatedGeoModel<FreddyFazbearheadTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(FreddyFazbearheadTileEntity animatable) {
		return new ResourceLocation("fnaf_frights", "animations/freddyfazbearhead.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(FreddyFazbearheadTileEntity animatable) {
		return new ResourceLocation("fnaf_frights", "geo/freddyfazbearhead.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(FreddyFazbearheadTileEntity entity) {
		return new ResourceLocation("fnaf_frights", "textures/blocks/freddyfazbeartexture.png");
	}
}
