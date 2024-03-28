package net.mcreator.fnaffrights.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnaffrights.block.entity.OffsetToyFoxyActiveTileEntity;

public class OffsetToyFoxyActiveBlockModel extends AnimatedGeoModel<OffsetToyFoxyActiveTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(OffsetToyFoxyActiveTileEntity animatable) {
		return new ResourceLocation("fnaf_frights", "animations/otoyfoxyshowtimeactive.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(OffsetToyFoxyActiveTileEntity animatable) {
		return new ResourceLocation("fnaf_frights", "geo/otoyfoxyshowtimeactive.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(OffsetToyFoxyActiveTileEntity entity) {
		return new ResourceLocation("fnaf_frights", "textures/blocks/toy_foxy.png");
	}
}
