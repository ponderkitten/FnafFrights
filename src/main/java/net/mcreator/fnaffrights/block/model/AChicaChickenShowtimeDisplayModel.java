package net.mcreator.fnaffrights.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnaffrights.block.display.AChicaChickenShowtimeDisplayItem;

public class AChicaChickenShowtimeDisplayModel extends AnimatedGeoModel<AChicaChickenShowtimeDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(AChicaChickenShowtimeDisplayItem animatable) {
		return new ResourceLocation("fnaf_frights", "animations/aclassicchicashowtime.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(AChicaChickenShowtimeDisplayItem animatable) {
		return new ResourceLocation("fnaf_frights", "geo/aclassicchicashowtime.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(AChicaChickenShowtimeDisplayItem entity) {
		return new ResourceLocation("fnaf_frights", "textures/blocks/chica.png");
	}
}
