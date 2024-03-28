package net.mcreator.fnaffrights.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnaffrights.block.display.PuppetBoxJumpscareDisplayItem;

public class PuppetBoxJumpscareDisplayModel extends AnimatedGeoModel<PuppetBoxJumpscareDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(PuppetBoxJumpscareDisplayItem animatable) {
		return new ResourceLocation("fnaf_frights", "animations/puppetboxjumpscare.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(PuppetBoxJumpscareDisplayItem animatable) {
		return new ResourceLocation("fnaf_frights", "geo/puppetboxjumpscare.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(PuppetBoxJumpscareDisplayItem entity) {
		return new ResourceLocation("fnaf_frights", "textures/blocks/jackintheboxpurpler.png");
	}
}
