package net.mcreator.fnaffrights.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnaffrights.block.display.FoxyLeftArmDisplayItem;

public class FoxyLeftArmDisplayModel extends AnimatedGeoModel<FoxyLeftArmDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(FoxyLeftArmDisplayItem animatable) {
		return new ResourceLocation("fnaf_frights", "animations/foxyleftarm.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(FoxyLeftArmDisplayItem animatable) {
		return new ResourceLocation("fnaf_frights", "geo/foxyleftarm.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(FoxyLeftArmDisplayItem entity) {
		return new ResourceLocation("fnaf_frights", "textures/blocks/unwithered_foxy.png");
	}
}
