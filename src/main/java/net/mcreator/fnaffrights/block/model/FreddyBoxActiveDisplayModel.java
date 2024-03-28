package net.mcreator.fnaffrights.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnaffrights.block.display.FreddyBoxActiveDisplayItem;

public class FreddyBoxActiveDisplayModel extends AnimatedGeoModel<FreddyBoxActiveDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(FreddyBoxActiveDisplayItem animatable) {
		return new ResourceLocation("fnaf_frights", "animations/freddyboxactive.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(FreddyBoxActiveDisplayItem animatable) {
		return new ResourceLocation("fnaf_frights", "geo/freddyboxactive.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(FreddyBoxActiveDisplayItem entity) {
		return new ResourceLocation("fnaf_frights", "textures/blocks/freddybox.png");
	}
}
