package net.mcreator.fnaffrights.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnaffrights.block.entity.PizzeriaSignTileEntity;

public class PizzeriaSignBlockModel extends AnimatedGeoModel<PizzeriaSignTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(PizzeriaSignTileEntity animatable) {
		return new ResourceLocation("fnaf_frights", "animations/pizzeriasign.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(PizzeriaSignTileEntity animatable) {
		return new ResourceLocation("fnaf_frights", "geo/pizzeriasign.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(PizzeriaSignTileEntity entity) {
		return new ResourceLocation("fnaf_frights", "textures/blocks/movie_sign.png");
	}
}
