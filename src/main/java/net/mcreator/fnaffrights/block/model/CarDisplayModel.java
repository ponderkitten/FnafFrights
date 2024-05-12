package net.mcreator.fnaffrights.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnaffrights.block.display.CarDisplayItem;

public class CarDisplayModel extends AnimatedGeoModel<CarDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(CarDisplayItem animatable) {
		return new ResourceLocation("fnaf_frights", "animations/off_roader_body.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(CarDisplayItem animatable) {
		return new ResourceLocation("fnaf_frights", "geo/off_roader_body.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(CarDisplayItem entity) {
		return new ResourceLocation("fnaf_frights", "textures/blocks/truck.png");
	}
}
