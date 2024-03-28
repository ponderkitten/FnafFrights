package net.mcreator.fnaffrights.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnaffrights.block.entity.FreddyFazbeareftLegTileEntity;

public class FreddyFazbeareftLegBlockModel extends AnimatedGeoModel<FreddyFazbeareftLegTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(FreddyFazbeareftLegTileEntity animatable) {
		return new ResourceLocation("fnaf_frights", "animations/freddyfazbearleftleg.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(FreddyFazbeareftLegTileEntity animatable) {
		return new ResourceLocation("fnaf_frights", "geo/freddyfazbearleftleg.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(FreddyFazbeareftLegTileEntity entity) {
		return new ResourceLocation("fnaf_frights", "textures/blocks/freddyfazbeartexture.png");
	}
}
