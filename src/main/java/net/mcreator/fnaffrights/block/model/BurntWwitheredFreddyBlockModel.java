package net.mcreator.fnaffrights.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnaffrights.block.entity.BurntWwitheredFreddyTileEntity;

public class BurntWwitheredFreddyBlockModel extends AnimatedGeoModel<BurntWwitheredFreddyTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(BurntWwitheredFreddyTileEntity animatable) {
		return new ResourceLocation("fnaf_frights", "animations/witheredfreddy.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(BurntWwitheredFreddyTileEntity animatable) {
		return new ResourceLocation("fnaf_frights", "geo/witheredfreddy.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(BurntWwitheredFreddyTileEntity entity) {
		return new ResourceLocation("fnaf_frights", "textures/blocks/unphantomfreddy.png");
	}
}
