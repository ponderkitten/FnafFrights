package net.mcreator.fnaffrights.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnaffrights.block.display.ChristmasFoxyADisplayItem;

public class ChristmasFoxyADisplayModel extends AnimatedGeoModel<ChristmasFoxyADisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(ChristmasFoxyADisplayItem animatable) {
		return new ResourceLocation("fnaf_frights", "animations/fixedfoxypirateshowtimeactive.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(ChristmasFoxyADisplayItem animatable) {
		return new ResourceLocation("fnaf_frights", "geo/fixedfoxypirateshowtimeactive.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(ChristmasFoxyADisplayItem entity) {
		return new ResourceLocation("fnaf_frights", "textures/blocks/christmasfoxy.png");
	}
}
