package net.mcreator.fnaffrights.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnaffrights.block.display.ADinerChicaActiveDisplayItem;

public class ADinerChicaActiveDisplayModel extends AnimatedGeoModel<ADinerChicaActiveDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(ADinerChicaActiveDisplayItem animatable) {
		return new ResourceLocation("fnaf_frights", "animations/ashowtimedinerchicaactive.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(ADinerChicaActiveDisplayItem animatable) {
		return new ResourceLocation("fnaf_frights", "geo/ashowtimedinerchicaactive.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(ADinerChicaActiveDisplayItem entity) {
		return new ResourceLocation("fnaf_frights", "textures/blocks/dinerchica.png");
	}
}
