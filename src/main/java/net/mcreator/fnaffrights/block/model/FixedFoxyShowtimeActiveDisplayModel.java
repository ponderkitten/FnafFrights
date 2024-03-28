package net.mcreator.fnaffrights.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnaffrights.block.display.FixedFoxyShowtimeActiveDisplayItem;

public class FixedFoxyShowtimeActiveDisplayModel extends AnimatedGeoModel<FixedFoxyShowtimeActiveDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(FixedFoxyShowtimeActiveDisplayItem animatable) {
		return new ResourceLocation("fnaf_frights", "animations/fixedfoxypirateshowtimeactive.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(FixedFoxyShowtimeActiveDisplayItem animatable) {
		return new ResourceLocation("fnaf_frights", "geo/fixedfoxypirateshowtimeactive.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(FixedFoxyShowtimeActiveDisplayItem entity) {
		return new ResourceLocation("fnaf_frights", "textures/blocks/fixedfoxy.png");
	}
}
