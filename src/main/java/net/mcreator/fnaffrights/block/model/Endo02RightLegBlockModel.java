package net.mcreator.fnaffrights.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnaffrights.block.entity.Endo02RightLegTileEntity;

public class Endo02RightLegBlockModel extends AnimatedGeoModel<Endo02RightLegTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(Endo02RightLegTileEntity animatable) {
		return new ResourceLocation("fnaf_frights", "animations/freddyrightleg.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(Endo02RightLegTileEntity animatable) {
		return new ResourceLocation("fnaf_frights", "geo/freddyrightleg.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(Endo02RightLegTileEntity entity) {
		return new ResourceLocation("fnaf_frights", "textures/blocks/endo02.png");
	}
}
