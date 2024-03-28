package net.mcreator.fnaffrights.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnaffrights.block.display.WitheredBonnieLeftLegDisplayItem;

public class WitheredBonnieLeftLegDisplayModel extends AnimatedGeoModel<WitheredBonnieLeftLegDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(WitheredBonnieLeftLegDisplayItem animatable) {
		return new ResourceLocation("fnaf_frights", "animations/witheredbonnieleftleg.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(WitheredBonnieLeftLegDisplayItem animatable) {
		return new ResourceLocation("fnaf_frights", "geo/witheredbonnieleftleg.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(WitheredBonnieLeftLegDisplayItem entity) {
		return new ResourceLocation("fnaf_frights", "textures/blocks/witheredbonnietexture.png");
	}
}
