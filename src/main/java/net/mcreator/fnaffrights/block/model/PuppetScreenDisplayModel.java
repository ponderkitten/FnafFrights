package net.mcreator.fnaffrights.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnaffrights.block.display.PuppetScreenDisplayItem;

public class PuppetScreenDisplayModel extends AnimatedGeoModel<PuppetScreenDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(PuppetScreenDisplayItem animatable) {
		return new ResourceLocation("fnaf_frights", "animations/puppetscreen.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(PuppetScreenDisplayItem animatable) {
		return new ResourceLocation("fnaf_frights", "geo/puppetscreen.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(PuppetScreenDisplayItem entity) {
		return new ResourceLocation("fnaf_frights", "textures/blocks/puppetscreen.png");
	}
}
