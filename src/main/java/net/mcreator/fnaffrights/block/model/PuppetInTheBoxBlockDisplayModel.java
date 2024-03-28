package net.mcreator.fnaffrights.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnaffrights.block.display.PuppetInTheBoxBlockDisplayItem;

public class PuppetInTheBoxBlockDisplayModel extends AnimatedGeoModel<PuppetInTheBoxBlockDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(PuppetInTheBoxBlockDisplayItem animatable) {
		return new ResourceLocation("fnaf_frights", "animations/jackinboxblockmodel.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(PuppetInTheBoxBlockDisplayItem animatable) {
		return new ResourceLocation("fnaf_frights", "geo/jackinboxblockmodel.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(PuppetInTheBoxBlockDisplayItem entity) {
		return new ResourceLocation("fnaf_frights", "textures/blocks/jackintheboxpurpler.png");
	}
}
