package net.mcreator.fnaffrights.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnaffrights.block.display.GlitchBonnieHeadDisplayItem;

public class GlitchBonnieHeadDisplayModel extends AnimatedGeoModel<GlitchBonnieHeadDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(GlitchBonnieHeadDisplayItem animatable) {
		return new ResourceLocation("fnaf_frights", "animations/springbonniehead.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(GlitchBonnieHeadDisplayItem animatable) {
		return new ResourceLocation("fnaf_frights", "geo/springbonniehead.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(GlitchBonnieHeadDisplayItem entity) {
		return new ResourceLocation("fnaf_frights", "textures/blocks/springbonniewithvestandwhiskers.png");
	}
}
