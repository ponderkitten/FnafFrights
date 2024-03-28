package net.mcreator.fnaffrights.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnaffrights.block.display.AFixedFoxyActiveDisplayItem;

public class AFixedFoxyActiveDisplayModel extends AnimatedGeoModel<AFixedFoxyActiveDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(AFixedFoxyActiveDisplayItem animatable) {
		return new ResourceLocation("fnaf_frights", "animations/afixedfoxypirateshowtimeactive.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(AFixedFoxyActiveDisplayItem animatable) {
		return new ResourceLocation("fnaf_frights", "geo/afixedfoxypirateshowtimeactive.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(AFixedFoxyActiveDisplayItem entity) {
		return new ResourceLocation("fnaf_frights", "textures/blocks/fixedfoxy.png");
	}
}
