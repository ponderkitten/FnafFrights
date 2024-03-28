package net.mcreator.fnaffrights.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnaffrights.block.display.FreddyFazbearRightLegDisplayItem;

public class FreddyFazbearRightLegDisplayModel extends AnimatedGeoModel<FreddyFazbearRightLegDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(FreddyFazbearRightLegDisplayItem animatable) {
		return new ResourceLocation("fnaf_frights", "animations/freddyfazbearrightleg.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(FreddyFazbearRightLegDisplayItem animatable) {
		return new ResourceLocation("fnaf_frights", "geo/freddyfazbearrightleg.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(FreddyFazbearRightLegDisplayItem entity) {
		return new ResourceLocation("fnaf_frights", "textures/blocks/freddyfazbeartexture.png");
	}
}
