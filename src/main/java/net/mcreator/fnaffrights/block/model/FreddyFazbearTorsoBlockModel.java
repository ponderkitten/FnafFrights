package net.mcreator.fnaffrights.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnaffrights.block.entity.FreddyFazbearTorsoTileEntity;

public class FreddyFazbearTorsoBlockModel extends AnimatedGeoModel<FreddyFazbearTorsoTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(FreddyFazbearTorsoTileEntity animatable) {
		return new ResourceLocation("fnaf_frights", "animations/freddyfazbeartorso.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(FreddyFazbearTorsoTileEntity animatable) {
		return new ResourceLocation("fnaf_frights", "geo/freddyfazbeartorso.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(FreddyFazbearTorsoTileEntity entity) {
		return new ResourceLocation("fnaf_frights", "textures/blocks/freddyfazbeartexture.png");
	}
}
