package net.mcreator.fnaffrights.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnaffrights.block.display.WitheredBonnieRightLegDisplayItem;

public class WitheredBonnieRightLegDisplayModel extends AnimatedGeoModel<WitheredBonnieRightLegDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(WitheredBonnieRightLegDisplayItem animatable) {
		return new ResourceLocation("fnaf_frights", "animations/witheredbonnierightleg.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(WitheredBonnieRightLegDisplayItem animatable) {
		return new ResourceLocation("fnaf_frights", "geo/witheredbonnierightleg.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(WitheredBonnieRightLegDisplayItem entity) {
		return new ResourceLocation("fnaf_frights", "textures/blocks/witheredbonnietexture.png");
	}
}
