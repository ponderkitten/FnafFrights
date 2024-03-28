package net.mcreator.fnaffrights.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnaffrights.block.entity.AngledToyCarnieTileEntity;

public class AngledToyCarnieBlockModel extends AnimatedGeoModel<AngledToyCarnieTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(AngledToyCarnieTileEntity animatable) {
		return new ResourceLocation("fnaf_frights", "animations/atoycarnieshowtime.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(AngledToyCarnieTileEntity animatable) {
		return new ResourceLocation("fnaf_frights", "geo/atoycarnieshowtime.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(AngledToyCarnieTileEntity entity) {
		return new ResourceLocation("fnaf_frights", "textures/blocks/legallydistinctcarnie.png");
	}
}
