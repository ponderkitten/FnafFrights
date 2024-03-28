package net.mcreator.fnaffrights.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnaffrights.block.entity.AToyBonnieShowtimeTileEntity;

public class AToyBonnieShowtimeBlockModel extends AnimatedGeoModel<AToyBonnieShowtimeTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(AToyBonnieShowtimeTileEntity animatable) {
		return new ResourceLocation("fnaf_frights", "animations/atoybonnieshowtime.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(AToyBonnieShowtimeTileEntity animatable) {
		return new ResourceLocation("fnaf_frights", "geo/atoybonnieshowtime.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(AToyBonnieShowtimeTileEntity entity) {
		return new ResourceLocation("fnaf_frights", "textures/blocks/toy_bonnie.png");
	}
}
