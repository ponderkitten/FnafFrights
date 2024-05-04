package net.mcreator.fnaffrights.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnaffrights.block.entity.BurntMangleTileEntity;

public class BurntMangleBlockModel extends AnimatedGeoModel<BurntMangleTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(BurntMangleTileEntity animatable) {
		return new ResourceLocation("fnaf_frights", "animations/mangle.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(BurntMangleTileEntity animatable) {
		return new ResourceLocation("fnaf_frights", "geo/mangle.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(BurntMangleTileEntity entity) {
		return new ResourceLocation("fnaf_frights", "textures/blocks/image.png");
	}
}
