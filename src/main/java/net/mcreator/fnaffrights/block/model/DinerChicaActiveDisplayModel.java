package net.mcreator.fnaffrights.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnaffrights.block.display.DinerChicaActiveDisplayItem;

public class DinerChicaActiveDisplayModel extends AnimatedGeoModel<DinerChicaActiveDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(DinerChicaActiveDisplayItem animatable) {
		return new ResourceLocation("fnaf_frights", "animations/showtimedinerchicaactive.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(DinerChicaActiveDisplayItem animatable) {
		return new ResourceLocation("fnaf_frights", "geo/showtimedinerchicaactive.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(DinerChicaActiveDisplayItem entity) {
		return new ResourceLocation("fnaf_frights", "textures/blocks/dinerchica.png");
	}
}
