package net.mcreator.fnaffrights.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnaffrights.block.display.BurntWwitheredFreddyDisplayItem;

public class BurntWwitheredFreddyDisplayModel extends AnimatedGeoModel<BurntWwitheredFreddyDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(BurntWwitheredFreddyDisplayItem animatable) {
		return new ResourceLocation("fnaf_frights", "animations/witheredfreddy.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(BurntWwitheredFreddyDisplayItem animatable) {
		return new ResourceLocation("fnaf_frights", "geo/witheredfreddy.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(BurntWwitheredFreddyDisplayItem entity) {
		return new ResourceLocation("fnaf_frights", "textures/blocks/unphantomfreddy.png");
	}
}
