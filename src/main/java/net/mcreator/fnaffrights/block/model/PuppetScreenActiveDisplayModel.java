package net.mcreator.fnaffrights.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnaffrights.block.display.PuppetScreenActiveDisplayItem;

public class PuppetScreenActiveDisplayModel extends AnimatedGeoModel<PuppetScreenActiveDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(PuppetScreenActiveDisplayItem animatable) {
		return new ResourceLocation("fnaf_frights", "animations/puppetscreen1.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(PuppetScreenActiveDisplayItem animatable) {
		return new ResourceLocation("fnaf_frights", "geo/puppetscreen1.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(PuppetScreenActiveDisplayItem entity) {
		return new ResourceLocation("fnaf_frights", "textures/blocks/puppetscreenstatic.png");
	}
}
