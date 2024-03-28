package net.mcreator.fnaffrights.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnaffrights.block.entity.PuppetInTheBoxBlockTileEntity;

public class PuppetInTheBoxBlockBlockModel extends AnimatedGeoModel<PuppetInTheBoxBlockTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(PuppetInTheBoxBlockTileEntity animatable) {
		return new ResourceLocation("fnaf_frights", "animations/jackinboxblockmodel.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(PuppetInTheBoxBlockTileEntity animatable) {
		return new ResourceLocation("fnaf_frights", "geo/jackinboxblockmodel.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(PuppetInTheBoxBlockTileEntity entity) {
		return new ResourceLocation("fnaf_frights", "textures/blocks/jackintheboxpurpler.png");
	}
}
