package net.mcreator.fnaffrights.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnaffrights.block.entity.AToyFoxyActiveTileEntity;

public class AToyFoxyActiveBlockModel extends AnimatedGeoModel<AToyFoxyActiveTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(AToyFoxyActiveTileEntity animatable) {
		return new ResourceLocation("fnaf_frights", "animations/atoyfoxyshowtimeactive.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(AToyFoxyActiveTileEntity animatable) {
		return new ResourceLocation("fnaf_frights", "geo/atoyfoxyshowtimeactive.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(AToyFoxyActiveTileEntity entity) {
		return new ResourceLocation("fnaf_frights", "textures/blocks/toy_foxy.png");
	}
}
