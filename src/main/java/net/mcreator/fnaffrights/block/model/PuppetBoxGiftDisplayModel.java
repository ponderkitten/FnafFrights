package net.mcreator.fnaffrights.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnaffrights.block.display.PuppetBoxGiftDisplayItem;

public class PuppetBoxGiftDisplayModel extends AnimatedGeoModel<PuppetBoxGiftDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(PuppetBoxGiftDisplayItem animatable) {
		return new ResourceLocation("fnaf_frights", "animations/puppetboxgift.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(PuppetBoxGiftDisplayItem animatable) {
		return new ResourceLocation("fnaf_frights", "geo/puppetboxgift.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(PuppetBoxGiftDisplayItem entity) {
		return new ResourceLocation("fnaf_frights", "textures/blocks/jackintheboxpurpler.png");
	}
}
