package net.mcreator.fnaffrights.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnaffrights.block.display.WitheredFoxyHeadDisplayItem;

public class WitheredFoxyHeadDisplayModel extends AnimatedGeoModel<WitheredFoxyHeadDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(WitheredFoxyHeadDisplayItem animatable) {
		return new ResourceLocation("fnaf_frights", "animations/foxy_head.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(WitheredFoxyHeadDisplayItem animatable) {
		return new ResourceLocation("fnaf_frights", "geo/foxy_head.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(WitheredFoxyHeadDisplayItem entity) {
		return new ResourceLocation("fnaf_frights", "textures/blocks/witheredfoxytexture.png");
	}
}
