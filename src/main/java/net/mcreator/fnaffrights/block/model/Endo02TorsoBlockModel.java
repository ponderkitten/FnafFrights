package net.mcreator.fnaffrights.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnaffrights.block.entity.Endo02TorsoTileEntity;

public class Endo02TorsoBlockModel extends AnimatedGeoModel<Endo02TorsoTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(Endo02TorsoTileEntity animatable) {
		return new ResourceLocation("fnaf_frights", "animations/freddytorso.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(Endo02TorsoTileEntity animatable) {
		return new ResourceLocation("fnaf_frights", "geo/freddytorso.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(Endo02TorsoTileEntity entity) {
		return new ResourceLocation("fnaf_frights", "textures/blocks/endo02.png");
	}
}
