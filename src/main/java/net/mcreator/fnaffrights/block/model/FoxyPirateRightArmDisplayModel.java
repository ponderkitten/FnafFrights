package net.mcreator.fnaffrights.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnaffrights.block.display.FoxyPirateRightArmDisplayItem;

public class FoxyPirateRightArmDisplayModel extends AnimatedGeoModel<FoxyPirateRightArmDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(FoxyPirateRightArmDisplayItem animatable) {
		return new ResourceLocation("fnaf_frights", "animations/foxypiraterightarm.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(FoxyPirateRightArmDisplayItem animatable) {
		return new ResourceLocation("fnaf_frights", "geo/foxypiraterightarm.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(FoxyPirateRightArmDisplayItem entity) {
		return new ResourceLocation("fnaf_frights", "textures/blocks/fixedfoxy.png");
	}
}
