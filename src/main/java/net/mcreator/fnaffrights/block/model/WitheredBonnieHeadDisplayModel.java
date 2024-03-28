package net.mcreator.fnaffrights.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnaffrights.block.display.WitheredBonnieHeadDisplayItem;

public class WitheredBonnieHeadDisplayModel extends AnimatedGeoModel<WitheredBonnieHeadDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(WitheredBonnieHeadDisplayItem animatable) {
		return new ResourceLocation("fnaf_frights", "animations/witheredbonniehead.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(WitheredBonnieHeadDisplayItem animatable) {
		return new ResourceLocation("fnaf_frights", "geo/witheredbonniehead.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(WitheredBonnieHeadDisplayItem entity) {
		return new ResourceLocation("fnaf_frights", "textures/blocks/witheredbonnietexture.png");
	}
}
