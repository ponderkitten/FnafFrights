package net.mcreator.fnaffrights.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnaffrights.block.display.FreddyFazbearheadDisplayItem;

public class FreddyFazbearheadDisplayModel extends AnimatedGeoModel<FreddyFazbearheadDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(FreddyFazbearheadDisplayItem animatable) {
		return new ResourceLocation("fnaf_frights", "animations/freddyfazbearhead.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(FreddyFazbearheadDisplayItem animatable) {
		return new ResourceLocation("fnaf_frights", "geo/freddyfazbearhead.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(FreddyFazbearheadDisplayItem entity) {
		return new ResourceLocation("fnaf_frights", "textures/blocks/freddyfazbeartexture.png");
	}
}
