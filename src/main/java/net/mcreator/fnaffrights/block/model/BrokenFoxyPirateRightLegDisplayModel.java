package net.mcreator.fnaffrights.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnaffrights.block.display.BrokenFoxyPirateRightLegDisplayItem;

public class BrokenFoxyPirateRightLegDisplayModel extends AnimatedGeoModel<BrokenFoxyPirateRightLegDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(BrokenFoxyPirateRightLegDisplayItem animatable) {
		return new ResourceLocation("fnaf_frights", "animations/foxypiraterightleg.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(BrokenFoxyPirateRightLegDisplayItem animatable) {
		return new ResourceLocation("fnaf_frights", "geo/foxypiraterightleg.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(BrokenFoxyPirateRightLegDisplayItem entity) {
		return new ResourceLocation("fnaf_frights", "textures/blocks/foxy.png");
	}
}
