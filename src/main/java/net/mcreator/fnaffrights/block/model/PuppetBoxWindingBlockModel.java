package net.mcreator.fnaffrights.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnaffrights.block.entity.PuppetBoxWindingTileEntity;

public class PuppetBoxWindingBlockModel extends AnimatedGeoModel<PuppetBoxWindingTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(PuppetBoxWindingTileEntity animatable) {
		return new ResourceLocation("fnaf_frights", "animations/puppetboxslowwinding.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(PuppetBoxWindingTileEntity animatable) {
		return new ResourceLocation("fnaf_frights", "geo/puppetboxslowwinding.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(PuppetBoxWindingTileEntity entity) {
		return new ResourceLocation("fnaf_frights", "textures/blocks/jackintheboxpurpler.png");
	}
}
