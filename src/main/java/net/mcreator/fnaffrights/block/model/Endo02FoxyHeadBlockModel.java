package net.mcreator.fnaffrights.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnaffrights.block.entity.Endo02FoxyHeadTileEntity;

public class Endo02FoxyHeadBlockModel extends AnimatedGeoModel<Endo02FoxyHeadTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(Endo02FoxyHeadTileEntity animatable) {
		return new ResourceLocation("fnaf_frights", "animations/endo02foxy.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(Endo02FoxyHeadTileEntity animatable) {
		return new ResourceLocation("fnaf_frights", "geo/endo02foxy.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(Endo02FoxyHeadTileEntity entity) {
		return new ResourceLocation("fnaf_frights", "textures/blocks/unwithered_foxy.png");
	}
}
