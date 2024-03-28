package net.mcreator.fnaffrights.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnaffrights.block.display.AFoxyPirateActiveDisplayItem;

public class AFoxyPirateActiveDisplayModel extends AnimatedGeoModel<AFoxyPirateActiveDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(AFoxyPirateActiveDisplayItem animatable) {
		return new ResourceLocation("fnaf_frights", "animations/afoxypirateshowtimeactive.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(AFoxyPirateActiveDisplayItem animatable) {
		return new ResourceLocation("fnaf_frights", "geo/afoxypirateshowtimeactive.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(AFoxyPirateActiveDisplayItem entity) {
		return new ResourceLocation("fnaf_frights", "textures/blocks/foxy.png");
	}
}
