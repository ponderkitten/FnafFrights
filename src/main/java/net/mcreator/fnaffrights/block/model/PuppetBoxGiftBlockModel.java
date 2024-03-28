package net.mcreator.fnaffrights.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnaffrights.block.entity.PuppetBoxGiftTileEntity;

public class PuppetBoxGiftBlockModel extends AnimatedGeoModel<PuppetBoxGiftTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(PuppetBoxGiftTileEntity animatable) {
		return new ResourceLocation("fnaf_frights", "animations/puppetboxgift.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(PuppetBoxGiftTileEntity animatable) {
		return new ResourceLocation("fnaf_frights", "geo/puppetboxgift.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(PuppetBoxGiftTileEntity entity) {
		return new ResourceLocation("fnaf_frights", "textures/blocks/jackintheboxpurpler.png");
	}
}
