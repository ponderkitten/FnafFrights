package net.mcreator.fnaffrights.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnaffrights.block.display.WitheredFoxyBlockDisplayItem;

public class WitheredFoxyBlockDisplayModel extends AnimatedGeoModel<WitheredFoxyBlockDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(WitheredFoxyBlockDisplayItem animatable) {
		return new ResourceLocation("fnaf_frights", "animations/witheredfoxyblock.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(WitheredFoxyBlockDisplayItem animatable) {
		return new ResourceLocation("fnaf_frights", "geo/witheredfoxyblock.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(WitheredFoxyBlockDisplayItem entity) {
		return new ResourceLocation("fnaf_frights", "textures/blocks/witheredfoxytexture.png");
	}
}
