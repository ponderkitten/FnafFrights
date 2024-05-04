package net.mcreator.fnaffrights.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnaffrights.block.entity.PuppetScreenActiveTileEntity;

public class PuppetScreenActiveBlockModel extends AnimatedGeoModel<PuppetScreenActiveTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(PuppetScreenActiveTileEntity animatable) {
		return new ResourceLocation("fnaf_frights", "animations/puppetscreen1.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(PuppetScreenActiveTileEntity animatable) {
		return new ResourceLocation("fnaf_frights", "geo/puppetscreen1.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(PuppetScreenActiveTileEntity entity) {
		return new ResourceLocation("fnaf_frights", "textures/blocks/puppetscreenstatic.png");
	}
}
