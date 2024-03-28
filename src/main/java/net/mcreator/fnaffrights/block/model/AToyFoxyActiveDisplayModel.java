package net.mcreator.fnaffrights.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnaffrights.block.display.AToyFoxyActiveDisplayItem;

public class AToyFoxyActiveDisplayModel extends AnimatedGeoModel<AToyFoxyActiveDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(AToyFoxyActiveDisplayItem animatable) {
		return new ResourceLocation("fnaf_frights", "animations/atoyfoxyshowtimeactive.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(AToyFoxyActiveDisplayItem animatable) {
		return new ResourceLocation("fnaf_frights", "geo/atoyfoxyshowtimeactive.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(AToyFoxyActiveDisplayItem entity) {
		return new ResourceLocation("fnaf_frights", "textures/blocks/toy_foxy.png");
	}
}
