package net.mcreator.fnaffrights.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnaffrights.block.display.FoxyPirateRightLegDisplayItem;

public class FoxyPirateRightLegDisplayModel extends AnimatedGeoModel<FoxyPirateRightLegDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(FoxyPirateRightLegDisplayItem animatable) {
		return new ResourceLocation("fnaf_frights", "animations/foxypiraterightleg.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(FoxyPirateRightLegDisplayItem animatable) {
		return new ResourceLocation("fnaf_frights", "geo/foxypiraterightleg.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(FoxyPirateRightLegDisplayItem entity) {
		return new ResourceLocation("fnaf_frights", "textures/blocks/fixedfoxy.png");
	}
}
