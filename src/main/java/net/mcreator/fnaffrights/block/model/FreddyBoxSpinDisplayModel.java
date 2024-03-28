package net.mcreator.fnaffrights.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnaffrights.block.display.FreddyBoxSpinDisplayItem;

public class FreddyBoxSpinDisplayModel extends AnimatedGeoModel<FreddyBoxSpinDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(FreddyBoxSpinDisplayItem animatable) {
		return new ResourceLocation("fnaf_frights", "animations/freddyboxspin.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(FreddyBoxSpinDisplayItem animatable) {
		return new ResourceLocation("fnaf_frights", "geo/freddyboxspin.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(FreddyBoxSpinDisplayItem entity) {
		return new ResourceLocation("fnaf_frights", "textures/blocks/freddybox.png");
	}
}
