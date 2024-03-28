package net.mcreator.fnaffrights.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnaffrights.block.display.ChicaChickenLeftArmDisplayItem;

public class ChicaChickenLeftArmDisplayModel extends AnimatedGeoModel<ChicaChickenLeftArmDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(ChicaChickenLeftArmDisplayItem animatable) {
		return new ResourceLocation("fnaf_frights", "animations/chicachickenleftarm.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(ChicaChickenLeftArmDisplayItem animatable) {
		return new ResourceLocation("fnaf_frights", "geo/chicachickenleftarm.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(ChicaChickenLeftArmDisplayItem entity) {
		return new ResourceLocation("fnaf_frights", "textures/blocks/chica.png");
	}
}
