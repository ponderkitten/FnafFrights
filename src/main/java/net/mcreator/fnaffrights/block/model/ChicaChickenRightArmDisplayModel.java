package net.mcreator.fnaffrights.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnaffrights.block.display.ChicaChickenRightArmDisplayItem;

public class ChicaChickenRightArmDisplayModel extends AnimatedGeoModel<ChicaChickenRightArmDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(ChicaChickenRightArmDisplayItem animatable) {
		return new ResourceLocation("fnaf_frights", "animations/chicachickenrightarm.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(ChicaChickenRightArmDisplayItem animatable) {
		return new ResourceLocation("fnaf_frights", "geo/chicachickenrightarm.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(ChicaChickenRightArmDisplayItem entity) {
		return new ResourceLocation("fnaf_frights", "textures/blocks/chica.png");
	}
}
