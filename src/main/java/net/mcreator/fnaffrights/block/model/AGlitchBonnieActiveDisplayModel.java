package net.mcreator.fnaffrights.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnaffrights.block.display.AGlitchBonnieActiveDisplayItem;

public class AGlitchBonnieActiveDisplayModel extends AnimatedGeoModel<AGlitchBonnieActiveDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(AGlitchBonnieActiveDisplayItem animatable) {
		return new ResourceLocation("fnaf_frights", "animations/aspringbonnieshowtimeactive.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(AGlitchBonnieActiveDisplayItem animatable) {
		return new ResourceLocation("fnaf_frights", "geo/aspringbonnieshowtimeactive.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(AGlitchBonnieActiveDisplayItem entity) {
		return new ResourceLocation("fnaf_frights", "textures/blocks/springbonniewithvestandwhiskers.png");
	}
}
