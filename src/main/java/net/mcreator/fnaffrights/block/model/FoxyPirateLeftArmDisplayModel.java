package net.mcreator.fnaffrights.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnaffrights.block.display.FoxyPirateLeftArmDisplayItem;

public class FoxyPirateLeftArmDisplayModel extends AnimatedGeoModel<FoxyPirateLeftArmDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(FoxyPirateLeftArmDisplayItem animatable) {
		return new ResourceLocation("fnaf_frights", "animations/foxypirateleftarm.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(FoxyPirateLeftArmDisplayItem animatable) {
		return new ResourceLocation("fnaf_frights", "geo/foxypirateleftarm.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(FoxyPirateLeftArmDisplayItem entity) {
		return new ResourceLocation("fnaf_frights", "textures/blocks/fixedfoxy.png");
	}
}
