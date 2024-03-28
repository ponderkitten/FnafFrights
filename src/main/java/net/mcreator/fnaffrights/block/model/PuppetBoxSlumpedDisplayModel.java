package net.mcreator.fnaffrights.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnaffrights.block.display.PuppetBoxSlumpedDisplayItem;

public class PuppetBoxSlumpedDisplayModel extends AnimatedGeoModel<PuppetBoxSlumpedDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(PuppetBoxSlumpedDisplayItem animatable) {
		return new ResourceLocation("fnaf_frights", "animations/puppetboxslumped.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(PuppetBoxSlumpedDisplayItem animatable) {
		return new ResourceLocation("fnaf_frights", "geo/puppetboxslumped.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(PuppetBoxSlumpedDisplayItem entity) {
		return new ResourceLocation("fnaf_frights", "textures/blocks/jackintheboxpurpler.png");
	}
}
