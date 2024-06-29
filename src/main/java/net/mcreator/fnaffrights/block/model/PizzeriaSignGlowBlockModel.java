package net.mcreator.fnaffrights.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnaffrights.block.entity.PizzeriaSignGlowTileEntity;

public class PizzeriaSignGlowBlockModel extends AnimatedGeoModel<PizzeriaSignGlowTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(PizzeriaSignGlowTileEntity animatable) {
		return new ResourceLocation("fnaf_frights", "animations/pizzeriasign.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(PizzeriaSignGlowTileEntity animatable) {
		return new ResourceLocation("fnaf_frights", "geo/pizzeriasign.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(PizzeriaSignGlowTileEntity entity) {
		return new ResourceLocation("fnaf_frights", "textures/blocks/movie_sign_glow.png");
	}
}
