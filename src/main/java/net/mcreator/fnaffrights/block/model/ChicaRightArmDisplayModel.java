package net.mcreator.fnaffrights.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnaffrights.block.display.ChicaRightArmDisplayItem;

public class ChicaRightArmDisplayModel extends AnimatedGeoModel<ChicaRightArmDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(ChicaRightArmDisplayItem animatable) {
		return new ResourceLocation("fnaf_frights", "animations/chicarightarm.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(ChicaRightArmDisplayItem animatable) {
		return new ResourceLocation("fnaf_frights", "geo/chicarightarm.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(ChicaRightArmDisplayItem entity) {
		return new ResourceLocation("fnaf_frights", "textures/blocks/unwithered_chica.png");
	}
}
