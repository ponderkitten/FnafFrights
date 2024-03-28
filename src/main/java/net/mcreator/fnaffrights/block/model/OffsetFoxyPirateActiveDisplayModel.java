package net.mcreator.fnaffrights.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnaffrights.block.display.OffsetFoxyPirateActiveDisplayItem;

public class OffsetFoxyPirateActiveDisplayModel extends AnimatedGeoModel<OffsetFoxyPirateActiveDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(OffsetFoxyPirateActiveDisplayItem animatable) {
		return new ResourceLocation("fnaf_frights", "animations/ofoxypirateshowtimeactive.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(OffsetFoxyPirateActiveDisplayItem animatable) {
		return new ResourceLocation("fnaf_frights", "geo/ofoxypirateshowtimeactive.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(OffsetFoxyPirateActiveDisplayItem entity) {
		return new ResourceLocation("fnaf_frights", "textures/blocks/foxy.png");
	}
}
