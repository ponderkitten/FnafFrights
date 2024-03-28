package net.mcreator.fnaffrights.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnaffrights.block.display.PuppetBoxWindingDisplayItem;

public class PuppetBoxWindingDisplayModel extends AnimatedGeoModel<PuppetBoxWindingDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(PuppetBoxWindingDisplayItem animatable) {
		return new ResourceLocation("fnaf_frights", "animations/puppetboxslowwinding.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(PuppetBoxWindingDisplayItem animatable) {
		return new ResourceLocation("fnaf_frights", "geo/puppetboxslowwinding.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(PuppetBoxWindingDisplayItem entity) {
		return new ResourceLocation("fnaf_frights", "textures/blocks/jackintheboxpurpler.png");
	}
}
