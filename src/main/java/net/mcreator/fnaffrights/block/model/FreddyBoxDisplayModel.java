package net.mcreator.fnaffrights.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnaffrights.block.display.FreddyBoxDisplayItem;

public class FreddyBoxDisplayModel extends AnimatedGeoModel<FreddyBoxDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(FreddyBoxDisplayItem animatable) {
		return new ResourceLocation("fnaf_frights", "animations/freddybox.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(FreddyBoxDisplayItem animatable) {
		return new ResourceLocation("fnaf_frights", "geo/freddybox.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(FreddyBoxDisplayItem entity) {
		return new ResourceLocation("fnaf_frights", "textures/blocks/freddybox.png");
	}
}
