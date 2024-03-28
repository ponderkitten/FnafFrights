package net.mcreator.fnaffrights.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnaffrights.block.entity.ToyCarnieActiveTileEntity;

public class ToyCarnieActiveBlockModel extends AnimatedGeoModel<ToyCarnieActiveTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(ToyCarnieActiveTileEntity animatable) {
		return new ResourceLocation("fnaf_frights", "animations/toyfreddyshowtimeactive.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(ToyCarnieActiveTileEntity animatable) {
		return new ResourceLocation("fnaf_frights", "geo/toyfreddyshowtimeactive.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(ToyCarnieActiveTileEntity entity) {
		return new ResourceLocation("fnaf_frights", "textures/blocks/legallydistinctcarnie.png");
	}
}
