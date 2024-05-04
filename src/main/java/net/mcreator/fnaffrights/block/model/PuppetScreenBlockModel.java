package net.mcreator.fnaffrights.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnaffrights.block.entity.PuppetScreenTileEntity;

public class PuppetScreenBlockModel extends AnimatedGeoModel<PuppetScreenTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(PuppetScreenTileEntity animatable) {
		return new ResourceLocation("fnaf_frights", "animations/puppetscreen.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(PuppetScreenTileEntity animatable) {
		return new ResourceLocation("fnaf_frights", "geo/puppetscreen.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(PuppetScreenTileEntity entity) {
		return new ResourceLocation("fnaf_frights", "textures/blocks/puppetscreen.png");
	}
}
