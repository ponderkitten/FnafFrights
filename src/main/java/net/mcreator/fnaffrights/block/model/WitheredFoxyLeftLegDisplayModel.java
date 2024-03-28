package net.mcreator.fnaffrights.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnaffrights.block.display.WitheredFoxyLeftLegDisplayItem;

public class WitheredFoxyLeftLegDisplayModel extends AnimatedGeoModel<WitheredFoxyLeftLegDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(WitheredFoxyLeftLegDisplayItem animatable) {
		return new ResourceLocation("fnaf_frights", "animations/foxyrleg.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(WitheredFoxyLeftLegDisplayItem animatable) {
		return new ResourceLocation("fnaf_frights", "geo/foxyrleg.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(WitheredFoxyLeftLegDisplayItem entity) {
		return new ResourceLocation("fnaf_frights", "textures/blocks/witheredfoxytexture.png");
	}
}
