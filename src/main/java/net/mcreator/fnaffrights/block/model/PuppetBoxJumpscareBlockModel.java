package net.mcreator.fnaffrights.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnaffrights.block.entity.PuppetBoxJumpscareTileEntity;

public class PuppetBoxJumpscareBlockModel extends AnimatedGeoModel<PuppetBoxJumpscareTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(PuppetBoxJumpscareTileEntity animatable) {
		return new ResourceLocation("fnaf_frights", "animations/puppetboxjumpscare.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(PuppetBoxJumpscareTileEntity animatable) {
		return new ResourceLocation("fnaf_frights", "geo/puppetboxjumpscare.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(PuppetBoxJumpscareTileEntity entity) {
		return new ResourceLocation("fnaf_frights", "textures/blocks/jackintheboxpurpler.png");
	}
}
