package net.mcreator.fnaffrights.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnaffrights.block.display.GlitchBonnieTorsoDisplayItem;

public class GlitchBonnieTorsoDisplayModel extends AnimatedGeoModel<GlitchBonnieTorsoDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(GlitchBonnieTorsoDisplayItem animatable) {
		return new ResourceLocation("fnaf_frights", "animations/springbonnietorso.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(GlitchBonnieTorsoDisplayItem animatable) {
		return new ResourceLocation("fnaf_frights", "geo/springbonnietorso.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(GlitchBonnieTorsoDisplayItem entity) {
		return new ResourceLocation("fnaf_frights", "textures/blocks/springbonniewithvestandwhiskers.png");
	}
}
