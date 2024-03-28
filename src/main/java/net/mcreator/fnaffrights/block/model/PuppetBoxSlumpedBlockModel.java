package net.mcreator.fnaffrights.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnaffrights.block.entity.PuppetBoxSlumpedTileEntity;

public class PuppetBoxSlumpedBlockModel extends AnimatedGeoModel<PuppetBoxSlumpedTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(PuppetBoxSlumpedTileEntity animatable) {
		return new ResourceLocation("fnaf_frights", "animations/puppetboxslumped.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(PuppetBoxSlumpedTileEntity animatable) {
		return new ResourceLocation("fnaf_frights", "geo/puppetboxslumped.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(PuppetBoxSlumpedTileEntity entity) {
		return new ResourceLocation("fnaf_frights", "textures/blocks/jackintheboxpurpler.png");
	}
}
