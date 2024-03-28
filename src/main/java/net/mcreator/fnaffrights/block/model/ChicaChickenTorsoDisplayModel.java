package net.mcreator.fnaffrights.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnaffrights.block.display.ChicaChickenTorsoDisplayItem;

public class ChicaChickenTorsoDisplayModel extends AnimatedGeoModel<ChicaChickenTorsoDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(ChicaChickenTorsoDisplayItem animatable) {
		return new ResourceLocation("fnaf_frights", "animations/chicachickentorso.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(ChicaChickenTorsoDisplayItem animatable) {
		return new ResourceLocation("fnaf_frights", "geo/chicachickentorso.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(ChicaChickenTorsoDisplayItem entity) {
		return new ResourceLocation("fnaf_frights", "textures/blocks/chica.png");
	}
}
