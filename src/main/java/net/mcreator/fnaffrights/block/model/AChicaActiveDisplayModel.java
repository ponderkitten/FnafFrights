package net.mcreator.fnaffrights.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnaffrights.block.display.AChicaActiveDisplayItem;

public class AChicaActiveDisplayModel extends AnimatedGeoModel<AChicaActiveDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(AChicaActiveDisplayItem animatable) {
		return new ResourceLocation("fnaf_frights", "animations/achicashowtimeactive.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(AChicaActiveDisplayItem animatable) {
		return new ResourceLocation("fnaf_frights", "geo/achicashowtimeactive.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(AChicaActiveDisplayItem entity) {
		return new ResourceLocation("fnaf_frights", "textures/blocks/unwithered_chica.png");
	}
}
