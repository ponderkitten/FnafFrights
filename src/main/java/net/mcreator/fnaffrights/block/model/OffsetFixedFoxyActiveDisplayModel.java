package net.mcreator.fnaffrights.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnaffrights.block.display.OffsetFixedFoxyActiveDisplayItem;

public class OffsetFixedFoxyActiveDisplayModel extends AnimatedGeoModel<OffsetFixedFoxyActiveDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(OffsetFixedFoxyActiveDisplayItem animatable) {
		return new ResourceLocation("fnaf_frights", "animations/ofixedfoxypirateshowtimeactive.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(OffsetFixedFoxyActiveDisplayItem animatable) {
		return new ResourceLocation("fnaf_frights", "geo/ofixedfoxypirateshowtimeactive.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(OffsetFixedFoxyActiveDisplayItem entity) {
		return new ResourceLocation("fnaf_frights", "textures/blocks/fixedfoxy.png");
	}
}
